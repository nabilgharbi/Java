<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Simple Receipt</title>
</head>
<body>
<h1>Costumer name: <c:out value="${name}" /></h1>
<h2>Item name: <c:out value="${item}"/></h2>
<h2>Price: $<c:out value="${price}"/></h2>
<h2>Description: <c:out value="${description}"/></h2>
<h2>Vendor: <c:out value="${vendor}"/></h2>
</body>
</html>