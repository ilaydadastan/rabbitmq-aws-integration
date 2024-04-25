package com.example.rabbitmqawsintegration.rabbitmqintegration;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    private final HelloMessagePublisher messagePublisher;

    @Autowired
    public HelloController(HelloMessagePublisher messagePublisher) {
        this.messagePublisher = messagePublisher;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestBody String message) {
        messagePublisher.sendMessage(message);
        return "Sent message: " + message;
    }
}

