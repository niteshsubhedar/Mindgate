package com.mindgate.main;

import com.mindgate.pojo.Address;
import com.mindgate.pojo.Employee;

public class Main {

	public static void main(String[] args) {
		Address address = new Address(123, "Balaji Shop", "mumbai", "Maharastra");
		Employee employee = new Employee(101, "Nitesh Subhedar", 10000, address);
		
		System.out.println(employee);

	}

}
