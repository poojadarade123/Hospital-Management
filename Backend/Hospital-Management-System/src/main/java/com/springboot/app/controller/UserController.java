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
import org.springframework.http.ResponseEntity;

import com.springboot.app.entities.User;
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
	
	@PostMapping("/login")
    public boolean loginUser(@RequestBody User user) {  
    
		boolean checkingLogin=userService.validate(user);
		
		if(checkingLogin) {
			System.out.println("login successfull");
		    return true;
		}
		System.out.println("login failed");
		return false;
	
	    }
	
	@PostMapping("/emailExists")
	public boolean checkIfEmailExists(@RequestBody User user ){
		Boolean emailExists=userService.checkIfEmailExists(user);
		if(emailExists==true)
		{
			System.out.println("DUPLICATE_EMAIL");
			return false;
		}
		System.out.println("UNIQUE_EMAIL");
		return true;
	}
	
	
	

}
