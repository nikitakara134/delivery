package com.example.delivery.repository;

import com.example.delivery.model.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder, Long> {
    List<DeliveryOrder> findByCustomerName(String customerName);
}