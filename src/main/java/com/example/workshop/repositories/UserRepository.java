package com.example.workshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    
}
