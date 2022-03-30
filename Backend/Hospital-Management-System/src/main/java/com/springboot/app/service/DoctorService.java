package com.springboot.app.service;

import java.util.List;

import com.springboot.app.model.Doctor;

public interface DoctorService {
	
	public List<Doctor> allDoctors();
	
	public Doctor getDoctorById(int doctorId);
	
	public int saveDoctors(Doctor doctor);

}
