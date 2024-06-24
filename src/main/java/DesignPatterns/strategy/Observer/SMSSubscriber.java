package DesignPatterns.strategy.Observer;

import org.springframework.stereotype.Component;

// SMSSubscriber.java
@Component
public class SMSSubscriber implements Observer {
    @Override
    public void update(String product) {
        System.out.println("SMS sent: New product added - " + product);
    }
}
