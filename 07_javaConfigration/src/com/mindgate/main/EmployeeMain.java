package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		System.out.println("ApllicationContext is Created");

		Address address = applicationContext.getBean("address", Address.class);
		System.out.println(address);

		System.out.println("_".repeat(50));

		Employee employee = applicationContext.getBean("employee", Employee.class);
		System.out.println(employee);
	}
}
