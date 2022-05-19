package com.mindgate.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.rowmapper.EmployeeRowMapper;
import com.mingdate.pojo.Employee;

@Repository("employeeDAO")
@Scope("prototype")
public class EmployeeDAO implements EmployeeDAOInterface {

	private JdbcTemplate jdbcTemplate;
	private static final String INSERT_EMPLOYEE = "INSERT INTO employee_details(name,salary) VALUES(?,?)";
	private static final String SELECT_ALL_EMLP_STRING = "SELECT * FROM employee_details";
	private static final String SELECT_EMPLOYEE_BY_EMPLOYEEID_STRING = "SELECT * FROM employee_details WHERE employee_id=?";
	private static final String UPDATE_EMPLOYEE = "UPDATE employee_details SET name=? ,salary=? WHERE employee_id = ? ";
	private static final String DELETE_EMPLOYEE = "DELETE employee_details WHERE employee_id =?";

	private int resultcount;

	public EmployeeDAO(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addNewEmployee(Employee employee) {
		System.out.println("inserting new Employee into database");
		System.out.println(employee);

		Object[] args = { employee.getName(), employee.getSalary() };
		resultcount = jdbcTemplate.update(INSERT_EMPLOYEE, args);

		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public List<Employee> getAllEmployee() {

		List<Employee> allEmployee = jdbcTemplate.query(SELECT_ALL_EMLP_STRING, new EmployeeRowMapper());

		return allEmployee;
	}

	@Override
	public Employee getEmployeeByEmployeeId(int employeeId) {

		Object[] args = { employeeId };
		Employee employee = jdbcTemplate.queryForObject(SELECT_EMPLOYEE_BY_EMPLOYEEID_STRING, args,
				new EmployeeRowMapper());

		return employee;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		System.out.println(employee);
		Object[] args = { employee.getName(), employee.getSalary(), employee.getEmployeeId() };

		resultcount = jdbcTemplate.update(UPDATE_EMPLOYEE, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteEmployeeByEmployeeId(int EmplyeeId) {

		Object[] args = { EmplyeeId };

		resultcount = jdbcTemplate.update(DELETE_EMPLOYEE, args);
		if (resultcount > 0)
			return true;
		else
			return false;
	}

}
