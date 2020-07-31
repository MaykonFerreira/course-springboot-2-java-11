package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;
import com.educandoweb.course.services.OrderItemService;

@RestController
@RequestMapping(value="/items")
public class OrderItemResource {

	@Autowired
	private OrderItemService service;
	
	@GetMapping
	public ResponseEntity <List<OrderItem>> findAll() {
	    //OrderItem u = new OrderItem(1L, "Maria", "maria@gmail", "99999999", "123456");
		List<OrderItem> list = service.findAll();
		return ResponseEntity.ok().body(list);
		//return null;
	} 
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<OrderItem> findById(@PathVariable OrderItemPK id){
		OrderItem obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
}
