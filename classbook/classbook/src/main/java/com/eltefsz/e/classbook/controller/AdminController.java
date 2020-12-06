package com.eltefsz.e.classbook.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

	@GetMapping(value = {"/admin","/admin/home"})
	public String home(Model model, Principal principal) {
		return "admin_home";
	}
	
}
