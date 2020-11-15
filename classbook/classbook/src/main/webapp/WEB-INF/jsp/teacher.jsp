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
            <li><a href="">Home</a></li>
            <li><a href="">Classes</a></li>
            <li><a href="">Add Grade</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Welcome ${ teacherName }</h1>
    	<form action="/AddGrade" method="POST">

			<div class="formElement">
	            <label for="addGradeStudent">Id of student</label>
	            <input type="number" name="student" id="addGradeStudent">
            </div>

			<div class="formElement">
	            <label for="addGradeSubject">Subject</label>
	            <select name="subject" id="addGradeSubject">
	            <c:forEach var="option" items="${ subjects }">	            
	                <option value="${ option }">${ option }</option>
	            </c:forEach>
	            </select>
            </div>
			
			<div class="formElement">
	            <label for="addGradeValue">Grade</label>
	            <select name="value" id="addGradeValue">
	                <c:forEach var="option" items="${ values }">	            
	                	<option value="${ option }">${ option }</option>
	            	</c:forEach>
	            </select>
            </div>

            <input type="submit" value=">>">
        </form>
        <p>${ msg }</p>
    </main>
    <footer>
    </footer>
</body>
</html>