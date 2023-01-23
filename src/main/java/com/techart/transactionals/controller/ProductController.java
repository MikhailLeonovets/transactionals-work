package com.techart.transactionals.controller;

import com.techart.transactionals.controller.dto.ProductAndCounterDto;
import com.techart.transactionals.repository.entity.Product;
import com.techart.transactionals.service.CounterService;
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
@RequestMapping("/api")
public class ProductController {
    private final ProductService productService;
    private final CounterService counterService;

    public ProductController(final ProductService productService, final CounterService counterService) {
        this.productService = productService;
        this.counterService = counterService;
    }

    @PostMapping("/save-update")
    public ResponseEntity<?> saveProductAndIncrementCounter(@RequestBody final ProductAndCounterDto productAndCounterDto) {
        productService.save(new Product(productAndCounterDto.getProductName(), productAndCounterDto.getProductPrice()));
        counterService.increment(productAndCounterDto.getCounterName());
        return ResponseEntity.ok("Saved and Updated successfully");
    }
}
