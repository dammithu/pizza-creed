package com.pizzacreed.pizzacreedbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pizzacreed.pizzacreedbackend.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional methods if needed
}

