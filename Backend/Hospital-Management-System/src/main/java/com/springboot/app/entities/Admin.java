package com.springboot.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "admins")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	@Column(length = 30, nullable = false)
	@Size(min = 5, message = "Name should be minimum 5 characters ")
	private String name;

	@Column(length = 20, nullable = false)
	@Size(min = 5, message = "Name should be minimum 8 characters ")
	private String password;
	
	@Column(length = 20, nullable = false)
	@Size(min = 5, message = "Name should be minimum 8 characters ")
	private String confirmPassword;

	@Column(nullable = false)
	private String email;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAdminId() {
		return adminId;
	}
}
