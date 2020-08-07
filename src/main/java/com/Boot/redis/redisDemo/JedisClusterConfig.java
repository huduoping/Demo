//package com.Boot.redis.redisDemo;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import redis.clients.jedis.JedisCluster;
//import redis.clients.jedis.HostAndPort;
//
//import java.util.HashSet;
//import java.util.Set;
//
//@Configuration
//public class JedisClusterConfig {
//
//    @Autowired
//    private RedisConfig redisConfig;
//
//
//    public JedisCluster getJedisCluster(){
//        String [] serverArray=redisConfig.getCluster().getNodes().split(",");
//        Set<HostAndPort> nodes=new HashSet<>();
//
//        for (String ipPort:serverArray){
//            String [] ipPortPair=ipPort.split(":");
//            nodes.add(new HostAndPort(ipPortPair[0].trim(),Integer.parseInt(ipPortPair[1].trim())));
//
//        }
//
//        return  new JedisCluster(nodes,redisConfig.getCommandTimeout());
//    }
//
//
//}
