package com.example.webflux.repository;

import com.example.webflux.model.Rule;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RuleRepository extends ReactiveMongoRepository<Rule, Long> {
}
