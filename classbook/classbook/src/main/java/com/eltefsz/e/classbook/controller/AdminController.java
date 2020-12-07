package com.eltefsz.e.classbook.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.eltefsz.e.classbook.service.SchoolService;
import com.eltefsz.e.classbook.service.StudentService;
import com.eltefsz.e.classbook.service.TeacherService;
import com.eltefsz.e.classbook.webdomain.AddSchoolObject;
import com.eltefsz.e.classbook.webdomain.NewTeacher;


@Controller
public class AdminController {
	
	@Autowired
	private SchoolService schoolService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	
	

	@GetMapping(value = {"/admin","/admin/home"})
	public String home(Model model, Principal principal) {
		model.addAttribute("adminName", principal.getName());
		return "admin_home";
	}
	
	
	@GetMapping("/admin/addSchool")
	public String addSchool(Model model, Principal principal, AddSchoolObject addSchoolObject) {
		model.addAttribute("adminName", principal.getName());
		return "addSchool";
	}
	@PostMapping("/admin/addSchool")
	public String newSchool(AddSchoolObject addSchoolObject) {
		schoolService.addSchool(addSchoolObject.getName(), addSchoolObject.getCity(), addSchoolObject.getDaycare());
		return "redirect:/admin/addSchool";
	}

	
	@GetMapping("/admin/addTeacher")
	public String addTeacher(Model model, Principal principal, NewTeacher newTeacher) {
		model.addAttribute("adminName", principal.getName());
		return "addTeacher";
	}
	@PostMapping("/admin/addTeacher")
	public String addTeacher(NewTeacher newTeacher) {
		teacherService.addTeacher(newTeacher.getAge(), newTeacher.isSex(), newTeacher.getName(), newTeacher.getUsername(), newTeacher.getPassword(), newTeacher.getSubject());
		return "redirect:/admin/addTeacher";
	}
	
	/*
	@GetMapping("/admin/addStudent")
	public String addStudent(Model model, Principal principal, NewStudent newStudent) {
		model.addAttribute("adminName", principal.getName());
		return "addStudent";
	}
	@PostMapping("/admin/addStudent")
	public String newStudent(NewStudent newStudent) {
		
		return "redirect:/admin/addStudent";
	}*/
	
	
}
