package com.project.CheerUp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project.CheerUp.models.Answer;
import com.project.CheerUp.models.Problem;
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
	public List<Answer> findAnswersToProblem(@RequestParam String author, @RequestParam Long timestamp){
		return answerService.findAnswersToProblem(author,timestamp);
	}
	
	@RequestMapping(value ="/answer_problem", method=RequestMethod.POST)
	public String save(@ModelAttribute("author") String author, @ModelAttribute("timestamp") Long timestamp, @ModelAttribute("body") String body, @CookieValue(value="login", defaultValue="-1") String userName) {
		answerService.save(author,timestamp,new Answer(userName,body));
		return author + " - " + userName + " - " + body;
	}
}
