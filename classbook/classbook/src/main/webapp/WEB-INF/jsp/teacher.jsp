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
			<li><a href="">Classes</a></li>
			<li style="float: right;"><a href="/login">Log Out</a></li>
		</ul>
	</header>
	<main>
		<h1>Welcome ${ teacherName }</h1>

		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Age</th>
			</tr>
			<c:forEach items="${students}" var="student">
				<tr>
					<td>${student.id}</td>
					<td>${student.name}</td>
					<td>${student.age}</td>
					<td><a href="addgrade/${student.id}">New Grade</a></td>
				</tr>

			</c:forEach>

		</table>

	</main>
	<footer> </footer>
</body>
</html>