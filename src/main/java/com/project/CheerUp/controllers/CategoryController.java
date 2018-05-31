package com.project.CheerUp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.CheerUp.models.Category;
import com.project.CheerUp.services.CategoryService;

@RestController
@RequestMapping("/")
public class CategoryController {
	@Autowired
	private final CategoryService categoryService;
	
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	@GetMapping("/categories")
	public List<Category> findAll(){
		return categoryService.findAll();
	}
}
