package com.example.demo.repo;



import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Custom query method to find all products by a specific category
    List<Product> findByCategoryId(Long categoryId);
}
