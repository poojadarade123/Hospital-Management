package com.springboot.app.service;

import java.sql.Time;
import java.util.List;

import com.springboot.app.entities.Doctor;
import com.springboot.app.repository.DoctorRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class DoctorServiceImpl implements DoctorService{
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	@Override
	public List<Doctor> allDoctors() {

		return doctorRepository.findAll();
	}
	
	@Override
	public Doctor getDoctorById(int doctorId) {
		
		return doctorRepository.findById(doctorId).orElse(null);
	}
	@Override
	public int saveDoctors(Doctor doctor) {
		
		String password = doctor.getPassword(); 
		String confirmPassword = doctor.getConfirmPassword();
		String name = doctor.getName();
		String email = doctor.getEmail();
		String mobileNo = doctor.getMobileNo();
		String speciality = doctor.getSpeciality();
		int experience = doctor.getExperience();
		String qualification = doctor.getQualification();
		String arrivalTime = doctor.getArrivalTime();
		String leavingTime = doctor.getLeavingTime();
		
		Doctor n = new Doctor();
		
		n.setPassword(password);
		n.setConfirmPassword(confirmPassword);
		n.setName(name);
		n.setEmail(email);
		n.setMobileNo(mobileNo);
		
		n.setSpeciality(speciality);
		n.setExperience(experience);
		n.setQualification(qualification);
		
		n.setArrivalTime(arrivalTime);
		n.setLeavingTime(leavingTime);
		
		Doctor result = doctorRepository.save(n);
		if(result != null) {
			System.out.println("Record inserted");
			return 0;
		}
		return 1;
		
	}

	@Override
	public boolean validate(Doctor doctor) {
		String email = doctor.getEmail();
		String password = doctor.getPassword();
		
		Doctor validDoctor = doctorRepository.findByEmailAndPassword(email, password);
		
		if(validDoctor!=null)
			return true;
		
		return false;
	}
}
