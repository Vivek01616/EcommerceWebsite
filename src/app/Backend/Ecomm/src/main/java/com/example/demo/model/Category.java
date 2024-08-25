package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Category {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String description;

	    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Product> products;

	    // Getters, Setters, Constructors
	    public Category() {}

	    public Category(String name, String description) {
	        this.name = name;
	        this.description = description;
	    }

	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public List<Product> getProducts() {
	        return products;
	    }

	    public void setProducts(List<Product> products) {
	        this.products = products;
	    }

}
