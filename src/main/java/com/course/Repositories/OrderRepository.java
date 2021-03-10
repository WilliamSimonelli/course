package com.course.Repositories;

import com.course.entities.Order;
import com.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository <Order, Long>{

}
