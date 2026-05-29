package com.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@ModelAttribute("framework_list")
	public List<String> getAllFrameworks(){
		List<String> lst = new ArrayList<>();
		lst.add("Bootstrap");
		lst.add("Spring Framework");
		lst.add("Collection Framework");
		
		return lst;
	}
	
	@ModelAttribute("number_list")
	public List<Integer> getAllNumber(){
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		return lst;
	}
	
	@ModelAttribute("country_list")
	public Map<String, String> getAllCountries(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("MM", "Myanmar");
		map.put("JP", "Japan");
		map.put("US", "United States");
		return map;
	}
	
	@ModelAttribute("skill_list")
	public Map<String, String> getAllSkills(){
		Map<String, String> map = new HashMap<String, String>();
		map.put("Struts", "struts");
		map.put("Hibernate", "hibernate");
		map.put("Spring", "spring");
		map.put("Apache", "apache");
		return map;
	}
}
