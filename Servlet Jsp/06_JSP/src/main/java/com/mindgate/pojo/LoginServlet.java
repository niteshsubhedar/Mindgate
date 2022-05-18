package com.mindgate.pojo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	private String userid;
	private String password;
	
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 userid=request.getParameter("txtname");
		 password=request.getParameter("txtpassword");
		 
		 
		 if(userid.equals("Nitesh") && password.equals("Nitesh@123")) {
			// response.sendRedirect("success.jsp");
			 RequestDispatcher requestDispatcher =request.getRequestDispatcher("success.jsp");
			 requestDispatcher.forward(request, response);
			 
		 }
		 else {
			 RequestDispatcher requestDispatcher =request.getRequestDispatcher("failuar.jsp");
			 requestDispatcher.forward(request, response);

		 }
		 
	}

}
