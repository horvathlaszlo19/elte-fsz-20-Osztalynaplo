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

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Person person;
		try {
			person = teacherRepository.findByUsername(username);
		}catch (Exception e) {
			try {
				person = studentRepository.findByUsername(username);
		}catch (Exception ex) {
			throw new UsernameNotFoundException(username);
		}
		}

		return new UserPrincipal(person);
	}
}
