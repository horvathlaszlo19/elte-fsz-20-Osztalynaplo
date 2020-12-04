package com.eltefsz.e.classbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Person;
import com.eltefsz.e.classbook.repository.StudentRepository;
import com.eltefsz.e.classbook.repository.TeacherRepository;

<<<<<<< HEAD
public class UserDeatilsService {

=======
@Service
public class UserDeatilsService implements UserDetailsService {
	
>>>>>>> cadf1fc13526b3be34ff0dc1048b00acb46ca50e
	@Autowired
	private TeacherRepository teacherRepository;

	@Autowired
	private StudentRepository studentRepository;
<<<<<<< HEAD
=======
	
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
	

>>>>>>> cadf1fc13526b3be34ff0dc1048b00acb46ca50e

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
