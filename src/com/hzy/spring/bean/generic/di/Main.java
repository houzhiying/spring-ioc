package com.hzy.spring.bean.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-di.xml");
		UserService userService = (UserService) ctx.getBean("userService");
		userService.add();
	}

}
