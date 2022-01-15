package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	// @Query("select c from Contact c where c.email like %?1")
	// List<Contact> findByNameEndwithMailId(String mailid);
}
