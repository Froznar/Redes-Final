package com.project.CheerUp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.CheerUp.models.Problem;
import com.project.CheerUp.services.ProblemService;

@RestController
@RequestMapping("/")
public class ProblemController {

	@Autowired
	private final ProblemService problemService;
	
	public ProblemController(ProblemService problemService) {
		this.problemService = problemService;
	}
	
	@GetMapping("/problem")
	public List<Problem> findByAuthor(@RequestParam String author) {
		return problemService.findByAuthor(author);
	}
}
