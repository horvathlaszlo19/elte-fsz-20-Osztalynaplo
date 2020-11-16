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
            <li><a href="">Grades</a></li>
            <li><a href="">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Welcome ${ studentName }</h1>
    	<table>
			<tbody>
		        <tr style="background-color: var(--defalt);">
		            <th>Subject</th><th>Grade</th><th>Date</th>
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