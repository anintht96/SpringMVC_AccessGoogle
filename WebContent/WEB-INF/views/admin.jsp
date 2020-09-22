<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Page</title>
</head>
<body>

		<h1>Admin Page</h1>
		<h2>Welcom: ${pageContext.request.userPrincipal.name }</h2>
		<a href='<c:url value='/user'></c:url>'>User Page</a>
		<form action="<c:url value='/j_spring_security_logout'/>" method="post">
			<button type="submit">Logout</button>
		</form>

</body>
</html>