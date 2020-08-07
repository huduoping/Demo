package com.Boot.redis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 24649
 */
@Controller
@RequestMapping("/redis")
public class RedisController {
    private static final Logger LOG = LoggerFactory.getLogger(RedisController.class);
    public StringRedisTemplate srt;

    @Autowired
    public RedisController(StringRedisTemplate srt){
        this.srt = srt;
    }

    @RequestMapping("/add")
    public String addObj(){
        srt.opsForValue().set("onePece","那斯拉夫");
        return "/index";
    }

    @RequestMapping("/get")
    public String getSome(Model model){
       String s = srt.opsForValue().get("onePece");
        LOG.info("取出的值为"+s);
        return "/index";
    }

}
