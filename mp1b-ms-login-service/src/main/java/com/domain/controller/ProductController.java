package com.domain.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.model.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	@GetMapping("/products")
	public Product getAllProducts() {
		return new Product(100L, "The Power Of Now", "Author : Ekhart Tolle", 50);
	}
}
