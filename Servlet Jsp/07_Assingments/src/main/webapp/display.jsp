<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String name=session.getAttribute("username").toString();
	String address=request.getParameter("txtaddress");
%>
<h2>
Name :<%=name %>
<br>
Location: <%=address %>
</h2>
</body>
</html>