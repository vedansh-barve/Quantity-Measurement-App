package com.app.quantity_measurement_app.service;

import org.springframework.stereotype.Service;

import org.springframework.security.core.userdetails.UserDetails;

import com.app.quantity_measurement_app.entity.User;
import com.app.quantity_measurement_app.repository.UserRepository;

@Service
public class CustomUserDetailsService {
	
	private UserRepository repository;
	
	public CustomUserDetailsService(UserRepository repository) {
		this.repository = repository;
	}
	
	public UserDetails loadUserByEmail(String email) {
		 User user = repository.findByEmail(email)
	                .orElseThrow(() -> new RuntimeException("User not found"));

	        return org.springframework.security.core.userdetails.User
	                .builder()
	                .username(user.getUsername())
	                .password(user.getPassword())
	                .roles(user.getRole())
	                .build();
	}
}
