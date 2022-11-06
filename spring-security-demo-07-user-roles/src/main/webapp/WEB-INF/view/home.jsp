<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<title>Luv2code company home page</title>
</head>

<body>
	<h2>luv2code company home page</h2>
	<hr>
	<p>Welcome to the luv2code company home page!</p>

	<hr>

	<p>

		User:
		<security:authentication property="principal.username" />
		<br> <br> Role(s):
		<security:authentication property="principal.authorities" />
	</p>

	<hr>

	<security:authorize access="hasRole('MANAGER')">
		<p>

			<!-- Add a link to point to /leaders this is for managers -->

			<a href="${pageContext.request.contextPath}/leaders">Leadership
				meeting</a> (Only for manager peeps)
		</p>
	</security:authorize>
	<security:authorize access="hasRole('ADMIN')">
		<p>

			<!-- Add a link to point to /leaders this is for admins -->

			<a href="${pageContext.request.contextPath}/systems">IT systems
				meeting</a> (Only for admin peeps)
		</p>
	</security:authorize>
	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">

		<input type="submit" value="Logout" />
	</form:form>
</body>
</html>