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
			<li><a href="/student/home?id=4">Home</a></li>
            <li><a href="/student/subjects?id=4">Subjects</a></li>
            <li><a href="?id=4">Grades</a></li>
            <li><a href="/student/gpa?id=4">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
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