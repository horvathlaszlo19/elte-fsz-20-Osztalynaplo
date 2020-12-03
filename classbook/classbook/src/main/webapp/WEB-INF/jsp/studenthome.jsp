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
            <li><a href="/student/subjects">Subjects</a></li>
            <li><a href="/student/grades">Grades</a></li>
            <li><a href="/student/gpa">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
            <li style="float:right;"><a href="">${ studentName }</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Welcome ${ studentName }!</h1>
    	<hr>
    	<table>
			<tbody>
		        <tr style="background-color: var(--defalt);">
		        	<th>Your personal data:</th><th></th>
		        </tr>
		        <tr>
		            <td>Name</td><td>${ studentName }</td>
		        </tr>    
	        	<tr>
		            <td>Class</td><td>${ studentClass }</td>
		        </tr>
		        <tr>
		            <td>School</td><td>${ studentSchool }</td>
		        </tr>
		        <tr>
		            <td>GPA</td><td>${ gpa }</td>
		        </tr>
		    </tbody>
	    </table>
    </main>
    <footer>
    </footer>
</body>
</html>