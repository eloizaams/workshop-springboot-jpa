package com.eloizaams.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eloizaams.course.entities.Category;


public interface CategoryRepository extends JpaRepository <Category, Long> {

}
