<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>GPA Page</title>
</head>
<body>
	<header>
        <ul>
			<li><a href="/student/home?id=4">Home</a></li>
            <li><a href="/student/subjects?id=4">Subjects</a></li>
            <li><a href="/student/grades?id=4">Grades</a></li>
            <li><a href="">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Your gpa is ${ gpa }</h1>
    </main>
    <footer>
    </footer>
</body>
</html>