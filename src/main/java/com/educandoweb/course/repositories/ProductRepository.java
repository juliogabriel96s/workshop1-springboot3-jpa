package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

	
}
