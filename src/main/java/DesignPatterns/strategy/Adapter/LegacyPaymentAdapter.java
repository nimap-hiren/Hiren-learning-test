package DesignPatterns.strategy.Adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// LegacyPaymentAdapter.java
@Component
public class LegacyPaymentAdapter implements NewPaymentGateway {

    @Autowired
    private LegacyPaymentGateway legacyPaymentGateway;

    @Override
    public void processPayment(double amount) {
        legacyPaymentGateway.pay(amount);
    }
}
