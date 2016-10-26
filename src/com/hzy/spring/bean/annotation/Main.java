package com.hzy.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzy.spring.bean.annotation.controller.UserController;
import com.hzy.spring.bean.annotation.repository.UserRepositoryImpl;
import com.hzy.spring.bean.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-annotation.xml");
		
//		TestObject to = (TestObject) ctx.getBean("testObject");
//		System.out.println(to);
		
//		UserRepositoryImpl userRepository = (UserRepositoryImpl) ctx.getBean("userRepository");
//		System.out.println(userRepository);
		
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
		
		UserController userController = (UserController) ctx.getBean("userController");
		System.out.println(userController);
		userController.execute();
	}
}
