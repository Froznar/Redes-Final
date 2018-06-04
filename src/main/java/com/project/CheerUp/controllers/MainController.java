package com.project.CheerUp.controllers;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@RequestMapping("/")
	//@ResponseBody
	String Index(Model model) {
		model.addAttribute("name","Rapange");
		return "index.html";
	}
	
	@RequestMapping("/login")
	String LogIn() {
		return "login.html";
	}
	
	@RequestMapping("/profile/{userName}")
	//@ResponseBody
	String Profile(@PathVariable("userName") String userName, @CookieValue(value = "login", defaultValue = "-1") String value) {
		/*if(userName.equals(value)) return "Es tu usuario:" + userName;
		return userName;*/
		return "AskProblem.html";
	}
	
	@RequestMapping("/answerProblem")
	String answerProblem() {
		return "answerProblem.html";
	}
}
