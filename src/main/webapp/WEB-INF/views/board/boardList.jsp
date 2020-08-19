<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>** BoardList **</title>
</head>
<body>
<h2>** BoardList **</h2>
<table width=800 border="1">
<tr align="center" height="30" bgcolor="grey">
	<td>seq</td><td>title</td>
	<td>ID</td><td>regdate</td>
</tr>
<c:forEach var="list" items="${Titleist}">
<tr align="center" height=30>
	<td>${list.seq}</td>
	<td>${list.title}</td>
	<td>${list.id}</td>
	<td>${list.regdate}</td>
</tr>
</c:forEach>
</table>
<hr>
<c:if test="${message != null}">${message}</c:if>
<a href="/golfc">[Home]</a>
</body>
</html>