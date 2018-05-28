package com.project.CheerUp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	//@ResponseBody
	String LogIn(Model model) {
		model.addAttribute("name","Rapange");
		return "index.html";
	}
	
}
