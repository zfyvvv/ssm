<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
</body>
</html>