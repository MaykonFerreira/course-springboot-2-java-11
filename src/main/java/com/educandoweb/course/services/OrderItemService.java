package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.OrderItem;
import com.educandoweb.course.entities.pk.OrderItemPK;
import com.educandoweb.course.repositores.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository repository;
	
	public List<OrderItem> findAll(){
		return repository.findAll();
		
	}
	
	public OrderItem findById(OrderItemPK id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
		
	}
	
}
