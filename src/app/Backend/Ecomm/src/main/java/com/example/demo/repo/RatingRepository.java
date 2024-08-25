package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Ratings;

public interface RatingRepository extends JpaRepository<Ratings, Long> {
    // Custom query method to find all ratings by a specific user
    List<Ratings> findByUserId(Long userId);

    // Custom query method to find all ratings for a specific product
    List<Ratings> findByProductId(Long productId);
}
