package com.hzy.spring.bean.relation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hzy.spring.bean.autowire.Adress;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");
		
//		Adress adress = (Adress) ctx.getBean("adress");
//		System.out.println(adress);
		
		Adress adress2 = (Adress) ctx.getBean("adress2");
		System.out.println(adress2);
	}

}
