package com.pizzacreed.pizzacreedbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.pizzacreed.pizzacreedbackend.model.Product;
import com.pizzacreed.pizzacreedbackend.repository.ProductRepository;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PizzaController {

    @Autowired
    private ProductRepository productRepository;

    // List available products endpoint
    @GetMapping("/products")
    public ResponseEntity<List<Product>> listProducts() {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }

    // Create shopping basket endpoint
    @PostMapping("/create-basket")
    public ResponseEntity<String> createBasket() {
        // Implement basket creation logic
        return ResponseEntity.ok("Basket created successfully");
    }

    // Add product to the shopping basket endpoint
    @PostMapping("/add-to-basket")
    public ResponseEntity<String> addToBasket(@RequestParam Long productId) {
        // Implement adding product to the basket logic
        return ResponseEntity.ok("Product added to the basket");
    }

    // Remove product from the shopping basket endpoint
    @PostMapping("/remove-from-basket")
    public ResponseEntity<String> removeFromBasket(@RequestParam Long productId) {
        // Implement removing product from the basket logic
        return ResponseEntity.ok("Product removed from the basket");
    }

    // View shopping basket endpoint
    @GetMapping("/view-basket")
    public ResponseEntity<String> viewBasket() {
        // Implement viewing the basket logic
        return ResponseEntity.ok("Viewing the basket");
    }

    // Checkout endpoint
    @PostMapping("/checkout")
    public ResponseEntity<String> checkout() {
        // Implement checkout logic
        return ResponseEntity.ok("Checkout successful");
    }
}

