package com.springboot.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private PaymentService paymentService;

    @Autowired // used when multiple constructors
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public OrderService(PaymentService paymentService, int x) {}


    public void placeOrder() {
        paymentService.processPayment(10);
    }
}

// OrderService is tightly coupled to StripePaymentService
// we can't test OrderService in isolation
// If we plan to bring another payment method we need to modify OrderService
