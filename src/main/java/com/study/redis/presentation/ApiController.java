package com.study.redis.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    StringRedisTemplate redisTemplate;

    @GetMapping("/set-fruit")
    public String setFruit(@RequestParam String name) {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        ops.set("fruit", name);
        return "saved.";
    }

    @GetMapping("/get-fruit")
    public String getFruit() {
        ValueOperations<String, String> ops = redisTemplate.opsForValue();
        return ops.get("fruit");
    }

}
