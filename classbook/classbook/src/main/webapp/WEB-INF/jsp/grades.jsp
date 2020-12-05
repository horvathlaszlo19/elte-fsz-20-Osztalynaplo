<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script>
		function switchGradeViewMode() {
		  let GradeViewTime = document.getElementById("GradeViewTime");
		  let GradeViewSubject = document.getElementById("GradeViewSubject");
		  if (GradeViewTime.style.display === "none") {
		    GradeViewTime.style.display = "table";
		    GradeViewSubject.style.display = "none";
		  } else {
		    GradeViewTime.style.display = "none";
		    GradeViewSubject.style.display = "block";
		  }
		} 
	</script>
	<title>Student Page</title>
</head>
<body>
	<header>
        <ul>
			<li><a href="/student/home">Home</a></li>
            <li><a href="/student/subjects">Subjects</a></li>
            <li><a href="">Grades</a></li>
            <li><a href="/student/gpa">GPA</a></li>
            <li style="float:right;"><a href="/login">Log Out</a></li>
            <li style="float:right;"><a href="">${ studentName }</a></li>
        </ul> 
    </header>
    <main>
    	<h1>Grades</h1>
    	<hr>
    	<button onclick="switchGradeViewMode()">Switch view mode</button>
    	<table id="GradeViewTime" style="display: table;">
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
	    <br><br><br>
	    <div id="GradeViewSubject" style="display: none;">
		<c:forEach var="subject_grades_map" items="${ subjectsAndGrades }">
			<h2>${ subject_grades_map.key }</h2>
	        <table>
				<tbody>
					<tr style="background-color: var(--defalt);">
			            <th>Subject</th><th>Date</th><th>Grade</th>
			        </tr>
					<c:forEach var="subject_grades" items="${ subject_grades_map.value }">
		                <tr>
			                <td>${ subject_grades.subject }</td><td>${ subject_grades.date }</td><td>${ subject_grades.value }</td>	  
			        	</tr>
		        	</c:forEach>
			    </tbody>
		    </table>
		</c:forEach>
		</div>
    </main>
    <footer>
    </footer>
</body>
</html>