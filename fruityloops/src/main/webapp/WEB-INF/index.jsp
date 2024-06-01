<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Fruity Loops</title>
<link rel="stylesheet" type="text/css" href="/CSS/style.css">
</head>
<body>
<div class="container">
	<h1>Fruit Store</h1>
	<table class="table">
		<thead>
			<tr>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="oneFruit" items="${fruitsFromController}">
			<tr>
				<td>${oneFruit.name}</td>
				<td>${oneFruit.price}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>