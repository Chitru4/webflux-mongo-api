package com.example.webflux.service;

import com.example.webflux.model.Rule;
import com.example.webflux.repository.RuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Transactional
public class RuleService {
    @Autowired
    RuleRepository ruleRepository;

    public Flux<Rule> findAll() {
        return ruleRepository.findAll();
    }

    public Mono<Rule> saveRule(Rule rule) {
        return ruleRepository.save(rule);
    }
}
