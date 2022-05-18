package com.Mindgate.Controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {

	public HelloWorldServlet() {
		super();
		System.out.println("HelloWorldServlet Object Created ");
	}

	public void init(ServletConfig config) throws ServletException {
System.out.println("intit() Called ");
	}

	public void destroy() {
	System.out.println("destroy() Called ");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Service() Called ");
	}

}
