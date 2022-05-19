package com.mindgate.service;

import java.util.List;

import com.mingdate.pojo.Employee;

public interface EmployeeServiceInterface {

	public boolean addNewEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeByEmployeeId(int employeeId);
	
	public boolean updateEmployee(Employee employee);
	
	public boolean deleteEmployeeByEmployeeId(int EmplyeeId);
	
}
