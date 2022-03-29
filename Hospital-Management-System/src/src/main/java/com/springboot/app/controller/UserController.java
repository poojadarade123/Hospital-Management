package com.springboot.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import com.springboot.app.model.User;
import com.springboot.app.repository.UserRepository;
import com.springboot.app.service.UserService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userService.allUsers();
	}
	
	@GetMapping("/updateByUserid/{userId}")
	public User getUser(@PathVariable Integer userId)
	{
		return userService.getUserById(userId);
	}
	
	@PostMapping(value="/registerUsers" , consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public int PostUser(@RequestBody User user) {
		return userService.saveUsers(user);
	}
	
	
	
	
	

}
