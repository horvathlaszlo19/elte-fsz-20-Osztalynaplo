package com.eltefsz.e.classbook.service;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eltefsz.e.classbook.domain.Grade;
import com.eltefsz.e.classbook.domain.GradeValue;
import com.eltefsz.e.classbook.domain.SchoolClass;
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.domain.Subject;
import com.eltefsz.e.classbook.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private SchoolClassService schoolClassService;
	
	//TEST
	public Student findStudentByUniqueUsername(String username) {
		return studentRepository.findByUsername(username);
	}
	

//	public void addStudent(int age, boolean sex, String name, String username, String password) {
//		Student student = new Student(age, sex, name, username, password);
//		studentRepository.save(student);
//	}
	
	public Student findStudentById(Long id) {
		Student result = new Student();
		if( studentRepository.findById(id).isPresent() ) {
			result = studentRepository.findById(id).get();
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
	
	public double calculateGPA(Student student) {
		List<Integer> a = new ArrayList<Integer>();
		student.getGrades().forEach(g -> a.add(g.getValue().ordinal()+1));
		double sum = 0;
		for(int i: a) sum += i;
		sum /= a.size();
		student.setGPA(sum);
		return sum;
	}
	
	public String getFormattedGPA(Student student) {
		DecimalFormat df = new DecimalFormat("#.##");
		return df.format(this.calculateGPA(student));
	}
	
	public double calculateGPAbySubject(Student student, Subject subject) {
		List<Integer> a = new ArrayList<Integer>();
		student.getGrades().forEach(g -> {
			if( g.getSubject().equals(subject) ) {
				a.add(g.getValue().ordinal()+1);
			}
		});		
		double sum = 0;
		for(int i: a) sum += i;
		sum /= a.size();
		return sum;
	}
	
	public String getFormattedSubjectGPA(Student student, Subject subject) {
		DecimalFormat df = new DecimalFormat("#.##");
 		return df.format(this.calculateGPAbySubject(student, subject));
	}
	
	public List<Grade> getGradesBySubject(Student student, Subject subject) {
		List<Grade> gradeList = new ArrayList<Grade>();
		studentRepository.findById(student.getId()).get().getGrades().forEach(g -> {
			if( g.getSubject().equals(subject) ) {
				gradeList.add(g);
			}
		});
		return gradeList;
	}
	
	public Map<String,String> getSubjectGPAs(Student student){
		Map<String, String> values = new HashMap<String, String>();
		schoolClassService.getSubjects(this.getSchoolClass(student)).forEach(
			s -> values.put(s.getName(), this.getFormattedSubjectGPA(student, s))
		);
		return values;
	}
	
	public SchoolClass getSchoolClass(Student student) {
		return student.getStudentSchoolClass();
	}
	
	
	public Map<Subject, List<Grade>> getGradesMap(Student student){
		Map<Subject, List<Grade>> values = new HashMap<Subject, List<Grade>>();
		schoolClassService.getSubjects(student.getStudentSchoolClass()).forEach(
			s -> values.put(s, this.getGradesBySubject(student, s))
		);
		return values;
	}

}
