package com.eltefsz.e.classbook.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

	Optional<Student> findByUsernameAndPassword(String username, String password);
	
}