package jetcd;

import static cn.nextop.gadget.etcd.grpc.Compare.CompareResult.EQUAL;
import static cn.nextop.gadget.etcd.grpc.Compare.CompareTarget.CREATE;
import static cn.nextop.gadget.etcd.grpc.Compare.CompareTarget.VALUE;
import static com.google.protobuf.ByteString.copyFrom;

import com.google.protobuf.ByteString;

import cn.nextop.gadget.etcd.grpc.Compare;
import cn.nextop.gadget.etcd.grpc.DeleteRangeRequest;
import cn.nextop.gadget.etcd.grpc.LeaseGrantRequest;
import cn.nextop.gadget.etcd.grpc.LeaseKeepAliveRequest;
import cn.nextop.gadget.etcd.grpc.LeaseRevokeRequest;
import cn.nextop.gadget.etcd.grpc.LeaseTimeToLiveRequest;
import cn.nextop.gadget.etcd.grpc.PutRequest;
import cn.nextop.gadget.etcd.grpc.RangeRequest;
import cn.nextop.gadget.etcd.grpc.RequestOp;
import cn.nextop.gadget.etcd.grpc.TxnRequest;
import cn.nextop.gadget.etcd.grpc.lock.LockRequest;
import cn.nextop.gadget.etcd.grpc.lock.UnlockRequest;

/**
 * @author Baoyi Chen
 */
public final class Requests {
	
	/**
	 * Lease
	 */
	public static LeaseGrantRequest toLeaseGrantRequest(long ttl) {
		return LeaseGrantRequest.newBuilder().setTTL(ttl).build();
	}
	
	public static LeaseRevokeRequest toLeaseRevokeRequest(long leaseId) {
		return LeaseRevokeRequest.newBuilder().setID(leaseId).build();
	}
	
	public static LeaseKeepAliveRequest toLeaseKeepAliveRequest(long leaseId) {
		return LeaseKeepAliveRequest.newBuilder().setID(leaseId).build();
	}
	
	public static LeaseTimeToLiveRequest toLeaseTimeToLiveRequest(long leaseId) {
		return LeaseTimeToLiveRequest.newBuilder().setID(leaseId).build();
	}
	
	/**
	 * KV
	 */
	public static RangeRequest toRangeRequest(String key) {
		return RangeRequest.newBuilder().setKey(copyFrom(key.getBytes())).build();
	}
	
	public static PutRequest toPutRequest(String key, byte[] value, Long leaseId, boolean prev) {
		PutRequest.Builder builder = PutRequest.newBuilder();
		builder.setKey(copyFrom(key.getBytes())).setValue(copyFrom(value));
		if (leaseId != null) builder.setLease(leaseId); builder.setPrevKv(prev); return builder.build();
	}
	
	public static DeleteRangeRequest toDeleteRangeRequest(String key, boolean prev) {
		return DeleteRangeRequest.newBuilder().setKey(copyFrom(key.getBytes())).setPrevKv(prev).build();
	}
	
	/**
	 * Lock
	 */
	public static UnlockRequest toUnlockRequest(String key) {
		return UnlockRequest.newBuilder().setKey(copyFrom(key.getBytes())).build();
	}
	
	public static LockRequest toLockRequest (String key, long leaseId) {
		return LockRequest.newBuilder().setName(copyFrom(key.getBytes())).setLease(leaseId).build();
	}
	
	public static TxnRequest toUnlockRequest(String key, String value) {
		final TxnRequest.Builder r = TxnRequest.newBuilder();
		final ByteString k = copyFrom(key.getBytes()), v = copyFrom(value.getBytes());
		r.addCompare(Compare.newBuilder().setKey(k).setValue(v).setResult(EQUAL).setTarget(VALUE).build());
		r.addSuccess(RequestOp.newBuilder().setRequestDeleteRange(toDeleteRangeRequest(key, false)).build());
		return r.build();
	}
	
	public static TxnRequest toTryLockRequest(String key, String value, long leaseId) {
		TxnRequest.Builder r = TxnRequest.newBuilder(); ByteString k = copyFrom(key.getBytes());
		r.addCompare(Compare.newBuilder().setKey(k).setCreateRevision(0).setResult(EQUAL).setTarget(CREATE).build());
		r.addSuccess(RequestOp.newBuilder().setRequestPut(toPutRequest(key, value.getBytes(), leaseId, false)).build());
		return r.build();
	}
}
