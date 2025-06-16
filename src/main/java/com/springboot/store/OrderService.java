package com.springboot.store;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10);
    }
}

// OrderService is tightly coupled to StripePaymentService
// we can't test OrderService in isolation
// If we plan to bring another payment method we need to modify OrderService
