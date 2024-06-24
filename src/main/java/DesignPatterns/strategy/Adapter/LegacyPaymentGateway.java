package DesignPatterns.strategy.Adapter;

import org.springframework.stereotype.Component;

// LegacyPaymentGateway.java
@Component
public class LegacyPaymentGateway {
    public void pay(double amount) {
        // Legacy logic for payment processing
        System.out.println("Paid $" + amount + " using Legacy Payment Gateway.");
    }
}
