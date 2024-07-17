package com.example.webflux.controller;

import com.example.webflux.model.Rule;
import com.example.webflux.service.RuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value="/rules")
public class RuleController {
    @Autowired
    private RuleService ruleService;
    @GetMapping
    public Flux<Rule> getAllRules() {
        return ruleService.findAll();
    }

    @PostMapping
    public Mono<Rule> createRule(@RequestBody Rule rule) {
        return ruleService.saveRule(rule);
    }

}
