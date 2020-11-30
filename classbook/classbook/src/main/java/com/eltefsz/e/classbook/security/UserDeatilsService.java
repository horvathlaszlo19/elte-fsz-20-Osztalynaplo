package com.eltefsz.e.classbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.eltefsz.e.classbook.domain.Person;
import com.eltefsz.e.classbook.repository.StudentRepository;
import com.eltefsz.e.classbook.repository.TeacherRepository;

public class UserDeatilsService {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	//public UserDetails loadUserByUsername(String username) {
		
//		User user = userRepository.findByEmail(username);
//		if (user == null) {
//			throw new UsernameNotFoundException(username);
//		}
		
//		Person person = teacherRepository.findByUsername(username);
//		if(person==null) {
//			throw new UsernameNotFoundException(username);
//		}
		//return new UserPrincipal();
	}
	



