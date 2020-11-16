package com.eltefsz.e.classbook.service;

<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;
=======
import com.eltefsz.e.classbook.domain.Teacher;
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
import com.eltefsz.e.classbook.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
<<<<<<< HEAD
	private StudentRepository studentrepo;
	
	public List<Student> allStudent(){
		return studentrepo.findAll();
	}
	
	public Optional<Student> findStudent(long id){
		return studentrepo.findById(id);
	}
	
=======
	private TeacherRepository teacherrepo;
	
	public Optional<Teacher> findTeacher(String username, String password) {
		return teacherrepo.findByUsernameAndPassword(username, password);
	}
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
}
