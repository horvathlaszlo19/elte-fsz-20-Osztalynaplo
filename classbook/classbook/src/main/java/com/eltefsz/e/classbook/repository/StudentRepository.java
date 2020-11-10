package com.eltefsz.e.classbook.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eltefsz.e.classbook.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{

}
