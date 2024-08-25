package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ratings;
import com.example.demo.repo.RatingRepository;

@Service
public class RatingsService {

    @Autowired
    private RatingRepository ratingsRepository;

    // Create a new rating
    public Ratings createRating(Ratings rating) {
        return ratingsRepository.save(rating);
    }

    // Retrieve a rating by ID
    public Ratings getRatingById(Long id) {
        Optional<Ratings> rating = ratingsRepository.findById(id);
        return rating.orElseThrow(() -> new RuntimeException("Rating not found with id: " + id));
    }

    // Retrieve all ratings
    public List<Ratings> getAllRatings() {
        return ratingsRepository.findAll();
    }

    // Retrieve ratings by user ID
    public List<Ratings> getRatingsByUserId(Long userId) {
        return ratingsRepository.findByUserId(userId);
    }

    // Retrieve ratings by product ID
    public List<Ratings> getRatingsByProductId(Long productId) {
        return ratingsRepository.findByProductId(productId);
    }

    // Update an existing rating
    public Ratings updateRating(Long id, Ratings ratingDetails) {
        Ratings rating = getRatingById(id);

        rating.setRatingValue(ratingDetails.getRatingValue());
        rating.setUser(ratingDetails.getUser());
        rating.setProduct(ratingDetails.getProduct());

        return ratingsRepository.save(rating);
    }

    // Delete a rating by ID
    public void deleteRating(Long id) {
        Ratings rating = getRatingById(id);
        ratingsRepository.delete(rating);
    }
}
