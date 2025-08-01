package com.platform.order.kafka;

import com.platform.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {

    private static final String TOPIC = "order_created";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendOrderEvent(Order order) {
        String message = String.format("Order: %s, %s, %d, %s",
                order.getOrderId(), order.getProduct(), order.getQuantity(), order.getCustomerLocation());
        kafkaTemplate.send(TOPIC, message);
    }
}
