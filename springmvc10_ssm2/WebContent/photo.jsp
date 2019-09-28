<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
	<head>
		<title>Photo Wall</title>
		<meta charset="UTF-8"/>
		<style type="text/css">
			body{
				text-align: center;
				background: gray;
			}
			img{
				width: 10%;
				border: solid 1px;
				color: white;
				padding: 10px;
				background-color: white;
				margin: 10px;
				transform: rotate(-10deg);
			}
			img:hover{
				transform: rotate(0deg) scale(1.5);
				transition: 1.5s;
				z-index: 1;
			}
		</style>
	</head>
	<body>
		<br /><br />
		<img src="/photo/a.jpg" alt="" />
		<img src="/photo/b.jpg" alt="" />
		<img src="/photo/c.jpg" alt="" />
		<img src="/photo/d.jpg" alt="" /><br />
		<img src="/photo/e.jpg" alt="" />
		<img src="/photo/f.jpg" alt="" />
		<img src="/photo/g.jpg" alt="" />
		<img src="/photo/h.jpg" alt="" />
	</body>
</html>