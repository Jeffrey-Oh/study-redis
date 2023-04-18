package com.study.redis.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class ChatService implements MessageListener {

    @Autowired
    private RedisMessageListenerContainer container;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    public void enterChatRoom(String chatRoomName) {
        System.out.println("ChatRoomName : " + chatRoomName);
        container.addMessageListener(this, new ChannelTopic(chatRoomName));

        Scanner in = new Scanner(System.in);
        while(in.hasNextLine()) {
            String line = in.nextLine();
            if (line.equals("q")) {
                System.out.println("Quit..");
                break;
            }

            // 입력한 내용이 있다면 redis 를 통해 보낸다
            redisTemplate.convertAndSend(chatRoomName, line);
        }

        // 채팅방을 나갈 때 리스너를 제거
        container.removeMessageListener(this);
    }

    @Override
    public void onMessage(Message message, byte[] pattern) {
        System.out.println("Message : " + message.toString());
    }

}
