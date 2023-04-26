package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.example.demo.model.User;

import ch.qos.logback.core.model.Model;

public interface UserRepository extends JpaRepository<User, Integer>{
	
}
