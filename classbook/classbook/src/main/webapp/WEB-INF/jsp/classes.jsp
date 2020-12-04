<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
<c:forEach items="${classes}" var="class">
<tr>
	<td>${class.name}</td>
	<td><a href="studentsOfClass/${class.id}">>></a></td>
</tr>

</c:forEach>
</table>