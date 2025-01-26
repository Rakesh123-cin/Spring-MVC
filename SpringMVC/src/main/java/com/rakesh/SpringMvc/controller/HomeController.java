package com.rakesh.SpringMvc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api")
public class HomeController {
	
	@RequestMapping(path="/home", method=RequestMethod.GET)
	public String home(Model model)
	{
		System.out.println("This is home url");
		model.addAttribute("name","Aman Jha");
		model.addAttribute("id",324);
		return "index";		
	}
	
	@RequestMapping("/about")
	public ModelAndView help(ModelAndView mv)
	{
		mv.addObject("name","Rakesh Anand");
		List<String> skills = new ArrayList<>(Arrays.asList("Java","Spring","Spring Boot","Hibernate"));
		mv.addObject("skills",skills);
		mv.setViewName("about");
		return mv;
	}
}
