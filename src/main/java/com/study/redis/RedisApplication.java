package com.study.redis;

import com.study.redis.application.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RedisApplication implements CommandLineRunner {

    @Autowired
    private ChatService chatService;

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Application started..");

        chatService.enterChatRoom("chat1");
    }
}
