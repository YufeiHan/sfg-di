package com.example.sfgdi.controllers;

import com.example.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
// i18n is a common abbreviation for internationalization
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
