package com.techart.transactionals.repository;

import com.techart.transactionals.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
