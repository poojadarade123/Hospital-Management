package com.springboot.app.service;

import java.util.List;

import com.springboot.app.entities.Admin;


public interface AdminService {
	
	public List<Admin> allAdmins();

	public Admin getAdminById(int adminId);
	
	public int saveAdmins(Admin admin);

}