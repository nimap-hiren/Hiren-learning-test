package DesignPatterns.strategy;

import org.springframework.stereotype.Component;

// PayPalPaymentStrategy.java
@Component
public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Logic for PayPal payment
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}
