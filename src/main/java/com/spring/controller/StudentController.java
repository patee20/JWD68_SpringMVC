package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.StudentBean;

@Controller
public class StudentController {
	
	@GetMapping("/student-create")
	public ModelAndView showForm(){ 
		
		return new ModelAndView("student-create", "studObj", new StudentBean());
	}
	
	@PostMapping("/student-create")
	public String createStudent(@Validated  @ModelAttribute("studObj")StudentBean obj,BindingResult br, Model m) {
		
		if(br.hasErrors()) {
			return "student-create"; //viewName
		}
		m.addAttribute("stuObj",obj);
		return "student-info";
	}
}
