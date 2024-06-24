package DesignPatterns.strategy;

import org.springframework.stereotype.Component;

// CreditCardPaymentStrategy.java
@Component
public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        // Logic for credit card payment
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

