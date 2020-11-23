package com.eltefsz.e.classbook.service;

import java.util.ArrayList;
import java.util.List;


import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.eltefsz.e.classbook.domain.Grade;

import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	//Controller megfelelo mukodesehez szukseges, kesobb torlendo
	public Optional<Student> findStudentByIdOptional(Long id) {
		return studentRepository.findById(id);
	}
	
	//Controller megfelelo mukodesehez szukseges, kesobb torlendo
	public Optional<Student> findStudentOptional(String username, String password) {
		return studentRepository.findByUsernameAndPassword(username, password);

	}
	
	public void addStudent(int age, boolean sex, String name, String username, String password) {
		Student student = new Student(age, sex, name, username, password);
		studentRepository.save(student);
	}
	
	public Student findStudentById(Long id) {
		Student result = new Student();
		if( studentRepository.findById(id).isPresent() ) {
			result = studentRepository.findById(id).get();
		}
		return result;
	}
	
	public Student findStudent(String username, String password) {
		Student result = new Student();
		if( studentRepository.findByUsernameAndPassword(username, password).isPresent() ) {
			result = studentRepository.findByUsernameAndPassword(username, password).get();
		}
		return result;
	}
	
	public List<Student> getAllStudents() {
		Iterable<Student> foundStudents = studentRepository.findAll();
		List<Student> result = new ArrayList<Student>();
		foundStudents.forEach(result::add);
		return result;
	}
	
	public List<Grade> getGrades(Student student) {
		return studentRepository.findById(student.getId()).get().getGrades();
	}
	
	//public SchoolClass getSchoolClass(Student student) {}
	

}
