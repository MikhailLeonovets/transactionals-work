package com.techart.transactionals.service;

import com.techart.transactionals.repository.entity.Counter;

/**
 * @author Mikhail.Leonovets
 * @since 01/20/2023
 */
public interface CounterService {

    Counter increment(final String counterName);

}
