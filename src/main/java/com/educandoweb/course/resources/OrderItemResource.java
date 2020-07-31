package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.services.OrderService;

@RestController
@RequestMapping(value="/items")
public class OrderItemResource {

	@Autowired
	private OrderService service;
	
	//@GetMapping
	//public ResponseEntity <List<OrderItem>> findAll() {
		//Order u = new Order(1L, "Maria", "maria@gmail", "99999999", "123456");
		//List<OrderItem> list = service.findAll();
		//return ResponseEntity.ok().body(list);
	//} 
	
	//@GetMapping(value = "/{id}")
	//public ResponseEntity<OrderItem> findById(@PathVariable Long id){
		//OrderItem obj = service.findById(id);
		//return ResponseEntity.ok().body(obj);
		
	//}
}
