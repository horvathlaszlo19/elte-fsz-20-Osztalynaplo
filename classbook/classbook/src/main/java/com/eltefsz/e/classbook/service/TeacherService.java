package com.eltefsz.e.classbook.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.SchoolClass;
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.domain.Teacher;
import com.eltefsz.e.classbook.repository.SchoolClassRepository;
import com.eltefsz.e.classbook.repository.StudentRepository;
import com.eltefsz.e.classbook.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Autowired
	private SchoolClassRepository schoolClassRepository;
	
	public List<Student> allStudent(){
		return studentRepository.findAll();
	}
	
	public Optional<Student> findStudent(long id){
		return studentRepository.findById(id);
	}
	
//	public void addTeacher(int age, boolean sex, String name, String username, String password, Subject subject) {
//		Teacher teacher = new Teacher(age, sex, name, username, password, subject);
//		teacherRepository.save(teacher);
//	}

	public Teacher findTeacherById(Long id) {
		Teacher result = new Teacher();
		if( teacherRepository.findById(id).isPresent() ) {
			result = teacherRepository.findById(id).get();
		}
		return result;
	}
	

	public List<Teacher> getAllTeachers() {
		Iterable<Teacher> foundTeachers = teacherRepository.findAll();
		List<Teacher> result = new ArrayList<Teacher>();
		foundTeachers.forEach(result::add);
		return result;
	}
	
	public List<SchoolClass> getSchoolCLasses(Teacher teacher) {
		return teacher.getTeacherSchoolClasses();
	}
	
	public Teacher findTeacherByUniqueUsername(String username) {
		return teacherRepository.findByUsername(username);
	}
	
	
	
	
	
}
