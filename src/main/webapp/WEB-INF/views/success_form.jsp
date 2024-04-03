<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Complex Form</title>
</head>
<body>
	<h1>${student.name}</h1>
	<h1>${student.id}</h1>
	<h1>${student.dob}</h1>
	<h1>${student.courses}</h1>
	<h1>${student.gender}</h1>
	<h1>${student.address.street}, ${student.address.city}</h1>
</body>
</html>