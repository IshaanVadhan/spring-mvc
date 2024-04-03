<%@ page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>
	<h1>This is help page.</h1>
	<%
	/* String name = (String) request.getAttribute("name"); */
	LocalDateTime datetime = (LocalDateTime) request.getAttribute("datetime");
	%>
	<%-- <h1>
		My name is
		<%=name%>
	</h1> --%>
	<h1>My name is ${name}</h1>
	<h1>
		<%=datetime.toString()%>
	</h1>

	<hr />

	<c:forEach var="item" items="${marks}">
		<%-- <h1>${item}</h1> --%>
		<c:out value="${item}"></c:out>
	</c:forEach>
</body>
</html>