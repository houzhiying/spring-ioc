package com.hzy.spring.bean.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		NewPerson newPerson = (NewPerson) cxt.getBean("newPerson");
		System.out.println(newPerson);
		
		DataSource dataSource = (DataSource) cxt.getBean("dataSource");
		System.out.println(dataSource.getProperties());
		
		Person person4 = (Person) cxt.getBean("person4");
		System.out.println(person4);
		
		
		Person person5 = (Person) cxt.getBean("person5");
		System.out.println(person5);
	}

}
