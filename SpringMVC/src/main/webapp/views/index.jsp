<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>/home</h1>
	<%
	   String name = (String)request.getAttribute("name");
		int id = (int) request.getAttribute("id");
	%>
	<h1>Name is : <%= name %></h1>
	<%
		out.println("Id is "+ id);
	%>
</body>
</html>