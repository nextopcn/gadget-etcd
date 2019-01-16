package cn.nextop.gadget.etcd;

/**
 * @author Baoyi Chen
 */
public interface Client extends AutoCloseable {
	
	/**
	 * 
	 */
	KV getKV();
	
	Auth getAuth(); Lock getLock();
	
	User getUser(); Role getRole();
	
	Lease getLease(); Watch getWatch();
	
	Cluster getCluster(); Maintenance getMaintenance();
	
	/**
	 * 
	 */
	interface Stub { String getName(); Client getClient(); }
}
