package com.mindgate.DAO;

import java.util.List;

import com.mingdate.pojo.Employee;

public interface EmployeeDAOInterface {

	public boolean addNewEmployee(Employee employee);

	public List<Employee> getAllEmployee();

	public Employee getEmployeeByEmployeeId(int employeeId);

	public boolean updateEmployee(Employee employee);

	public boolean deleteEmployeeByEmployeeId(int EmplyeeId);
}
