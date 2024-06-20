package com.eloizaams.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eloizaams.course.entities.User;

//@Repository não precisa colocar pois o JpaRepository já tem este anotation
public interface UserRepository extends JpaRepository<User, Long> {

}
