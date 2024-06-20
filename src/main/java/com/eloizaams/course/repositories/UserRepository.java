package com.eloizaams.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eloizaams.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
