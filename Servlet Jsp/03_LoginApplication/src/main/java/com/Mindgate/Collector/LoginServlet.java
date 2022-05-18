package com.Mindgate.Collector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	PrintWriter printWriter;
private String loginId;
private String password;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		loginId =request.getParameter("txtlogin");
		password=request.getParameter("txtpassword");
		
		printWriter=response.getWriter();
		if(loginId.equals("Nitesh") && password.equals("9158588027"))
			printWriter.println("Welcome "+loginId);
		else
			printWriter.println("invalid password");

	}

}
