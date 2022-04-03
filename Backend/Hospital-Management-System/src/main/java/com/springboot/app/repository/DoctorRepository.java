package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.entities.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
	
	Doctor findByEmailAndPassword(String email, String passwordString);

}
