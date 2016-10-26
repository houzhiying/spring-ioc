package com.hzy.spring.bean;

public class HelloWorld {
	private String name;
	
	public void setName(String name) {
		this.name = name;
		System.out.println("setName :" + name);
	}
	
	public void hello(){
		System.out.println("hello :" + name);
	}
	
	public HelloWorld() {
		// TODO Auto-generated constructor stub
		System.out.println("helloWorld's constructor......");
	}

}
