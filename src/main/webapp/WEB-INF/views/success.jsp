<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success page</title>
</head>
<body>
	<h1 class="text-center">${Header}</h1>
	<p class="text-center">${Desc}</p>
	<h1 class="text-success">${msg}</h1>
	<hr />
	<h1>Welcome, ${user.username}</h1>
	<h1>Your email address is ${user.email}</h1>
	<h1>Your password is ${user.password}</h1>
</body>
</html>