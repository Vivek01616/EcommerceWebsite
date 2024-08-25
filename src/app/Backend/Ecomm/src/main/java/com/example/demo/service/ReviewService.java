package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Reviews;
import com.example.demo.repo.ReviewRepository;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    // Create a new review
    public Reviews createReview(Reviews review) {
        return reviewRepository.save(review);
    }

    // Retrieve a review by ID
    public Reviews getReviewById(Long id) {
        Optional<Reviews> review = reviewRepository.findById(id);
        return review.orElseThrow(() -> new RuntimeException("Review not found with id: " + id));
    }

    // Retrieve all reviews
    public List<Reviews> getAllReviews() {
        return reviewRepository.findAll();
    }

    // Retrieve all reviews by a specific user
    public List<Reviews> getReviewsByUserId(Long userId) {
        return reviewRepository.findByUserId(userId);
    }

    // Retrieve all reviews for a specific product
    public List<Reviews> getReviewsByProductId(Long productId) {
        return reviewRepository.findByProductId(productId);
    }

    // Update an existing review
    public Reviews updateReview(Long id, Reviews reviewDetails) {
        Reviews review = getReviewById(id);
        review.setUser(reviewDetails.getUser());
        review.setProduct(reviewDetails.getProduct());

        return reviewRepository.save(review);
    }

    // Delete a review by ID
    public void deleteReview(Long id) {
        Reviews review = getReviewById(id);
        reviewRepository.delete(review);
    }
}
