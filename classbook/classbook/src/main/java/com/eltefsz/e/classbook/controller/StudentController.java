package com.eltefsz.e.classbook.controller;

import java.security.Principal;

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
	
	@GetMapping(value = {"/student","/student/home"})
	public String home(Model model, Principal principal) {
		Student student = studentService.findStudentByUniqueUsername(principal.getName());
		model.addAttribute("studentName", student.getName());
		model.addAttribute("studentClass", studentService.getSchoolClass(student).getName());
		model.addAttribute("gpa", studentService.getFormattedGPA(student));
		model.addAttribute("studentSchool", schoolClassService.getSchool(studentService.getSchoolClass(student)).getName());
		return "studenthome";
	}
	
	@GetMapping("/student/grades")
	public String grades(Model model, Principal principal) {
		Student student = studentService.findStudentByUniqueUsername(principal.getName());
		model.addAttribute("studentGrades", student.getGrades());
		return "grades";
	}
	
	@GetMapping("/student/gpa")
	public String gpa(Model model, Principal principal) {
		Student student = studentService.findStudentByUniqueUsername(principal.getName());
		model.addAttribute("gpa", studentService.getFormattedGPA(student));
		model.addAttribute("GPAs", studentService.getSubjectGPAs(student));
		return "gpa";
	}
	
	@GetMapping("/student/subjects")
	public String subjects(Model model, Principal principal) {
		Student student = studentService.findStudentByUniqueUsername(principal.getName());
		model.addAttribute("teachersAndSubjects", schoolClassService.getTeachersWithSubjects(studentService.getSchoolClass(student)));
		return "subjects";
	}
	
}
