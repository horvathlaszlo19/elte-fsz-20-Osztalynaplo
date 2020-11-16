package com.eltefsz.e.classbook.service;

import java.util.List;
<<<<<<< HEAD
=======
import java.util.Optional;
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
=======
import com.eltefsz.e.classbook.domain.Grade;
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentrepo;
	
<<<<<<< HEAD
	
=======
	public Optional<Student> findStudentById(Long id) {
		return studentrepo.findById(id);
	}
	
	public Optional<Student> findStudent(String username, String password) {
		return studentrepo.findByUsernameAndPassword(username, password);
	}
	
	public List<Grade> getGrades(Long id) {
		return studentrepo.findById(id).get().getGrades();
	}

>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
}
