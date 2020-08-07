package com.Boot.redis.redisLettuce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/redis")
public class UserCacheController {
    @Autowired
    private RedisTemplate<String, Serializable> redisCacheTemplate;

    @GetMapping(value = "/redisLettuce")
    @ResponseBody
    public Map<String, Object> cacheUser() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", "000000");
        result.put("msg", "success");
        redisCacheTemplate.opsForValue().set("result", (Serializable) result);
        HashMap map = (HashMap)redisCacheTemplate.opsForValue().get("result");
        System.out.println(map.get("code"));
        return result;
    }


}
