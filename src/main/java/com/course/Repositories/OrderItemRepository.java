package com.course.Repositories;

import com.course.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository <OrderItem, Long>{


}
