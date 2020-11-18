package com.eltefsz.e.classbook.service;

<<<<<<< HEAD
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
=======
import java.util.ArrayList;
import java.util.List;
>>>>>>> 6fcd9924c4b4a1271f1b338200348356b98c992f
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
<<<<<<< HEAD
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;
=======
=======
import com.eltefsz.e.classbook.domain.Subject;
>>>>>>> 6fcd9924c4b4a1271f1b338200348356b98c992f
import com.eltefsz.e.classbook.domain.Teacher;
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
import com.eltefsz.e.classbook.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
<<<<<<< HEAD
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
=======
	private TeacherRepository teacherRepository;
>>>>>>> 6fcd9924c4b4a1271f1b338200348356b98c992f
	
	
	
	//Controller megfelelo mukodesehez szukseges, kesobb torlendo
	public Optional<Teacher> findTeacherOptional(String username, String password) {
		return teacherRepository.findByUsernameAndPassword(username, password);
	}
		
	public void addTeacher(int age, boolean sex, String name, String username, String password, Subject subject) {
		Teacher teacher = new Teacher(age, sex, name, username, password, subject);
		teacherRepository.save(teacher);
	}
<<<<<<< HEAD
>>>>>>> acea427f539e142a059c6c66318e95375c82c1fe
=======
	
	public Teacher findTeacherById(Long id) {
		Teacher result = new Teacher();
		if( teacherRepository.findById(id).isPresent() ) {
			result = teacherRepository.findById(id).get();
		}
		return result;
	}
	
	public Teacher findTeacher(String username, String password) {
		Teacher result = new Teacher();
		if( teacherRepository.findByUsernameAndPassword(username, password).isPresent() ) {
			result = teacherRepository.findByUsernameAndPassword(username, password).get();
		}
		return result;
	}
	
	public List<Teacher> getAllTeachers() {
		Iterable<Teacher> foundTeachers = teacherRepository.findAll();
		List<Teacher> result = new ArrayList<Teacher>();
		foundTeachers.forEach(result::add);
		return result;
	}
	
	//public List<SchoolClass> getSchoolCLasses(Teacher teacher) {}
	
>>>>>>> 6fcd9924c4b4a1271f1b338200348356b98c992f
}
