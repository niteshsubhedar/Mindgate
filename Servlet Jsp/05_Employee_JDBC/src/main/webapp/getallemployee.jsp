<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.Mindgate.Pojo.Employee"%>
<%@page import="java.util.Set"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%Set<Employee> employeeset = (Set<Employee>)session.getAttribute("Employee"); %>
	
	<table border="1">
	<tr>
		<td>Employeeid</td>
		<td>Name</td>
		<td>Salary</td>
	</tr>
	
	
	<% for(Employee employee : employeeset) {%>
	<tr>
	<td><%=employee.getEmployeeId() %></td>
	<td><%=employee.getName() %></td>
	<td><%=employee.getSalary() %></td>
	</tr>
	<%} %>
		</table>
		
		
		<a href="addemployee.html">Add Employee</a>

</body>
</html>