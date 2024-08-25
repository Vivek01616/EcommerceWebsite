package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Custom query method to find all orders by a specific user
    List<Order> findByUserId(Long userId);
}

