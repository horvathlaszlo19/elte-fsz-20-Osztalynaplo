<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>Admin Page</title>
</head>
<body>
	<header>
        <ul>
			<li><a href="">Home</a></li>
			<li><a href="/admin/addSchool">New School</a></li>
			<li><a href="/admin/addTeacher">New Teacher</a></li>
			<li><a href="/admin/addStudent">New Student</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
            <li style="float:right;"><a href="">${ adminName }</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Welcome ${ adminName }!</h1>
    	<hr>
    	<div>
    		<a href="/admin/addSchool">New School</a>
    	</div>
    	<div>
    		<a href="/admin/addTeacher">New Teacher</a>
    	</div>
    	<div>
    		<a href="/admin/addStudent">New Student</a>
	    </div>
	    <div>
	    	<a href="/h2">ADATBÁZIS</a>
	    </div>
    </main>
    <footer>
    </footer>
</body>
</html>