package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eltefsz.e.classbook.service.GradeService;
import com.eltefsz.e.classbook.service.SchoolClassService;
import com.eltefsz.e.classbook.service.StudentService;
import com.eltefsz.e.classbook.service.TeacherService;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherservice;
	
	@Autowired
	private SchoolClassService schoolclassservice;
	
	@Autowired
	private StudentService studentservice;
	
	@GetMapping(value = {"/teacher"})
	public String index(Model model) {
		model.addAttribute("students",teacherservice.allStudent());
		return "teacher";
	}
	
	@GetMapping(value = "/classes")
	public String teacherClasses(Model model) {
		model.addAttribute("classes",schoolclassservice.getAllSchoolClasses());
		return "classes";
	}
	
	@GetMapping(value = "/studentsOfClass/{id}")
	public String studentOfClass(@PathVariable("id") int id, Model model) {
		model.addAttribute("studentsOfClass",schoolclassservice.getStudent(schoolclassservice.findSchoolClassById(id)));
		return "students_of_class";
	}
	
	
}
