package com.techart.transactionals.controller;

import com.techart.transactionals.controller.dto.ProductDto;
import com.techart.transactionals.repository.entity.Product;
import com.techart.transactionals.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(final ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<?> saveProduct(@RequestBody final ProductDto productDto) {
        productService.save(new Product(productDto.getProductName(), productDto.getProductPrice()));
        return ResponseEntity.ok("Saved and Updated successfully");
    }
}
