//package com.Boot.redis.redisDemo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import redis.clients.jedis.JedisCluster;
//
//@RestController
//@RequestMapping(value = "/test")
//public class TestRedisController {
//
//    @Autowired
//    JedisClusterConfig jedisClusterConfig;
//
//    @GetMapping(value = "/testSet")
//    public Object testSet(){
//        JedisCluster jedis = jedisClusterConfig.getJedisCluster();
//        jedis.set("name","hdp");
//        System.out.println(jedis.get("name"));
//        return jedis.get("name");
//    }
//
//}
