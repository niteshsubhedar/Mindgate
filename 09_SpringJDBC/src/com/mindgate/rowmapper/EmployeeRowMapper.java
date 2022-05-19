package com.mindgate.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.mingdate.pojo.Employee;

@Component("employeeRowMapper")
public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet resultset, int i) throws SQLException {
		
		
		int employeeId= resultset.getInt("employee_Id");
		String name = resultset.getString("name");
		double salary=resultset.getDouble("salary");
		
		Employee employee =new Employee(employeeId, name, salary);
		
		return employee;
	}

	
}
