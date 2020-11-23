package com.eltefsz.e.classbook.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.Teacher;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher, Long> {
	

	Optional<Teacher> findByUsernameAndPassword(String username, String password);
	
}