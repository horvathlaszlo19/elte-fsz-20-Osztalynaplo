package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eltefsz.e.classbook.service.GradeService;
import com.eltefsz.e.classbook.service.StudentService;
import com.eltefsz.e.classbook.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherservice;
	
	@Autowired
	private GradeService gradeservice;
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping(value = {"/teacher"})
	public String index(Model model) {
		model.addAttribute("students",teacherservice.allStudent());
		return "teacher";
	}
	
	
}
