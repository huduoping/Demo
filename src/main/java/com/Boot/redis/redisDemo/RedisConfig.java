//package com.Boot.redis.redisDemo;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.context.properties.NestedConfigurationProperty;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConfigurationProperties(prefix = "spring.redis")
//public class RedisConfig {
//
//    @NestedConfigurationProperty
//    private Cluster cluster = new Cluster();
//
//    public Cluster getCluster() {
//        return cluster;
//    }
//
//    public void setCluster(Cluster cluster) {
//        this.cluster = cluster;
//    }
//
//    private int commandTimeout;
//
//
//    public int getCommandTimeout() {
//        return commandTimeout;
//    }
//
//    public void setCommandTimeout(int commandTimeout) {
//        this.commandTimeout = commandTimeout;
//    }
//
//
//
//
//}
