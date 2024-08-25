package com.example.demo.repo;
import com.example.demo.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Custom query method to find a category by name
    Category findByName(String name);
}
