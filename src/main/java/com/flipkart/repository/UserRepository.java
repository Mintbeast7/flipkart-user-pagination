package com.flipkart.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flipkart.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	// Derived Query 
	@Query
	public UserEntity findByFirstName(String firstName, Pageable pageable); // Select * from users where first_name=?
}
