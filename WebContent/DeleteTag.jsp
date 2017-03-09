<%@ taglib prefix="db" uri="WEB-INF/dbtag.tld"%>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<html>
 <head>
    <title>VIEW ALL</title>
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
 	pageContext.setAttribute("deleteResult", i);
 	%>
    <db:DeleteResult/>
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