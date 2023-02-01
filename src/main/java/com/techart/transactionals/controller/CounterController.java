package com.techart.transactionals.controller;

import com.techart.transactionals.service.CounterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/counters")
public class CounterController {
    private final CounterService counterService;

    public CounterController(CounterService counterService) {
        this.counterService = counterService;
    }

    @PutMapping("/{counterName}")
    public ResponseEntity<?> incrementCounter(@PathVariable final String counterName) {
        counterService.increment(counterName);
        return ResponseEntity.ok("Increment updated");
    }
}