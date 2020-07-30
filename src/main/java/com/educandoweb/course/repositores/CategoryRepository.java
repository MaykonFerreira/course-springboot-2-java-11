package com.educandoweb.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;


// Poderia registrar com repository mas ela já esta sendo uma extensão do JPA @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
	
}
