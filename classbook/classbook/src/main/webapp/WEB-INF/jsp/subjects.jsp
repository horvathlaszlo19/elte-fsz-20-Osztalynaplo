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
            <li><a href="">Subjects</a></li>
            <li><a href="/student/grades?id=4">Grades</a></li>
            <li><a href="/student/gpa?id=4">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
    	<table>
    		<tbody>
    		<tr style="background-color: var(--defalt);">
	            <th>Subject Name</th>
	        </tr>      
    			<c:forEach var="subject" items="${ subjects }">	           
		           	<tr>
		               <td>${ subject }</td>
		       		</tr>
		        </c:forEach>
    		</tbody>
    	</table>
    	<br><br>
    	<table>
    		<tbody>
    		<tr style="background-color: var(--defalt);">
	            <th>Teachers</th>
	        </tr>      
    			<c:forEach var="teacher" items="${ teachers }">	           
		           	<tr>
		               <td>${ teacher }</td>
		       		</tr>
		        </c:forEach>
    		</tbody>
    	</table>
    </main>
    <footer>
    </footer>
</body>
</html>