package com.eltefsz.e.classbook.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
	
}
