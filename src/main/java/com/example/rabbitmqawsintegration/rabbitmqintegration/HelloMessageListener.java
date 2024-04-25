package com.example.rabbitmqawsintegration.rabbitmqintegration;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class HelloMessageListener {

    @RabbitListener(queues = "hello_queue")
    public void receiveMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
