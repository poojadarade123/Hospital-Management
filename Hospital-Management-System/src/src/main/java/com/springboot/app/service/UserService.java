package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.User;


public interface UserService {
	
	public List<User> allUsers();
	
	public User getUserById(int userId);
	
	public int saveUsers(User user);

}
