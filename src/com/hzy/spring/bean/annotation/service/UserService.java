package com.hzy.spring.bean.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hzy.spring.bean.annotation.TestObject;
import com.hzy.spring.bean.annotation.repository.UserRepository;
import com.hzy.spring.bean.annotation.repository.UserRepositoryImpl;


@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired(required=false)
	private TestObject testObject;
	
	public void add(){
		System.out.println("UserService add...");
		userRepository.save();
		System.out.println(testObject);
	}

}
