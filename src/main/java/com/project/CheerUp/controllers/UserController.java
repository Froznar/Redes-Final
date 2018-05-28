package com.project.CheerUp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@RequestMapping(method = RequestMethod.POST)
	public User create(@RequestBody User user) {
		return userService.save(user);
	}
}
