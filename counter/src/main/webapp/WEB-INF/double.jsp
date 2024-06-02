<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Current visit count</title>
</head>
<body>
	<h1>You have visited <a href="">http://localhost:8080/</a> <c:out value="${count}"/> times.</h1>
	<h1><a href="">Test another visit?</a></h1>
	<a href="/reset"><button>RESET COUNT</button></a>
</body>
</html>