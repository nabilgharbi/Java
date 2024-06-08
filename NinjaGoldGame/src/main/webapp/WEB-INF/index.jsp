
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>   
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
	<link rel="stylesheet" href="css/main.css">
	<title>Ninja Gold</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<h2 id="counter">Your Gold: <c:out value="${gold}"/><a id="link" href="/reset">Reset</a></h2>
		</div>
		<div id="forms">
			<form class="form" action="/process" method="post">
				<h2 id="location">Farm</h2>
				<h4 id="description">(earns 10-20 gold)</h4>
				<input type="hidden" name="hidden_location" value="farm">
				<a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
			</form>
			<form class="form" action="/process" method="post">
				<h2 id="location">Cave</h2>
				<h4 id="description">(earns 5-10 gold)</h4>
				<input type="hidden" name="hidden_location" value="cave">
				<a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
			</form>
			<form class="form" action="/process" method="post">
				<h2 id="location">House</h2>
				<h4 id="description">(earns 2-5 gold)</h4>
				<input type="hidden" name="hidden_location" value="house">
				<a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
			</form>
			<form class="form" action="/process" method="post">
				<h2 id="location">Casino</h2>
				<h4 id="description">(earns/takes 0-50 gold)</h4>
				<input type="hidden" name="hidden_location" value="casino">
				<a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
			</form>
			<form class="form" action="/process" method="post">
				<h2 id="location">Spa</h2>
				<h4 id="description">(takes 5-20 gold)</h4>
				<input type="hidden" name="hidden_location" value="spa">
				<a href='/process_money'><button type="submit" class="btn btn-warning">Find Gold!</button></a>
			</form>
		</div>
		<div id="output">
			<ul>
				<% if(session.getAttribute("activities") != null){ %>
	       			<% ArrayList<String> activities = (ArrayList<String>) session.getAttribute("activities"); %>
	       			<% for(int i = 0; i < activities.size(); i++) { %>
		       			<% if(activities.get(i).contains("lost")) { %>
		       				<li style = "color: red;"><%= activities.get(i) %></li>
		       			<% } else { %>
		       				<li style = "color: green;"><%= activities.get(i) %></li>
		       			<% } %>
	       			<% } %>
       			<% } %>
			</ul>
		</div>
	</div>
</body>
</html>