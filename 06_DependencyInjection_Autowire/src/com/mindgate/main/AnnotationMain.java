package com.mindgate.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class AnnotationMain {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		Address address= applicationContext.getBean("address",Address.class);
		
		System.out.println(address);
		address.setAddreeeId(123);
		address.setCity("Lonar");
		address.setState("Maharastra");
		address.setStreet("m.g.road");
		
		System.out.println(address.hashCode());
		System.out.println("_".repeat(50));
		
		Employee employee =applicationContext.getBean("employee",Employee.class);
		employee.setEmployeeId(101);
		employee.setName("Nitesh");
		employee.setSalary(5000);
		//employee.setHomeAddress(address);
		
		System.out.println(employee);
		
	}
}
