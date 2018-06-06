package com.project.CheerUp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.CheerUp.models.Answer;
import com.project.CheerUp.models.Problem;
import com.project.CheerUp.repositories.AnswerRepository;

@Service
public class AnswerService {

	@Autowired
	private final AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	@Transactional(readOnly=true)
	public List<Answer> findAnswersToProblem(String author, Long timestamp){
		return answerRepository.findAnswersToProblem(author, timestamp);
	}
	
	@Transactional
	public void save(String pAuthor, Long pTimestamp, Answer answer) {
		answerRepository.save(pAuthor, pTimestamp, answer.getAuthor(), answer.getBody(), answer.getTimestamp());
	}
}
