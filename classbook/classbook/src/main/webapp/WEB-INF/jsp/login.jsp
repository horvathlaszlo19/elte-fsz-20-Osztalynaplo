<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

<main>
        <form:form action="login" method='POST'>    
            <label> User Name : <input type="text" name="username"/> </label>
            <label> Password: <input type="password" name="password"/> </label>       
            <input type="submit" value="Login"/>
        </form:form>
	    <p>${ errMsg }</p>
</main>
  
</body>
</html>