package com.kodilla.spring.basic.spring_dependecy_injection;

import com.kodilla.spring.basic.spring_dependecy_injection.MessageService;
import org.springframework.stereotype.Component;

@Component
public class FacebookMessageService implements MessageService {

    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Facebook";
    }
}