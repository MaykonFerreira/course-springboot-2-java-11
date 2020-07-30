package com.educandoweb.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.User;


// Poderia registrar com repository mas ela já esta sendo uma extensão do JPA @Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
