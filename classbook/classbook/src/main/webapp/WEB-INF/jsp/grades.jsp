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
			<li><a href="/student/home">Home</a></li>
            <li><a href="/student/subjects">Subjects</a></li>
            <li><a href="">Grades</a></li>
            <li><a href="/student/gpa">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Grades</h1>
    	<hr>
    	<table>
			<tbody>
		        <tr style="background-color: var(--defalt);">
		            <th>Subject</th><th>Date</th><th>Grade</th>
		        </tr>
		        <c:forEach var="grades" items="${ studentGrades }">	           
	                <tr>
		                <td>${ grades.subject }</td><td>${ grades.date }</td><td>${ grades.value }</td>	            
		        	</tr>
	            </c:forEach>
		    </tbody>
	    </table>
    </main>
    <footer>
    </footer>
</body>
</html>