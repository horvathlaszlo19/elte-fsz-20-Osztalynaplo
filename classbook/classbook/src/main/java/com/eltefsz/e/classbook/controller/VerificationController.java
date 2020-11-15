package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eltefsz.e.classbook.domain.GradeValue;
import com.eltefsz.e.classbook.domain.Student;
import com.eltefsz.e.classbook.domain.Subject;
import com.eltefsz.e.classbook.service.StudentService;
import com.eltefsz.e.classbook.service.TeacherService;

@Controller
public class VerificationController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	
	@PostMapping("/verify")
	public String loginVarify(Model model, @RequestParam("username") String username, @RequestParam("password") String password) {
		
		
		if ( studentService.findStudent(username, password).isPresent() ) {
			
			Student student = studentService.findStudent(username, password).get();
			model.addAttribute("student", student);
			model.addAttribute("studentName", student.getName());
			model.addAttribute("studentGrades", studentService.getGrades(student.getId()));
			
			return "student";
			
		} else if ( teacherService.findTeacher(username, password).isPresent() ) {
			
			model.addAttribute("teacher", teacherService.findTeacher(username, password).get());
			model.addAttribute("teacherName", teacherService.findTeacher(username, password).get().getName());
			model.addAttribute("subjects", Subject.values());
			model.addAttribute("values", GradeValue.values());
			
			return "teacher";
			
		} else {
			
			model.addAttribute("errMsg", "Login was unsuccessful! Please try again.");
			return "login";
			
		}
		
		
	}
}