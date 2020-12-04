package com.eltefsz.e.classbook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping(value = {"/", "/login"}) // Ez legyen az index?
	public String login(Model model) {
		return "login";
	}

}
