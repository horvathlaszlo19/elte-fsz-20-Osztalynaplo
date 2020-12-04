<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
<c:forEach items="${studentsOfClass}" var="student">
<tr>
	<td>${student.name}</td>
	<td>${student.GPA}</td>	
</tr>

</c:forEach>
</table>