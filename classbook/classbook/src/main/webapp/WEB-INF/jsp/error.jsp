<jsp:include page="_header.jsp" />

<h1>Error page</h1>
	<div>
		<c:if test="${not empty errorCode}">
					${errorCode}
					${errorMessage}
		</c:if>
		<c:if test="${empty errorCode}">
					System error.
		</c:if>
	</div>



</body>
</html>