<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>Custom login page</title>
<style>
.failed {
	color: red;
}
</style>
</head>
<body>

	<h3>
		My Custom login page

		<form:form
			action="${pageContext.request.contextPath}/authenticateTheUser"
			method="POST">

			<c:if test="${param.error!= null}">
				<i class="failed"> Sorry! You entered invalid username/password</i>
			</c:if>

			<p>
				User Name: <input type="text" name="username" />
			</p>

			<p>
				User Name: <input type="password" name="password" />
			</p>

			<input type="submit" value="Login" />

		</form:form>

	</h3>
</body>

</html>