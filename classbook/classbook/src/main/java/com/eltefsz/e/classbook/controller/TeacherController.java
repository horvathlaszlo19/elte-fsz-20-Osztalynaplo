package com.eltefsz.e.classbook.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eltefsz.e.classbook.domain.Teacher;
import com.eltefsz.e.classbook.service.GradeService;
import com.eltefsz.e.classbook.service.StudentService;
import com.eltefsz.e.classbook.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherservice;
	
	@Autowired
	private StudentService studentService;
		
	@GetMapping(value = {"/teacher"})
	public String index(Model model, Principal principal) {
		Teacher teacher = teacherservice.findTeacherByUniqueUsername(principal.getName());
		model.addAttribute("teacherName",teacher.getName());
		model.addAttribute("teacherClasses", teacherservice.getSchoolCLasses(teacher));
		return "teacher";
	}
}
