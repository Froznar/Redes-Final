package com.project.CheerUp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.CheerUp.models.Category;
import com.project.CheerUp.repositories.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@Transactional(readOnly=true)
	public List<Category> findAll(){
		return categoryRepository.findAll();
	}
}
