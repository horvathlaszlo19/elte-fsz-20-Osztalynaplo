<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<title>Student Page</title>
</head>
<body>
	<header>
		<ul>
			<li><a href="teacher">Home</a></li>
			<li style="float: right;"><a href="/login">Log Out</a></li>
		</ul>
	</header>
	<main>
		<h1>Welcome ${ teacherName }</h1>
		
	<c:forEach items="${teacherClasses}" var="class">
		<details>
			<summary>${class.name}</summary>
			<c:forEach items="${class.students}" var="student">
					<div><a href="addgrade/${student.id}">${student.name}</a></div>
			</c:forEach>
		</details>
	</c:forEach>
			
				
				
				
				



	</main>
</body>
</html>