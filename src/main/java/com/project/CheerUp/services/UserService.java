package com.project.CheerUp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.CheerUp.models.User;
import com.project.CheerUp.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private final UserRepository userRepository;
	
	public UserService(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@Transactional(readOnly=true)
	public User findByUserName(String userName) {
		User result = userRepository.findByUserName(userName);
		return result;
	}
	
	@Transactional(readOnly=true)
	public List<User> findAll(){
		List<User> results = userRepository.findAll();
		return results;
	}
	
	@Transactional
	public User save(User user) {
		return userRepository.save(user.getUserName(), user.getUserPassword());
	}
	
	@Transactional
	public void update(String userName, String datos, String status) {
		userRepository.update(userName, datos, status);
	}
}
