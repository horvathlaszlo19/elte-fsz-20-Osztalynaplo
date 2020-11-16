package com.eltefsz.e.classbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.eltefsz.e.classbook.service.TeacherService;
import com.eltefsz.e.classbook.webdomain.EditStudentForm;

@Controller
public class TeacherController {
	
	@Autowired
	private TeacherService teacherservice;
	
	@GetMapping(value = "/")
	public String index(Model model) {
		model.addAttribute("students",teacherservice.allStudent());
		return "index";
	}
	
	
	@GetMapping("edit-student/{id}")
    public String form(EditStudentForm editHotelForm, @PathVariable("id") int id, Model model) {
        //hotelTransformer.transform(hotelService.findHotelById(editHotelForm.getId()), editHotelForm);
        return "edit-student";
    }
	

//	@PostMapping("edit-hotel")
//    public String editHotel(@Valid EditHotelForm editHotelForm, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
//		if (bindingResult.hasErrors()) {
//			return "edit-hotel";
//		}
//		
//        Hotel hotel = hotelService.findHotelById(editHotelForm.getId());
//        hotelTransformer.transform(editHotelForm, hotel);
//        
//        hotelService.saveHotel(hotel);
//        
//        LOGGER.info("Hotel [id: {}] successfully saved.", hotel.getId());
//        redirectAttributes.addFlashAttribute("message", "Hotel successfully saved.");
//        return "redirect:hotels";
//    }

}
