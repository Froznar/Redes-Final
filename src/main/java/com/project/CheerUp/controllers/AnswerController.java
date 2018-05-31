package com.project.CheerUp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.CheerUp.models.Answer;
import com.project.CheerUp.services.AnswerService;

@RestController
@RequestMapping("/")
public class AnswerController {

	@Autowired
	private final AnswerService answerService;
	
	public AnswerController(AnswerService answerService) {
		this.answerService = answerService;
	}
	
	@GetMapping("/answers")
	List<Answer> findAnswersToProblem(@RequestParam String author, @RequestParam Long timestamp){
		return answerService.findAnswersToProblem(author,timestamp);
	}
}
