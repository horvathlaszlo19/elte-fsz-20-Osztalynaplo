<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="_header.jsp" />

<table>
<tr>
	<th>Id</th>
	<th>Name</th>
	<th></th>
</tr>
<c:forEach items="${students}" var="student">
<tr>
	<td>${student.id}</td>
	<td>${student.name}</td>
	<td><a href="edit-student/${student.id}">Details</a></td>
</tr>

</c:forEach>

</table>


</body>
</html>