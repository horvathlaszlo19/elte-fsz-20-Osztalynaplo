package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.eltefsz.e.classbook.service.GradeService;
import com.eltefsz.e.classbook.service.StudentService;
import com.eltefsz.e.classbook.webdomain.AddGrade;

@Controller
public class AddGradeController {

	@Autowired
	private GradeService gradeService;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/addgrade/{id}")
	public String addGrade(@PathVariable("id") long id,AddGrade addgrade) {
		return "add-grade";
	}
		
	@PostMapping("addgrade")
	public String teacherAddGrade(AddGrade addgrade) {
		gradeService.addGrade(addgrade.getSubject(),addgrade.getGradeValue(),studentService.findStudentById(addgrade.getId()));
		return "redirect:teacher";
	}
}
