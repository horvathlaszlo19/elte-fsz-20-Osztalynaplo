package com.eltefsz.e.classbook.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.service.SchoolClassService;
import com.eltefsz.e.classbook.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private SchoolClassService schoolClassService;
	
	@GetMapping("/student/home")
	public String home(Model model, int id) {
		Student student = studentService.findStudentById((long) id);
		model.addAttribute("studentName", student.getName());
		model.addAttribute("studentClass", studentService.getSchoolClass(student).getName());
		model.addAttribute("studentSchool", schoolClassService.getSchool(studentService.getSchoolClass(student)).getName());
		return "studenthome";
	}
	
	@GetMapping("/student/grades")
	public String grades(Model model, int id) {
		Student student = studentService.findStudentById((long) id);
		model.addAttribute("studentGrades", student.getGrades());
		return "grades";
	}
	
	@GetMapping("/student/gpa")
	public String gpa(Model model, int id) {
		Student student = studentService.findStudentById((long) id);
		model.addAttribute("gpa", studentService.calculateGPA(student));
		return "gpa";
	}
	
	@GetMapping("/student/subjects")
	public String subjects(Model model, int id) {
		Student student = studentService.findStudentById((long) id);
		model.addAttribute("subjects", schoolClassService.getSubjects(studentService.getSchoolClass(student)));
		List<String> teacherNames = new ArrayList<String>();
		schoolClassService.getTeachers(studentService.getSchoolClass(student)).forEach(t -> teacherNames.add(t.getName()));
		model.addAttribute("teachers", teacherNames);	
		return "subjects";
	}
	
}
