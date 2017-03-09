<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.SQL" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


<title>Insert title here</title>
</head>
<body  class="well">
<div >
    <header><h2 style="color:blue;text-align:center">All Record</h2></header>

	<%String[][] table = new SQL().viewAll(); %>
	
	<div style="width: 100%;">
		  <div style="float:left; width: 50%">
				<h4><a href="Insert.html">Insert</a></h4>		  	
				<h4><a href="Update.html">Update</a></h4>
				<h4><a href="Delete.html">Delete</a></h4>
				<h4><a href="Search.html">Search</a></h4>
				
		  </div>
		
		  <div style="float:center;">
		  <br><br>
				  <table border =3>
				
					<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Salary</th>
					<th></th>
					<tr>
					
				<%for (int i=0;i<table.length;i++) { %>
					
					<tr>
						<td><%= table[i][0] %></td>
						<td><%= table[i][1] %></td>
						<td><%= table[i][2] %></td>
						<td><a href="/SQL_Query/Query?id=<%=table[i][0]%>&flag=1&number=Delete">Delete</a></td>
					</tr>
					<%}
				%>
				</table>
		
		  </div>
   
	</div>
</div>	
</body>
</html>