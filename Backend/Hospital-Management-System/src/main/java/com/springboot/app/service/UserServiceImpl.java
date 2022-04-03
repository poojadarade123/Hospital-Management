package com.springboot.app.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.entities.User;
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

	@Override
	public int saveUsers(User user) {
		
		String password = user.getPassword(); 
		String confirmPassword = user.getConfirmPassword();
		String name = user.getName();
		String email = user.getEmail();
		String address = user.getAddress();
		String mobileNo = user.getMobileNo();
		int age = user.getAge();
		String bloodGroup = user.getBloodGroup();
		
		User n = new User();
		
		n.setPassword(password);
		n.setConfirmPassword(confirmPassword);
		n.setName(name);
        n.setEmail(email);
        n.setAddress(address);
        n.setMobileNo(mobileNo);
        n.setAge(age);
        n.setBloodGroup(bloodGroup);
        
        User result = userRepository.save(n); 
        
        if(result != null) {
    		System.out.print("Record inserted");
    		return 0;
    		
    		} 
            
            return 1;
		
	}

	@Override
	public boolean validate(User user) {
		
		String email = user.getEmail();
		String password = user.getPassword(); 
		
		User validUser=userRepository.findByEmailAndPassword(email, password);
		
		if(validUser!=null)
			return true;
		
		return false;
	}

	@Override
	public boolean checkIfEmailExists(User user) {
		
		String email = user.getEmail();
		boolean validEmail=userRepository.existsByEmail(email);
		if(validEmail)
			return true;
		
		return false;
	}

	

	

	

}
