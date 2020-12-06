package com.eltefsz.e.classbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Person;
import com.eltefsz.e.classbook.repository.AdminRepository;
import com.eltefsz.e.classbook.repository.StudentRepository;
import com.eltefsz.e.classbook.repository.TeacherRepository;


@Service
public class UserDeatilsService implements UserDetailsService {
	

	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String username){
		if(studentRepository.findByUsername(username) != null ) {
			Person person = studentRepository.findByUsername(username);
			return new UserPrincipal(person);
		} else if ( teacherRepository.findByUsername(username) != null ) {
			Person person = teacherRepository.findByUsername(username);
			return new UserPrincipal(person);
		} else if ( adminRepository.findByUsername(username) != null ) {
			Person person = adminRepository.findByUsername(username);
			return new UserPrincipal(person);
		} else {
			throw new UsernameNotFoundException(username);
		}
	}
	
	
	}


//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		Person person;
//		try {
//			person = teacherRepository.findByUsername(username);
//		}catch (Exception e) {
//			try {
//				person = studentRepository.findByUsername(username);
//		}catch (Exception ex) {
//			throw new UsernameNotFoundException(username);
//		}
//		}
//
//		return new UserPrincipal(person);
//	}
//}
