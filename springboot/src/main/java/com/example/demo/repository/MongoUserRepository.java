package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.document.MongoUser;

@Repository
public interface MongoUserRepository extends MongoRepository<MongoUser, String> {
}