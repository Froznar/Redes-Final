package com.project.CheerUp.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Answer {

	@Id @GeneratedValue Long id;
	private String author;
	private String body;
	private Long timestamp;
	private Long rating;
	
	public Answer() {
		
	}
	
	public Answer(String author, String body) {
		this.author = author;
		this.body = body;
		this.timestamp = System.currentTimeMillis();
		this.rating = (long) 0;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getBody() {
		return body;
	}
	
	public void setBody(String body) {
		this.body = body;
	}
	
	public Long getRating() {
		return rating;
	}
	
	public void setRating(Long rating) {
		this.rating = rating;
	}
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
}
