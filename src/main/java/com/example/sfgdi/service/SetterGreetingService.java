package com.example.sfgdi.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello from SetterGreetingService";
    }
}
