package com.course.Repositories;

import com.course.entities.Category;
import com.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository <Product, Long>{


}
