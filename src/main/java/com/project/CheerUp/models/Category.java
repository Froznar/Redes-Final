package com.project.CheerUp.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Category {
	@Id @GeneratedValue Long id;
	private String categoryName;
	private String description;
	
	public Category() {
		
	}
	
	public Category(String categoryName, String description) {
		this.categoryName = categoryName;
		this.description = description;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
}
