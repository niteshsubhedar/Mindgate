package com.Mindgate.Collector;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private String loginId;
	private String password;
	
    public LoginServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		loginId=request.getParameter("txtlogin");
		password=request.getParameter("txtpassword");
		
		if(loginId.equals("Nitesh") && password.equals("9158588027"))
			response.sendRedirect("success.html");
		else
			response.sendRedirect("failure.html");
	}

}
