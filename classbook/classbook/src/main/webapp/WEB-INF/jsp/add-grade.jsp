<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
			<li style="float: right;"><a href="/login">Log Out</a></li>
		</ul>
	</header>
	<main>
		<form:form modelAttribute="addGrade" action="/addgrade" method="post">
			<form:hidden path="id"/>
			<div>
				<form:select path="gradeValue">
					<form:options items="${gradeValues}" />
				</form:select>
			</div>
			<br>
			<input type="submit" value="Save">

		</form:form>
	</main>
</body>
</html>


