package DesignPatterns.strategy.Observer;

import DesignPatterns.strategy.Observer.Observer;
import org.springframework.stereotype.Component;

// EmailSubscriber.java
@Component
public class EmailSubscriber implements Observer {
    @Override
    public void update(String product) {
        System.out.println("Email sent: New product added - " + product);
    }
}

