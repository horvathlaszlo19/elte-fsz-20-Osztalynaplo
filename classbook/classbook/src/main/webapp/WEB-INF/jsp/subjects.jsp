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
			<li><a href="/student/home">Home</a></li>
            <li><a href="">Subjects</a></li>
            <li><a href="/student/grades">Grades</a></li>
            <li><a href="/student/gpa">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
            <li style="float:right;"><a href="">${ studentName }</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Subjects</h1>
    	<hr>
    	<table>
    		<tbody>
    		<tr style="background-color: var(--defalt);">
	            <th>Subject Name</th><th>Teacher</th>
	        </tr>      
    			<c:forEach var="teacher_subject" items="${ teachersAndSubjects }">	           
		           	<tr>
		               <td>${ teacher_subject.key }</td><td>${ teacher_subject.value }</td>
		       		</tr>
		        </c:forEach>
    		</tbody>
    	</table>
    </main>
    <footer>
    </footer>
</body>
</html>