package com.eloizaams.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eloizaams.course.entities.Product;


public interface ProductRepository extends JpaRepository <Product, Long> {

}
