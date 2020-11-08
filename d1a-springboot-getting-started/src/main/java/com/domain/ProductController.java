package com.domain;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @GetMapping("/product")
	public String getProduct() {
		return "Spring Boot Microservices";
	}
}
