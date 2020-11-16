package com.eltefsz.e.classbook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;
import com.eltefsz.e.classbook.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private StudentRepository studentrepo;
	
	public List<Student> allStudent(){
		return studentrepo.findAll();
	}
	
	public Optional<Student> findStudent(long id){
		return studentrepo.findById(id);
	}
	
}
