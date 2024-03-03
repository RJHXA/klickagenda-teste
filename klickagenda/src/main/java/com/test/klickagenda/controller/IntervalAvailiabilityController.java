package com.test.klickagenda.controller;

import com.test.klickagenda.entity.IntervalAvailiability;
import com.test.klickagenda.repository.IntervalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/intervalo")
@CrossOrigin("http://localhost:5173/")
public class IntervalAvailiabilityController {

    @Autowired
    private IntervalRepository intervalRepository;

    @GetMapping
    public List<IntervalAvailiability> listIntervals() {
        return intervalRepository.findAll();
    }

    @PostMapping
    public IntervalAvailiability saveInterval(@RequestBody IntervalAvailiability interval) {
        return intervalRepository.save(interval);
    }

    /*
    @PutMapping("{id}")
    public IntervalAvailiability updateInterval(@PathVariable Long id, @RequestBody IntervalRepository interval) {

        final Optional<IntervalAvailiability> optIntervalAvailiability = intervalRepository.findById(id);
    }
     */
}