package com.Mindgate.Collector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Mindgate.DAO.EmployeeDAO;
import com.Mindgate.Pojo.Employee;

@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {

	private String name;
	private double salary;
	private PrintWriter out;
	private EmployeeDAO employeeDAO = new EmployeeDAO();
	private boolean result;

	public AddEmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		name = request.getParameter("txtname");
		salary = Double.parseDouble(request.getParameter("txtsalary"));

		out = response.getWriter();
		//out.println("Name :: " + name);
		//out.println("Salary :: " + salary);

		Employee employee = new Employee(0, name, salary);

		result = employeeDAO.addEmployee(employee);
		
		response.setContentType("text/html");
		if (result) {
			
			//out.print("Record Added SuccessFully...!");
			response.sendRedirect("GetAllEmployeeServlet");
			out.print("<a href=employeehome.html> HOme Page </a>");
		} else
			out.print("Failed to add recored");
	}

}
