package com.Boot.redis.redisLettuce;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.data.redis.RedisAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import java.io.Serializable;

/*
自定义Reids的Template
默认情况下的模板只能支持RedisTemplate<String, String>，也就是只能存入字符串，这在开发中是不友好的，所以自定义模板是很有必要的，
当自定义了模板又想使用String存储这时候就可以使用StringRedisTemplate的方式，它们之间并不冲突。
 */

@Configuration
/**
 *  @AutoConfigureAfter 在加载配置的类之后再加载当前类
 */
@AutoConfigureAfter(RedisAutoConfiguration.class)
public class RedisCacheAutoConfiguration {

    /**
      *@Bean 告诉spring该方法返回一个Bean
     */
    @Bean
    public RedisTemplate<String, Serializable> redisCacheTemplate(LettuceConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Serializable> template = new RedisTemplate<>();
        //键的序列化方式
        template.setKeySerializer(new StringRedisSerializer());
        //值的序列化方式
        template.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}
