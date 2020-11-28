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
            <li><a href="/student/subjects?id=4">Subjects</a></li>
            <li><a href="/student/grades?id=4">Grades</a></li>
            <li><a href="/student/gpa?id=4">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
        </ul> 
    </header>
    <main>
    	<table>
			<tbody>
		        <tr style="background-color: var(--defalt);">
		            <th>School</th><th>Class</th><th>Name</th>
		        </tr>      
                <tr>
	                <td>${ studentSchool }</td><td>${ studentClass }</td><td>${ studentName }</td>	            
	        	</tr>
		    </tbody>
	    </table>
    </main>
    <footer>
    </footer>
</body>
</html>