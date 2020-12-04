package com.eltefsz.e.classbook.repository;


import java.util.List;

import java.util.Optional;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	List<Student> findAll();
	
<<<<<<< HEAD
=======
	Optional<Student> findByUsername(String username);

>>>>>>> cadf1fc13526b3be34ff0dc1048b00acb46ca50e
	Optional<Student> findByUsernameAndPassword(String username, String password);

	Student findByUsername(String username);
	
}