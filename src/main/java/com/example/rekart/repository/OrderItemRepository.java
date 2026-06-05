package com.example.rekart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rekart.entity.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}