package com.diego.workshop_springboot4_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.workshop_springboot4_jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
