<%@ taglib  prefix="form" uri="http://www.springframework.org/tags/form"%>

<jsp:include page="_header.jsp"/>
	
	<h1>Edit</h1>
	
    <form:form modelAttribute="editStudentForm" action="/edit-student" >
        <form:hidden path="id"/>
        
        <div>
            <form:label path="name">Name:</form:label><br>
            <form:errors cssClass="message" path="name"/>
        </div>
        <div>
            <form:input path="name" />
        </div>
        
        </form:form>
   </body>
</html>