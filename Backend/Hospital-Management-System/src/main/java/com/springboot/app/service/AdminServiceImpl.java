package com.springboot.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.entities.Admin;
import com.springboot.app.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public List<Admin> allAdmins() {

		return adminRepository.findAll();
	}
	
	@Override
	public Admin getAdminById(int adminId) {
		
		return adminRepository.findById(adminId).orElse(null);
	}
	
	@Override
	public int saveAdmins(Admin admin) {
		
		String password = admin.getPassword(); 
		String confirmPassword = admin.getConfirmPassword();
		String name = admin.getName();
		String email = admin.getEmail();
		
		Admin a = new Admin();
		
		a.setPassword(password);
		a.setConfirmPassword(confirmPassword);
		a.setName(name);
        a.setEmail(email);
        
        Admin result = adminRepository.save(a); 
        
        if(result != null) {
    		System.out.print("Record inserted");
    		return 0;
    		
    		} 
            
            return 1;
		
	}

	@Override
	public boolean validate(Admin admin) {
		String email = admin.getEmail();
		String password = admin.getPassword(); 
		
		Admin validAdmin=adminRepository.findByEmailAndPassword(email, password);
		
		if(validAdmin!=null)
			return true;
		
		return false;
	}

}