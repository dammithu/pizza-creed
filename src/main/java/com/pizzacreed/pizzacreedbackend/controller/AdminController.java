package com.pizzacreed.pizzacreedbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.pizzacreed.pizzacreedbackend.model.Product;
import com.pizzacreed.pizzacreedbackend.repository.ProductRepository;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ProductRepository productRepository;

    // Add product endpoint
    @PostMapping("/add-product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product savedProduct = productRepository.save(product);
        return ResponseEntity.ok(savedProduct);
    }

    // Additional endpoints for edit and delete
}
