package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getAllUsers(){
		return(List<User>) userRepository.findAll();
	}
	
	public User getUserById(int id) {
		Optional<User> user = userRepository.findById(id);
		return user.orElse(null);
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(int id, User user) {
		Optional<User> existingUser = userRepository.findById(id);
		if(existingUser.isPresent()) {
			user.setId(id);
			userRepository.save(user);
		}
	}
	
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
}
