package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Addressmain {

	public static void main(String[] args) {
		
		System.out.println("Main Start");
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("spring.xml");
		
		Employee employee =applicationContext.getBean("employee1",Employee.class);
		
		System.out.println(employee);
		
		System.out.println("main end ");
	}

}
