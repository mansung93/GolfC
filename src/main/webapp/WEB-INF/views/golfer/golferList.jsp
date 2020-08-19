<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** GolferList **</title>
</head>
<body>
<h2>** GolferList **</h2>
<table width=800 border="1">
<tr align="center" height="30" bgcolor="grey">
	<td>ID</td><td>name</td><td>nickname</td><td>age</td>
	<td>hcp</td><td>gender</td><td>homeclub</td><td>birthday</td>
	<td>phone</td><td>adress</td><td>lev</td><td>point</td>
</tr>
<c:forEach var="list" items="${Ping}">
<tr align="center" height=30>
	<td>${list.id}</td>
	<td>${list.name}</td>
	<td>${list.nickname}</td>
	<td>${list.age}</td>
	<td>${list.hcp}</td>
	<td>${list.gender}</td>
	<td>${list.homeclub}</td>
	<td>${list.birthday}</td>
	<td>${list.phone}</td>
	<td>${list.adress}</td>
	<td>${list.lev}</td>
	<td>${list.point}</td>
</tr>
</c:forEach>
</table>
<hr>
<c:if test="${message != null}">${message}</c:if>
<a href="/golfc">[Home]</a>
</body>
</html>