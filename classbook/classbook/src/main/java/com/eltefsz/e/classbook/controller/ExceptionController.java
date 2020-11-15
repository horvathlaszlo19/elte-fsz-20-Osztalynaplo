package com.eltefsz.e.classbook.controller;

//import javax.xml.ws.soap.Addressing;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.eltefsz.e.classbook.exception.BusinessException;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(code = HttpStatus.BAD_GATEWAY)
	public String handleCustomException(BusinessException ex, Model model) {
		model.addAttribute("errorCode", ex.getErrorCode());
		model.addAttribute("errorMessage", ex.getErrorMessage());
		return "error";
	}

}
