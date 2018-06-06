package com.project.CheerUp.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Problem {
	@Id @GeneratedValue private Long id;
	
	private String author;
	private String body;
	private Long timestamp;
	
	//@Relationship(type="BELONGS_IN", direction=Relationship.OUTGOING)
	//private Category category;
	
	public Problem() {

	}
	
	public Problem(String author, String body) {
		this.author = author;
		this.body = body;
		this.timestamp = System.currentTimeMillis();
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
	
	/*public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}*/
}
