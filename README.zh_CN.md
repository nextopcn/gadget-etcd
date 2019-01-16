内容索引([Table of Contents](./README.md))  
=================

   * [1. Gadget-etcd](#1-gadget-etcd)
      * [1.1. 简介](#11-简介)
      * [1.2. 安装前置条件](#12-安装前置条件)
      * [1.3. Maven依赖](#13-maven依赖)
      * [1.4. 从源码安装到本地Maven仓库](#14-从源码安装到本地maven仓库)
   * [2. 用法](#2-用法)
      * [2.1. Client builder](#21-client-builder)
      * [2.2. 单独使用](#22-单独使用)
      * [2.3. DNS SRV](#23-dns-srv)
      * [2.4. Watch](#24-watch)

# 1. Gadget-etcd  
## 1.1. Brief introduction  
[![Build Status](https://travis-ci.org/nextopcn/gedget-etcd.svg?branch=master)](https://travis-ci.org/nextopcn/gedget-etcd)
[![Coverage Status](https://coveralls.io/repos/github/nextopcn/gedget-etcd/badge.svg?branch=master)](https://coveralls.io/github/nextopcn/gedget-etcd?branch=master)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/cn.nextop/gedget-etcd/badge.svg)](https://maven-badges.herokuapp.com/maven-central/cn.nextop/gedget-etcd)
[![Javadocs](http://www.javadoc.io/badge/cn.nextop/gedget-etcd.svg)](http://www.javadoc.io/doc/cn.nextop/gedget-etcd)
[![Hex.pm](https://img.shields.io/hexpm/l/plug.svg?maxAge=2592000)](https://github.com/nextopcn/gedget-etcd/blob/master/LICENSE)  
  
Java实现的etcd v3客户端.  

## 1.2. 安装前置条件  
jdk 1.8+  
maven-3.3.1+  

## 1.3. Maven依赖

```xml  
    <dependency>
        <groupId>cn.nextop</groupId>
        <artifactId>gedget-etcd</artifactId>
        <version>1.0.0-RC1</version>
    </dependency>
```

## 1.4. 从源码安装到本地Maven仓库  

``` 
    $mvn clean install -Dmaven.test.skip=true
```  

# 2. 用法  
## 2.1. Client builder  

```java  
final String[] endpoints = new String[]{ "http://192.168.1.100:2379", 
    "http://192.168.1.101:2379", "http://192.168.1.102:2379" };
    
final ClientImpl.Builder builder = ClientImpl.builder();
final NameResolverFactory factory = new NameResolverFactory(endpoints);
builder.setNameResolverFactory(factory); 
Client client = builder.build("my client");
```

## 2.2. 单独使用  

```java  

final String[] endpoints = new String[]{ "http://192.168.1.100:2379", 
    "http://192.168.1.101:2379", "http://192.168.1.102:2379" };
    
final ClientImpl.Builder builder = ClientImpl.builder();
final NameResolverFactory factory = new NameResolverFactory(endpoints);
builder.setNameResolverFactory(factory); 
Client client = builder.build("my client");

KV kv = client.getKV();

PutRequest.Builder request = PutRequest.newBuilder();
builder.setKey(ByteString.copyFrom("key".getBytes()));
builder.setValue(ByteString.copyFrom("value".getBytes()));
		
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
