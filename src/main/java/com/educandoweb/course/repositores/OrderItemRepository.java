package com.educandoweb.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;


// Poderia registrar com repository mas ela já esta sendo uma extensão do JPA @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
