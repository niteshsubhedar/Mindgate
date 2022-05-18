<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Print Multiplication Table</h3>
	<%!int number;%>

	<%
	number = Integer.parseInt(request.getParameter("txtnumber"));
	%>
	<table border="1">
		<%
		for (int i = 1; i <= 10; i++) {
		%>

		<tr>
			<td><%=number%></td>
			<td><%=i%></td>
			<td><%=(number * i)%></td>
		</tr>



		<%
		}
		%>
		
	</table>
</body>
</html>