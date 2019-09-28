<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--jsp文件传值给controller对象  -->
<!-- 	<form action="demo7" method="post">
		姓名：<input type="text" name="name"/>
		年龄：<input type="text" name="age"/>
		
		<input type="checkbox" name="hover" value="吃饭"/>吃饭
		<input type="checkbox" name="hover" value="学习"/>学习
		<input type="checkbox" name="hover" value="运动"/>运动
		
		<input type="text" name="peo.name"/>
		<input type="text" name="peo.age"/>
		<input type="text" name="peo.id"/>
		
		<input type="text" name="peo[0].name"/>
		<input type="text" name="peo[0].age"/>
		<input type="text" name="peo[1].name"/>
		<input type="text" name="peo[1].age"/>
		
		<a href="demo8?name=abc&age=22">跳转8</a>
		<a href="demo9/aaa/23">跳转9</a>
		<input type="submit" value="submit"/>
	</form> -->
	
	<!-- 作用域传值 给jsp文件-->
	<%-- request:${requestScope.req}<br/>
	session:${sessionScope.session}<br/>
	sessionParam:${sessionScope.sessionparam}<br/>
	application:${applicationScope.application}<br/>
	<hr/>
	map:${requestScope.map}<br/>
	<hr/>
	model:${requestScope.model}<br/>
	<hr/>
	mav:${requestScope.mav}<br/> --%>
	
	<!-- 文件下载 -->
	<!-- <!-- <a href="files/a.zip">下载1</a><br/>
	<a href="files/a.txt">下载2</a><br/> 
	<a href="demo21?filename=a.txt">下载1</a><br/> -->
	
	<!--文件上传  -->
	<!-- <form action="demo22" enctype="multipart/form-data" method="post">
	姓名：<input type="text" name="name"/><br/>
	文件：<input type="file" name="file"/><br/>
	<input type="submit" value="提交">
	</form> -->
	
	<!--拦截器  -->
	<%-- <%System.out.println("indes.jsp!"); %>
	${model} --%>
	<!-- 登录验证 -->
	<form action="login" method="post">
	姓名：<input type="text" name="name"/>
	密码：<input type="text" name="password"/>
	<input type="submit" name="提交"/>
	</form>
	
</body>
</html>