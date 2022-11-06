<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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

	<form:form action="${pageContext.request.contextPath}/logout"
		method="POST">
		
		<input type="submit" value="Logout" /> 
	</form:form>
</body>
</html>