package com.project.CheerUp.controllers;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.CheerUp.models.User;
import com.project.CheerUp.services.UserService;


@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private final UserService userService;
	

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	
	@GetMapping("/user")
	public User findByUserName(@RequestParam String userName) {
		return userService.findByUserName(userName);
	}
	
	@GetMapping("/users")
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@RequestMapping(value="/register", method = RequestMethod.POST) //Solo registra usuario
	public String create(@ModelAttribute User user, HttpServletResponse response) {
		response.addCookie(new Cookie("login", user.getUserName()));
		userService.save(user);
		return "User added!";
	}
	
	@RequestMapping(value="/verify", method= RequestMethod.POST) //Verifica datos del logeo.
	public String verify(@ModelAttribute User user, HttpServletResponse response) {
		User logged_user = userService.findByUserName(user.getUserName());
		if(logged_user == null) return "USER DOES NOT EXIST!";
		if(!logged_user.getUserPassword().equals(user.getUserPassword())) return "INCORRECT PASSWORD";
		response.addCookie(new Cookie("login", user.getUserName()));
		return "CORRECT";
	}
	
	@RequestMapping(value="/update", method= RequestMethod.POST)
	public String update(@ModelAttribute("datos") String datos, @ModelAttribute("status") String status, @CookieValue(value="login", defaultValue="-1") String userName){
		userService.update(userName,datos,status);
		return datos + " " + status;
	}
}
