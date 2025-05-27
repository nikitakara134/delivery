package com.example.delivery.controller;

import com.example.delivery.model.DeliveryOrder;
import com.example.delivery.service.DeliveryOrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class DeliveryOrderController {
    private final DeliveryOrderService orderService;

    public DeliveryOrderController(DeliveryOrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public DeliveryOrder placeOrder(@RequestBody DeliveryOrder order) {
        return orderService.placeOrder(order);
    }

    @GetMapping("/by-customer")
    public List<DeliveryOrder> getOrdersByCustomer(@RequestParam String customerName) {
        return orderService.getOrdersByCustomer(customerName);
    }
}