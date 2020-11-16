package com.eltefsz.e.classbook.repository;

<<<<<<< HEAD
import java.util.List;
=======
import java.util.Optional;
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	
	List<Student> findAll();
	

	Optional<Student> findByUsernameAndPassword(String username, String password);
	
}