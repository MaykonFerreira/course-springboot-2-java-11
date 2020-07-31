package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositores.UserRepository;
import com.educandoweb.course.services.exceptions.DatabaseException;
import com.educandoweb.course.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
		
	}
	
	public User insert(User obj) {
		return repository.save(obj);
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		
		// tenta o get e não tiver 
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
		
	}
	public void delete(Long id) {
		try {
			repository.deleteById(id);			
		}
		catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id); 
		}
		catch(DataIntegrityViolationException e) {
			//e.printStackTrace();
			throw new DatabaseException(e.getMessage());
		}

		
	}
	
	public User update(Long id,User obj) {
		User entity = repository.getOne(id);
		updateData(entity,obj);
		return repository.save(entity);
		
		
	}

	private void updateData(User entity, User obj) {
		
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setFone(obj.getFone());
		
		
	}
}
