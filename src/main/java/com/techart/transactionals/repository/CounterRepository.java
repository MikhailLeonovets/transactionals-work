package com.techart.transactionals.repository;

import com.techart.transactionals.repository.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@Repository
public interface CounterRepository extends JpaRepository<Counter, Long> {

    Optional<Counter> findByName(final String name);

}
