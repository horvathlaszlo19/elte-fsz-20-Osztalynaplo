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
            <li><a href="/student/subjects">Subjects</a></li>
            <li><a href="/student/grades">Grades</a></li>
            <li><a href="">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
            <li style="float:right;"><a href="">${ studentName }</a></li>
        </ul> 
    </header>
    <main>
    	<h1>GPA</h1>
    	<hr>
    	<table>
			<tbody>
		        <tr style="background-color: var(--defalt);">
		            <th>Subject</th><th>Gpa</th>
		        </tr>
		        <c:forEach var="s_gpa" items="${ GPAs }">	           
	                <tr>
		                <td>${ s_gpa.key }</td><td>${ s_gpa.value }</td>       
		        	</tr>
	            </c:forEach>
	            <tr>
                	<td><b>overall GPA</b></td><td><b>${ gpa }</b></td>       
        		</tr>
		    </tbody>
	    </table>
    </main>
    <footer>
    </footer>
</body>
</html>