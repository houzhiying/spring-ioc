package com.hzy.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法
 * @author maddy
 *
 */
public class InstanceCarFactory {
	
	private Map<String,Car> cars = null;
	
	public InstanceCarFactory() {
		cars = new HashMap<String,Car>();
		cars.put("audi", new Car("audi", 300000));
		cars.put("ford", new Car("ford", 400000));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}

}
