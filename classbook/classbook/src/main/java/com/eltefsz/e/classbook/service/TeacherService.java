package com.eltefsz.e.classbook.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Teacher;
import com.eltefsz.e.classbook.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherrepo;
	
	public Optional<Teacher> findTeacher(String username, String password) {
		return teacherrepo.findByUsernameAndPassword(username, password);
	}
}
