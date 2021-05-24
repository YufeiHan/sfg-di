package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingService;
import com.example.sfgdi.services.PropertyGreetingService;
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