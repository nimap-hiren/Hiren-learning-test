package com.javatechie.querydsl.AOP;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public void doSomething() {
        System.out.println("Doing something...");
    }

    public void doAnotherThing() {
        System.out.println("Doing another thing...");
    }
}
