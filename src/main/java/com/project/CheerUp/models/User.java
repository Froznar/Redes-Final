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
	/*private String data;
	private String status;
	private Boolean isDeleted;
	private Long ranking;
	private String image;*/
	
	private User() {
		
	}
	
	public User(String name, String password) {
		userName = name;
		userPassword = password;
		
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String name) {
		userName = name;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String password) {
		userPassword = password;
	}
	
	
	
}
