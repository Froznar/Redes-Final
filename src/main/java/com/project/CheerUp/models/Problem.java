package com.project.CheerUp.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Problem {
	@Id @GeneratedValue private Long id;
	
	private String author;
	private String body;
	private Long timestamp;
	
	public Problem() {
		
	}
	
	public Problem(String author, String body, Long timestamp) {
		this.author = author;
		this.body = body;
		this.timestamp = timestamp;
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
	
	public Long getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
}
