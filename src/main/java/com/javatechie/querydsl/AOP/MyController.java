package com.javatechie.querydsl.AOP;

import com.javatechie.querydsl.AOP.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/dosomething")
    public String doSomething() {
        myService.doSomething();
        return "Something done.";
    }

    @GetMapping("/doanotherthing")
    public String doAnotherThing() {
        myService.doAnotherThing();
        return "Another thing done.";
    }
}
