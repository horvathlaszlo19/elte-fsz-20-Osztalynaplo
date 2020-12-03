package com.eltefsz.e.classbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@GetMapping("/")
	public String index(Model model) {
		//return "redirect:student";
		return "redirect:teacher";
	}

}
