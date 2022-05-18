package com.Mindgate.Collector;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AcceptDetails" )
public class AcceptDetails extends HttpServlet {
 PrintWriter printWriter;
 private int num1;
 private int num2;
 private int answer;
    public AcceptDetails() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		printWriter=response.getWriter();
		num1 =Integer.parseInt(request.getParameter("txtnumber1"));
		num2 =Integer.parseInt(request.getParameter("txtnumber2"));
		answer = num1 + num2;
		printWriter.println("Answer : "+answer);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
