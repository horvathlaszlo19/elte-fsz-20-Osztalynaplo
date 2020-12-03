package com.eltefsz.e.classbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Person;
import com.eltefsz.e.classbook.repository.StudentRepository;
import com.eltefsz.e.classbook.repository.TeacherRepository;

@Service
public class UserDeatilsService implements UserDetailsService {
	
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

	
	
	@Override
	public UserDetails loadUserByUsername(String username){
		if( studentRepository.findByUsername(username).isPresent() ) {
			Person person = studentRepository.findByUsername(username).get();
			return new UserPrincipal(person);
		} else if ( teacherRepository.findByUsername(username).isPresent() ) {
			Person person = teacherRepository.findByUsername(username).get();
			return new UserPrincipal(person);
		} else {
			throw new UsernameNotFoundException(username);
		}
	}
	
	
}
	



