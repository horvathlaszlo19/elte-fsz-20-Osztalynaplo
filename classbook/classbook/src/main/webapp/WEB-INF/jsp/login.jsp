<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<title>Log in</title>
</head>
<body>
	<header>
        <ul>
            <li><a href="">Log in</a></li>
        </ul> 
    </header>
    <main>
		<h1 style="margin: 0px">Log in</h1>
	    <form action="/verify" method="POST">
	        <div class="formElement">
	            <label for="loginUsername">Username</label>
	            <input type="text" name="username" id="loginUsername">
	        </div>
	        <div class="formElement">
	            <label for="loginPassword">Password</label>
	            <input type="password" name="password" id="loginPassword">
	        </div>
	        <div class="formElement">
	            <input type="submit" value="Belépés >>">
	        </div>
	    </form>
	    <div>
	    	database: <a href="/h2">H2</a>
	    </div>
	    <p>${ errMsg }</p>
    </main>
    <footer>
    </footer>
</body>
</html>