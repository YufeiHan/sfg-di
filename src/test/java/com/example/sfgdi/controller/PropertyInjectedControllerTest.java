package com.example.sfgdi.controller;

import com.example.sfgdi.service.PropertyGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println("Property: " + controller.getGreeting());
    }
}