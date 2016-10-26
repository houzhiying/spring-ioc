package com.hzy.spring.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{
	
	private String brand;
	
	public void setBrand(String brand) {
		this.brand = brand;
	}

	//返回bean的对象
	@Override
	public Car getObject() throws Exception {
		return new Car(brand,300000);
	}

	//返回bean的类型
	@Override
	public Class<?> getObjectType() {
		return Car.class;
	}

	//是不是单实例
	@Override
	public boolean isSingleton() {
		return true;
	}

}
