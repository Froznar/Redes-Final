package com.project.CheerUp.models;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class User {
	
	@Id @GeneratedValue private Long id;
	
	private String userName;
	private String userPassword;
	private String email;
	private String datos;
	private String status;
	private Boolean isDeleted;
	private Long ranking;
	private String image;
	
	public User() {
		
	}
	
	public User(String name, String password, String email) {
		userName = name;
		userPassword = password;
		this.email = email;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String name) {
		userName = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String password) {
		userPassword = password;
	}
	
	public void setData(String data) {
		this.datos = data;
	}
	
	public String getData() {
		return datos;
	}
	
	public Boolean getIsDeleted() {
		return isDeleted;
	}
	
	public void setIsDeleted(Boolean deleted) {
		isDeleted = deleted;
	}
	
	public Long getRanking() {
		return ranking;
	}
	
	public void setRanking(Long ranking) {
		this.ranking = ranking;
	}
	
	public String getImage() {
		return image;
	}
	
	public void setImage(String image) {
		this.image = image;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
}
