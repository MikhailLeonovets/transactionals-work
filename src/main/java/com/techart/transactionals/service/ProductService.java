package com.techart.transactionals.service;

import com.techart.transactionals.repository.entity.Product;

import java.util.List;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
public interface ProductService {

    Product save(final Product product);

    List<Product> findAll();

    Product findById(final Long id);

    Product update(final Product product);

    void delete(final Product product);

    void deleteById(final Long id);

}
