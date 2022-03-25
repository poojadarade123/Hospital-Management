package com.springboot.app.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(length=30, nullable=false)
	@Size(min=5, message="Name should be minimum 5 characters ")
	private String userName;
	
	@Column(length=20, nullable=false)
	@Size(min=8, message="Name should be minimum 8 characters ")
	private String password;
	
	@Column(length=30, nullable=false)
	private String firstName;
	
	@Column(length=30)
	private String middleName;
	
	@Column(length=30, nullable=false)
	private String lastName;
	
	
	private String address;
	
	@Column(nullable=false)
	private String email;
	
	@Column(length=12, nullable=false)
	@Size(min=12)
	private long aadharNumber;
	
	@Column(length=10, nullable=false)
	@Size(min=10)
	private long mobileNo;
	
	@Column(nullable=false)
	private Date dob;
	
	@Column(nullable=false)
	private String gender;
	
	@Column(nullable=false)
	private String maritalStatus;
	
	@Column(nullable=false)
	private String bloodGroup;

	

	public long getUserId() {
		return userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", address=" + address
				+ ", email=" + email + ", aadharNumber=" + aadharNumber + ", mobileNo=" + mobileNo + ", dob=" + dob
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", bloodGroup=" + bloodGroup + "]";
	}
	
	
	
	

}
