package com.Mindgate.Collector;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Mindgate.DAO.EmployeeDAO;
import com.Mindgate.Pojo.Employee;

@WebServlet("/GetAllEmployeeServlet")
public class GetAllEmployeeServlet extends HttpServlet {

	private PrintWriter out;
	private EmployeeDAO dao = new EmployeeDAO();
	
	HttpSession session;
	
	public GetAllEmployeeServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Set<Employee> employeeset = dao.getAllEmoployee();
		session= request.getSession();
		session.setAttribute("Employee", employeeset);
		response.sendRedirect("getallemployee.jsp");
	}

	}

