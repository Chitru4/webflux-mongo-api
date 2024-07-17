package com.example.webflux.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "rule")
public class Rule {
    @Id
    private ObjectId _id;
    private Long id;
    private String name;
    private String description;
    private String policy;

    public Rule() {}

    public Rule(Long id, String name, String description, String policy) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.policy = policy;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription(String description) {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPolicy() {
        return policy;
    }
    public void setPolicy(String policy) {
        this.policy = policy;
    }
}
