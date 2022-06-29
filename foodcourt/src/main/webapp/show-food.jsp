<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
</head>
<body>
<table border="1">
	<tr>
		<th>Code</th>
		<th>Items</th>
		<th>Type</th>
		<th>price</th>
	</tr>
	<c:forEach var = "items" items="${foodItems}">
	<tr>
	<td>${items.id}</td>
	<td>${items.name}</td>
	<td>${items.type}</td>
	<td>${items.price}</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>