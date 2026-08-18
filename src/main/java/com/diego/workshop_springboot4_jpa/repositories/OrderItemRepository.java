package com.diego.workshop_springboot4_jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diego.workshop_springboot4_jpa.entities.OrderItem;
import com.diego.workshop_springboot4_jpa.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
