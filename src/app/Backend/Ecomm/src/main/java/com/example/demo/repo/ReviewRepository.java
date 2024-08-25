package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Long> {
    // Custom query method to find all reviews by a specific user
    List<Reviews> findByUserId(Long userId);

    // Custom query method to find all reviews for a specific product
    List<Reviews> findByProductId(Long productId);
}
