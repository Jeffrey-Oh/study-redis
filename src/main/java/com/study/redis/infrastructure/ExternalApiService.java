package com.study.redis.infrastructure;

import org.springframework.stereotype.Service;

@Service
public class ExternalApiService {

    public String getUserName(String userId) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting userName from other service..");
        return userId.equals("A") ? "Adam" : "Bob";
    }

    public int getUserAge(String userId) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Getting userAge from other service..");
        return userId.equals("A") ? 28 : 32;
    }

}
