<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.SQL" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search</title>
</head>
<body>
 
	<%
	int id=(Integer)(request.getAttribute("ID"));
	String[] table = new SQL().search(id); 
	String idd = table[0] ;
	%>
	
	<h2>Search Result abc=${table[0]}</h2>
	
	<table border =3>
		<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Salary</th>
		<tr>
			<td>${idd} </td>
			<td>${table[1]}</td>
			<td><%= table[2] %></td>
		</tr>
	
	</table>

</body>
</html>