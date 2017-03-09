<%@ taglib prefix="db" uri="WEB-INF/dbtag.tld" %>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<html>
<head>
</head>
<body>
<div>

	<div class="jumbotron" style="background-image:url('img.jpg');">
  		<div class="container">
   			 <h1 class="text-center" Style="color:white">Update Page</h1>
 	 	</div>
	</div>

<br>
	<div class="col-xs-4 list-group" >
		<ul class="nav-pills nav-stacked">
			<li class="list-group-item"><a href="Insert.html">Insert</a></li>
			<li class="list-group-item"><a href="Update.html">Update</a></li>
			<li class="list-group-item"><a href="Delete.html">Delete</a></li>
			<li class="list-group-item"><a href="Search.html">Search</a></li>
			<li class="list-group-item"><a href="ViewAll.html">View All</a></li>
		</ul>
	</div>
	<div>
		<%
 			int i=(Integer)request.getAttribute("res_insert");
 			pageContext.setAttribute("insertResult", i);
 		%>
    	<db:UpdateResult/>
	</div>
	<div class="col-xs-8">
	
		<form action="Query" name="addForm" onsubmit="return validate()">
			<b>ID:</b><input class="form-control" type="text" name="id"/><br>
			<b>Name:</b><input class="form-control" type="text" name="name"/><br>
			<b>Salary:</b><input class="form-control" type="text" name="salary"/><br>
			<button  class="btn btn-success" type="submit" value="update" name="number">Update</button>
			
		</form>		
	</div>
</div>
</body>
</html>