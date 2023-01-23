package com.techart.transactionals.service.impl;

import com.techart.transactionals.repository.CounterRepository;
import com.techart.transactionals.repository.entity.Counter;
import com.techart.transactionals.service.CounterService;
import org.springframework.stereotype.Service;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
@Service
public class CounterJpaService implements CounterService {
    private final CounterRepository counterRepository;

    public CounterJpaService(final CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @Override
    public Counter increment(final String counterName) {
        Counter counter = counterRepository.findByName(counterName)
                .orElseThrow(() -> new RuntimeException("Counter not found"));
        counter.setCount(counter.getCount() + 1);
        return counterRepository.save(counter);
    }
}
