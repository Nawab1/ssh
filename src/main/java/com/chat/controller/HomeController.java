package com.chat.controller;

import com.chat.model.MessageEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @MessageMapping("/msg")
    @SendTo("/send/return-to")
    public MessageEntity msg(@RequestBody MessageEntity messageEntity){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return messageEntity;
    }
}
