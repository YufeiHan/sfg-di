package com.example.sfgdi.service;

import org.springframework.stereotype.Component;

// default is singleton
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating a Singleton bean!!!");
    }

    public String getMyScope(){
        return "I'm a Singleton";
    }
}
