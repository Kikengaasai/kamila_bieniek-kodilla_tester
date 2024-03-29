package com.kodilla.spring.basic.spring_dependecy_injection;

import org.springframework.stereotype.Component;
@Component
public class EmailMessageService implements MessageService {
    @Override
    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " via Email";
    }
}
