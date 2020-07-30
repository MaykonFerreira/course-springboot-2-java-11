package com.educandoweb.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Product;


// Poderia registrar com repository mas ela já esta sendo uma extensão do JPA @Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
