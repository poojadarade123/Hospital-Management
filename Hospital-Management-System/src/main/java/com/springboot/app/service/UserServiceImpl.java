package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.model.User;
import com.springboot.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> allUsers() {

		return userRepository.findAll();
	}

	@Override
	public User getUserById(int userId) {
		
		return userRepository.findById(userId).orElse(null);
	}

	

	

}
