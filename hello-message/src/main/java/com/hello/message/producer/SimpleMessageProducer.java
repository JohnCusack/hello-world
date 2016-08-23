package com.hello.message.producer;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by Nico on 8/23/16 15:47.
 */
@Component
public class SimpleMessageProducer {
    @Resource
    private AmqpTemplate amqpTemplate;

    public void sendMessage(String queueKey, Object object) {
        amqpTemplate.convertAndSend(queueKey, object);
    }
}
