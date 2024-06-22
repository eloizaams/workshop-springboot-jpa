package com.eloizaams.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eloizaams.course.entities.OrderItem;
import com.eloizaams.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
