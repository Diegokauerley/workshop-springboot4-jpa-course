package com.diego.workshop_springboot4_jpa.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diego.workshop_springboot4_jpa.entities.Order;
import com.diego.workshop_springboot4_jpa.entities.User;
import com.diego.workshop_springboot4_jpa.repositories.OrderRepository;
import com.diego.workshop_springboot4_jpa.repositories.UserRepository;

@Service
public class OrderService {
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	
	}
	
	public Order findById(Long id) {
		 Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
