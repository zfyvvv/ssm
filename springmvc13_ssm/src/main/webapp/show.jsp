<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
this is showpeople<br/>

<table border="1">
	<c:forEach items="${list}" var="people">
		<tr>
			<td>${people.id }</td>
			<td>${people.name }</td>
			<td>${people.age }</td>
			<td>${people.work }</td>
		</tr>
	</c:forEach>
</table>

<a href='home'>home</a><br/>
</body>
</html>