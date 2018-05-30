package com.project.CheerUp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.CheerUp.models.Problem;
import com.project.CheerUp.repositories.ProblemRepository;

@Service
public class ProblemService {
	
	@Autowired
	private final ProblemRepository problemRepository;
	
	public ProblemService(ProblemRepository problemRepository) {
		this.problemRepository = problemRepository;
	}
	
	@Transactional(readOnly=true)
	public List<Problem> findByAuthor(String author){
		return problemRepository.findByAuthor(author);
	}

}
