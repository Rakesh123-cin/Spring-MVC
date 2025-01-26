<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help Page</title>
</head>
<body>
	<h1>My name is ${name}</h1>
	<h2>My skills are : </h2>
	<c:forEach var="s" items="${skills}">
		<h3>${s}</h3>
	</c:forEach>
</body>
</html>