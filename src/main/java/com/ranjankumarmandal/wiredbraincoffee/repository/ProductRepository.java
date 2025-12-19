package com.ranjankumarmandal.wiredbraincoffee.repository;

import com.ranjankumarmandal.wiredbraincoffee.entity.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
