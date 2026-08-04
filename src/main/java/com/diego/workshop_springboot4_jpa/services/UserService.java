package com.diego.workshop_springboot4_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.workshop_springboot4_jpa.entities.User;
import com.diego.workshop_springboot4_jpa.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	
	}
	
	public User findById(Long id) {
		 Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
