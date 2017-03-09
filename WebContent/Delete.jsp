<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<title>Delete</title>
</head>
<body>
<div>

	<div class="jumbotron" style="background-image:url('img.jpg');">
  		<div class="container">
   			 <h1 class="text-center" Style="color:white">Delete Page</h1>
 	 	</div>
	</div>

<br>
	<div class="col-xs-4 list-group" >
		<ul class="nav-pills nav-stacked">
			<li class="list-group-item"><a href="Insert.html">Insert</a></li>
			<li class="list-group-item"><a href="Update.html">Update</a></li>
			<li class="list-group-item"><a href="Delete.html">Delete</a></li>
			<li class="list-group-item"><a href="Search.html">Search</a></li>
			<li class="list-group-item"><a href="ViewAll.jsp">View All</a></li>
		</ul>
	</div>
	<div>
		<%
		int i=(Integer)request.getAttribute("res_delete");
		if(i==1)
			{
		%>
		
		<h2>Row Deleted successsfully</h2>
		<%
		}
		else {
		%>
		<h2>Row cant be Deleted</h2>
		<%
		}%>
		<%= i %>
	</div>
	<div class="form-horizontal col-xs-8">
		<form action="Query">
			<div>
				<h1>ID:</h1>
				<input type="text" class="form-control"  name="id" placeholder="Input ID"/><br>
			</div>
			<button  class="btn btn-danger" type="submit" value="Delete" name="number">Delete</button>
			
		</form>
	</div>
</div>
</body>
</html>