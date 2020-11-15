package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eltefsz.e.classbook.domain.GradeValue;
import com.eltefsz.e.classbook.domain.Subject;
import com.eltefsz.e.classbook.service.GradeService;
import com.eltefsz.e.classbook.service.StudentService;

@Controller
public class AddGradeController {

	@Autowired
	private GradeService gradeService;
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/AddGrade")
	public String teacherAddsGrade(Model model, @RequestParam("student") Long id, 
			@RequestParam("subject") Subject subject, @RequestParam("value") GradeValue value) {
		
		if ( studentService.findStudentById(id).isPresent() ) {
			gradeService.addGrade(subject, value, studentService.findStudentById(id).get());
			model.addAttribute("msg", "successful transaction");
		} else {
			model.addAttribute("msg", "Error: This student ID does not exist. Try again.");
		}
		
		return "teacher";
		
	}
}
