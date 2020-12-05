package com.eltefsz.e.classbook.repository;

import java.util.List;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.SchoolClass;
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.domain.Teacher;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	List<Student> findAll();
	
	Optional<Student> findByUsernameAndPassword(String username, String password);

	Student findByUsername(String username);
	
}