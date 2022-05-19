package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.mindgate.DAO.EmployeeDAOInterface;
import com.mingdate.pojo.Employee;

@Service("employeeService")
@Scope("prototype")
public class EmployeeService implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDAOInterface employeeDAOInterface;

	@Override
	public boolean addNewEmployee(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("inside employeeservice addemployee");
		return employeeDAOInterface.addNewEmployee(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {

		return employeeDAOInterface.getAllEmployee();
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {

		return employeeDAOInterface.getEmployeeByEmployeeId(employeeId);
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		return employeeDAOInterface.updateEmployee(employee);
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int EmplyeeId) {
		// TODO Auto-generated method stub
		return employeeDAOInterface.deleteEmployeeByEmployeeId(EmplyeeId);
	}

}
