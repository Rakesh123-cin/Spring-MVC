package com.rakesh.SpringMvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rakesh.SpringMvc.model.User;
import com.rakesh.SpringMvc.service.UserService;

@Controller
@RequestMapping("/api")
public class ContactController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/contact")
	public String showForm()
	{
		return "contact";
	}
	
	/*@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String email, @RequestParam("name") String userName, 
			                                               @RequestParam("password") String userPassword, Model model)
	{
		User user = new User();
		user.setUserEmail(email);
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		model.addAttribute("User",user);
		return "success";
	}*/
	
	@RequestMapping(path="/processForm", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
		if(user.getEmail().isBlank() || user.getName().isBlank() || user.getPassword().isBlank())
		{
			return "redirect:/api/contact";
		}
		int id = service.registerUser(user);
		model.addAttribute("id",id);
		return "success";
	}
	
	@ModelAttribute("desc")
	public String desc()
	{
		return "Learn Code With Rakesh";
	}
}
