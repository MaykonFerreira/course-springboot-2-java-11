package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositores.UserRepository;

@Configuration
@Profile("bdteste")
public class TestConfig implements CommandLineRunner {
	
	// Isso resolve a dependencia (Spring Tool Suite)
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		// tudo funciona quando instaciar a aplicação
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		User u3 = new User(null, "Maykon Ferreira", "maykon@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1,u2,u3));
		
	}
	
	
}