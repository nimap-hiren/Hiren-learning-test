package DesignPatterns.strategy.Adapter;

import DesignPatterns.strategy.PaymentContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// PaymentController.java
@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentContext paymentContext;

    @PostMapping("/creditcard")
    public ResponseEntity<String> payWithCreditCard(@RequestParam double amount) {
        paymentContext.executePayment(amount);
        return ResponseEntity.ok("Payment processed with Credit Card.");
    }

    // Endpoint to add a new product to the catalog


    @Autowired
    private NewPaymentGateway newPaymentGateway;

    @PostMapping("/processPayment")
    public ResponseEntity<String> processPayment(@RequestParam double amount) {
        newPaymentGateway.processPayment(amount);
        return ResponseEntity.ok("Payment processed using new payment gateway.");
    }
}
