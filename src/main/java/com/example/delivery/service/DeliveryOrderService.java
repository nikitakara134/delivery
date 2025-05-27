package com.example.delivery.service;

import com.example.delivery.model.DeliveryOrder;
import com.example.delivery.repository.DeliveryOrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryOrderService {
    private final DeliveryOrderRepository orderRepository;

    public DeliveryOrderService(DeliveryOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public DeliveryOrder placeOrder(DeliveryOrder order) {
        return orderRepository.save(order);
    }

    public List<DeliveryOrder> getOrdersByCustomer(String customerName) {
        return orderRepository.findByCustomerName(customerName);
    }
}