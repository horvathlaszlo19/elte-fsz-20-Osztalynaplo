<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>New Teacher</title>
</head>
<body>
	<header>
        <ul>
			<li><a href="/admin">Home</a></li>
			<li><a href="/admin/addSchool">New School</a></li>
			<li><a href="">New Teacher</a></li>
			<li><a href="/admin/addStudent">New Student</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
            <li style="float:right;"><a href="">${ adminName }</a></li>
        </ul> 
    </header>
    <main>
    	<h1>New Teacher</h1>
    	<hr>
    	<form:form modelAttribute="newTeacher" action="/admin/addTeacher" method="post">
    	
    		Name: <form:input path="name"/>
    		<br><br>
    		
    		Age: <form:input path="age"/>
    		<br><br>
    		
    		Sex: <form:checkbox path="sex"/>
    		<br><br>

    		Username:<form:input path="username"/>
			<br><br>
			
    		Password: <form:input path="password"/>
    		<br><br>

			Subject:
			<form:select path="subject">
				<form:options items="${ subjects }"/>
			</form:select>
			<br><br>
    		
    		<input type="submit" value="Save">
    		
    	</form:form>
    </main>
    <footer>
    </footer>
</body>
</html>