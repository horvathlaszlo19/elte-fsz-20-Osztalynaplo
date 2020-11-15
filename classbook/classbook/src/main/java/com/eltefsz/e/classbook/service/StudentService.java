package com.eltefsz.e.classbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Grade;
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
	public Optional<Student> findStudentById(Long id) {
		return studentrepo.findById(id);
	}
	
	public Optional<Student> findStudent(String username, String password) {
		return studentrepo.findByUsernameAndPassword(username, password);
	}
	
	public List<Grade> getGrades(Long id) {
		return studentrepo.findById(id).get().getGrades();
	}

}
