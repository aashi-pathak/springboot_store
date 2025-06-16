package com.springboot.store;

public class OrderService {
    public void placeOrder() {
        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);
    }
}

// OrderService is tightly coupled to StripePaymentService
// we can't test OrderService in isolation
// If we plan to bring another payment method we need to modify OrderService
