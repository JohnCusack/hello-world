package com.hello.message.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

/**
 * Created by Nico on 8/23/16 15:42.
 */
@Component
public class SimpleMessageListener {
    public void onMessage(Object message) {
        System.out.println(message);
    }
}
