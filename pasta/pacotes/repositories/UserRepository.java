package com.springudemy.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springudemy.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	

	
}
