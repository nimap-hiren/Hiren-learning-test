package DesignPatterns.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// PaymentContext.java
@Component
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    @Autowired
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
