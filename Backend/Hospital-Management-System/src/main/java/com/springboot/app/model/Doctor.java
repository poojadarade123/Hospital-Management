package com.springboot.app.model;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "doctors")
public class Doctor {
	
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
	
	@Column(nullable=false)
	private String gender;
	
	@Column(nullable=false)
	private String email;
	
	@Column(length=10, nullable=false)
	@Size(min=10)
	private long mobileNo;
	
	private String address;
	
	@Column(nullable=false)
	private String speciality;
	
	@Column(nullable=false)
	private String qualification;
	
	@Column(nullable=false)
	private int experience;
	
	@Column(nullable=false)
	private String availableWeekDays;
	
	@Column(nullable=false)
	private Time arrivalTime; 
	
	@Column(nullable=false)
	private Time leavingTime;

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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getAvailableWeekDays() {
		return availableWeekDays;
	}

	public void setAvailableWeekDays(String availableWeekDays) {
		this.availableWeekDays = availableWeekDays;
	}

	public Time getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Time arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public Time getLeavingTime() {
		return leavingTime;
	}

	public void setLeavingTime(Time leavingTime) {
		this.leavingTime = leavingTime;
	}

	@Override
	public String toString() {
		return "Doctor [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", gender=" + gender
				+ ", email=" + email + ", mobileNo=" + mobileNo + ", address=" + address + ", speciality=" + speciality
				+ ", qualification=" + qualification + ", experience=" + experience + ", availableWeekDays="
				+ availableWeekDays + ", arrivalTime=" + arrivalTime + ", leavingTime="
				+ leavingTime + "]";
	}

	
}
