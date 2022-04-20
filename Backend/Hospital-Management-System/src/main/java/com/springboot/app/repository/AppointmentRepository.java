package com.springboot.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.app.entities.Appointment;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

    List<Appointment> findByEmail(String email);
    
    List<Appointment> findByDoctorname(String doctorname);
	
    List<Appointment> findBySpeciality(String speciality);
}
