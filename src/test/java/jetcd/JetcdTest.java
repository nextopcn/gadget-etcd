/*
 * Copyright 2016-2017 Leon Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jetcd;

import java.util.concurrent.TimeUnit;

import cn.nextop.gadget.etcd.grpc.KeyValue;

/**
 * @author Baoyi Chen
 */
public class JetcdTest {
	public static void main(String[] args) throws Exception {
		try(Jetcd jetcd = new Jetcd("dns+srv://your.etcd.com")) {
			long st = System.currentTimeMillis();
			long id = jetcd.lease(15).get(6, TimeUnit.SECONDS).getID();
			System.out.println("lease: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			id = jetcd.lease(15).get(6, TimeUnit.SECONDS).getID();
			System.out.println("lease: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			id = jetcd.lease(15).get(6, TimeUnit.SECONDS).getID();
			System.out.println("lease: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			id = jetcd.lease(15).get(6, TimeUnit.SECONDS).getID();
			System.out.println("lease: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			boolean succeeded = jetcd.tryLock("sss", "0", id).get(6, TimeUnit.SECONDS).getSucceeded();
			System.out.println(succeeded);
			System.out.println("lock: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			long ttl = jetcd.renewal(id).get(6, TimeUnit.SECONDS).getTTL();
			System.out.println(ttl);
			System.out.println("renewal: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			boolean r = jetcd.revoke(id).get(6, TimeUnit.SECONDS) != null;
			System.out.println(r);
			System.out.println("revoke: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			KeyValue kv = jetcd.put("key", "value".getBytes()).get(6, TimeUnit.SECONDS).getPrevKv();
			if (kv != null) {
				System.out.println(new String(kv.getKey().toByteArray()));
				System.out.println(new String(kv.getValue().toByteArray()));
			}
			System.out.println("put: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			kv = jetcd.get("key").get(6, TimeUnit.SECONDS).getKvsList().get(0);
			if (kv != null) {
				System.out.println(new String(kv.getKey().toByteArray()));
				System.out.println(new String(kv.getValue().toByteArray()));
			}
			System.out.println("get: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
			kv = jetcd.del("key").get(6, TimeUnit.SECONDS).getPrevKvsList().get(0);
			if (kv != null) {
				System.out.println(new String(kv.getKey().toByteArray()));
				System.out.println(new String(kv.getValue().toByteArray()));
			}
			System.out.println("del: " + (System.currentTimeMillis() - st));
			st = System.currentTimeMillis();
		}
	}
}
