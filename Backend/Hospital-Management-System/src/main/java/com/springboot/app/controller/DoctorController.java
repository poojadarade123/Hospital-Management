package com.springboot.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.app.entities.Doctor;
import com.springboot.app.service.DoctorService;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@GetMapping("/doctors")
	public List<Doctor> getAllDoctors(){
		return doctorService.allDoctors();
	}
	
	@GetMapping("/updateByDoctorid/{doctorId}")
	public Doctor getDoctor(@PathVariable Integer doctorId)
	{
		return doctorService.getDoctorById(doctorId);
	}
	
	@GetMapping("/allSpeciality")
	public List<String> getAllSpeciality(){
		return doctorService.allSpeciality();
	}
	
	
	@PostMapping(value="/registerDoctors" , consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
    public int PostDoctor(@RequestBody Doctor doctor) {
		return doctorService.saveDoctors(doctor);
	}
	
	
	@PostMapping("/doctorLogin")
	public Doctor loginDoctor(@RequestBody Doctor doctor) {
		System.out.println("login successfull");
		 return doctorService.validate(doctor);
		
	}
	
	@GetMapping("/allSpeciality")
	public List<String> getAllSpeciality(){
		return doctorService.allSpeciality();
	}
	
}
