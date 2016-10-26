package com.hzy.spring.bean.autowire.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-spel.xml");
		Adress adress = (Adress) ctx.getBean("adress");
		System.out.println(adress);
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
	}

}
