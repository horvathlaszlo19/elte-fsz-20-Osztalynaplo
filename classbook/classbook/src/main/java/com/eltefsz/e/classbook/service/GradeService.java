package com.eltefsz.e.classbook.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Grade;
import com.eltefsz.e.classbook.domain.GradeValue;
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.domain.Subject;
import com.eltefsz.e.classbook.repository.GradeRepository;

@Service
public class GradeService {
	
	@Autowired
	private GradeRepository gradeRepository;
	
	public void addGrade(Subject subject, GradeValue value, Student gradeStudent) {
		Grade grade = new Grade(subject, value, LocalDateTime.now(), gradeStudent);
		gradeRepository.save(grade);
	}

}
