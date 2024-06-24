package com.javatechie.querydsl.AOP;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.javatechie.querydsl.AOP.*.*(..))")
    public void beforeMethodExecution() {
        System.out.println("Before method execution...");
    }
}
