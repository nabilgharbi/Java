<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Merienda:wght@700&display=swap" rel="stylesheet">

</head>
<body>

<h1>Your Omikuji </h1>

<div class="msg-box">
	<h3>
	In <c:out value="${pickNum}"></c:out> years, you will live in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> as your roommate, selling <c:out value="${hobby}"></c:out> for a living. The next time you see a <c:out value="${livingThing}"></c:out>, you will have good luck. Also, <c:out value="${kindWords}"></c:out>.
	</h3>
</div>

<a href="/omikuji"><h5>Go back</h5></a>

</body>
</html>