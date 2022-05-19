package com.mingdate.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;
import com.mingdate.pojo.Employee;

public class EmployeeCRUDMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee(0, "Rajveer", 15000);

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		EmployeeServiceInterface employeeServiceInterface = applicationContext.getBean("employeeService",
				EmployeeService.class);

//boolean result = employeeServiceInterface.addNewEmployee(employee);
//	if(result)
//		System.out.println("Employee Added successfully");
//	else
//		System.out.println("failed to add Employee");

//	List<Employee> allEmployees =employeeServiceInterface.getAllEmployee();
//	for (Employee emp : allEmployees) {
//		System.out.println(emp);
//	}
//	System.out.println("_".repeat(50));
//	
//	Employee emp1=employeeServiceInterface.getEmployeeByEmployeeId(3);
//	System.out.println(emp1);

//		Employee employee2 = new Employee(41, "Ravi Ganesh Subhedar", 8000);
//		boolean result = employeeServiceInterface.updateEmployee(employee2);
//		if (result)
//			System.out.println("Employee update successfully");
//		else
//			System.out.println("failed to update Employee");
		
		
		boolean result = employeeServiceInterface.deleteEmployeeByEmployeeId(3);
		if (result)
			System.out.println("Employee delete successfully");
		else
			System.out.println("failed to delete Employee");

	}

}
