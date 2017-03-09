<%@ taglib prefix="db" uri="WEB-INF/dbtag.tld"%>
<link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<html>
 <head>
    <title>Search</title>
 </head>
 <body>
 
 <% int id=(Integer)(request.getAttribute("ID"));
 pageContext.setAttribute("search",id);
 %>
    <db:SearchResult/>
 </body>
</html>