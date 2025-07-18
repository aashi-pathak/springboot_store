package com.springboot.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args); //Application context is IOC container, its a storage for our objects
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
