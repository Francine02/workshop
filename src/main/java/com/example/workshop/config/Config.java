package com.example.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.workshop.domain.User;
import com.example.workshop.repositories.UserRepository;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    
    @Override
    public void run(String... args) throws Exception {
        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
    
        repository.saveAll(Arrays.asList(maria, alex, bob));
    }
}
