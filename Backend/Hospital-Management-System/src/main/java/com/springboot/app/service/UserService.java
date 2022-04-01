package com.springboot.app.service;

import java.util.List;

import com.springboot.app.entities.User;

public interface UserService {
	
	public List<User> allUsers();
	
	public User getUserById(int userId);
	
	public int saveUsers(User user);
	
	public boolean validate(User user);
	
	public boolean checkIfEmailExists(User user);

}
