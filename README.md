Table of Contents([中文说明](./README.zh_CN.md))
=================

   * [1. Gadget-etcd](#1-gadget-etcd)
      * [1.1. Brief introduction](#11-brief-introduction)
      * [1.2. Requirements](#12-requirements)
      * [1.3. Maven dependency](#13-maven-dependency)
      * [1.4. Install from source code](#14-install-from-source-code)
   * [2. Usage](#2-usage)
      * [2.1. Client builder](#21-client-builder)
      * [2.2. Standalone usage](#22-standalone-usage)
      * [2.3. DNS SRV](#23-dns-srv)
      * [2.4. Watch](#24-watch)

# 1. Gadget-etcd  
## 1.1. Brief introduction  
[![Build Status](https://travis-ci.org/nextopcn/gadget-etcd.svg?branch=master)](https://travis-ci.org/nextopcn/gadget-etcd)
[![Coverage Status](https://coveralls.io/repos/github/nextopcn/gadget-etcd/badge.svg?branch=master)](https://coveralls.io/github/nextopcn/gadget-etcd?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.nextop/gadget-etcd/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cn.nextop/gadget-etcd)
[![Hex.pm](https://img.shields.io/hexpm/l/plug.svg?maxAge=2592000)](https://github.com/nextopcn/gadget-etcd/blob/master/LICENSE)  
  
An etcd v3 client written by Java.  

## 1.2. Requirements  
jdk 1.8+  
maven-3.3.1+  

## 1.3. Maven dependency

```xml  
    <dependency>
        <groupId>cn.nextop</groupId>
        <artifactId>gadget-etcd</artifactId>
        <version>1.0.0-RC2</version>
    </dependency>
```

## 1.4. Install from source code  

``` 
    $mvn clean install -Dmaven.test.skip=true
```  

# 2. Usage  
## 2.1. Client builder  

```java  
final String[] endpoints = new String[]{ "http://192.168.1.100:2379", 
    "http://192.168.1.101:2379", "http://192.168.1.102:2379" };
    
final ClientImpl.Builder builder = ClientImpl.builder();
final NameResolverFactory factory = new NameResolverFactory(endpoints);
builder.setNameResolverFactory(factory); 
Client client = builder.build("my client");
```

## 2.2. Standalone usage  

```java  

final String[] endpoints = new String[]{ "http://192.168.1.100:2379", 
    "http://192.168.1.101:2379", "http://192.168.1.102:2379" };
    
final ClientImpl.Builder builder = ClientImpl.builder();
final NameResolverFactory factory = new NameResolverFactory(endpoints);
builder.setNameResolverFactory(factory); 
Client client = builder.build("my client");

KV kv = client.getKV();

PutRequest.Builder request = PutRequest.newBuilder();
request.setKey(ByteString.copyFrom("key".getBytes()));
request.setValue(ByteString.copyFrom("value".getBytes()));
		
CompletableFuture<PutResponse> future = kv.put(request.build());
// your code goes here. 

```

## 2.3. DNS SRV  
  
```java  

final String[] endpoints = new String[]{ "dns+srv://etcd.company.cn" };
    
final ClientImpl.Builder builder = ClientImpl.builder();
final NameResolverFactory factory = new NameResolverFactory(endpoints);
builder.setNameResolverFactory(factory); 
Client client = builder.build("my client");
// your code goes here.
```

## 2.4. Watch

```java  

final String[] endpoints = new String[]{ "dns+srv://etcd.company.cn" };

final ClientImpl.Builder builder = ClientImpl.builder();
final NameResolverFactory factory = new NameResolverFactory(endpoints);
builder.setNameResolverFactory(factory);
Client client = builder.build("my client");
Watch watch = client.getWatch();
// request
WatchRequest.Builder request = WatchRequest.newBuilder();
WatchCreateRequest.Builder create = WatchCreateRequest.newBuilder();
create.setKey(ByteString.copyFrom("key".getBytes())).build();
request.setCreateRequest(create.build());
// watch
Watcher<List<Event>> watcher = watch.watch(request.build(), new WatchListener<List<Event>>() {
	@Override
	public void onWatched(CompletableFuture<List<Event>> future) {
		try {
			List<Event> events = future.get();
			// your code goes here.
		} catch (Throwable e) {

		}
	}
}, r -> r.getEventsList());

// your other business

watcher.close();
    
```
