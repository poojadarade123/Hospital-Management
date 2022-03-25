package com.springboot.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.model.User;

public interface UserRepository extends JpaRepository<User,Long> {

}
