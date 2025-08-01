package com.platform.order.controller;

import com.platform.order.kafka.OrderProducer;
import com.platform.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderProducer producer;

    @PostMapping
    public String createOrder(@RequestBody Order order) {
        producer.sendOrderEvent(order);
        return "Order created and event sent to Kafka!";
    }
}
