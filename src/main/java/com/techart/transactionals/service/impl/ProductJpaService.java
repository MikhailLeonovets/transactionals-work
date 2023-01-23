package com.techart.transactionals.service.impl;

import com.techart.transactionals.repository.ProductRepository;
import com.techart.transactionals.repository.entity.Product;
import com.techart.transactionals.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@Service
public class ProductJpaService implements ProductService {
    private final ProductRepository productRepository;

    public ProductJpaService(final ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(final Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(final Long id) {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    @Override
    public Product update(final Product product) {
        productRepository.findById(product.getId()).orElseThrow(() -> new RuntimeException("Product not found"));
        return productRepository.save(product);
    }

    @Override
    public void delete(final Product product) {
        productRepository.delete(product);
    }

    @Override
    public void deleteById(final Long id) {
        productRepository.deleteById(id);
    }
}
