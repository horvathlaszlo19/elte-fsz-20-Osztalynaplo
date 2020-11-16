package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.eltefsz.e.classbook.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentservice;
	
}
