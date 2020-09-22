<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>403</title>
</head>
<body>

	<h1>403</h1>
	<span>Hi: ${pageContext.request.userPrincipal.name } you do not have permission to access this page</span>
	<a href="<c:url value='/user'/>" >User Page</a>
	<br>
	<form action="<c:url value='j_spring_security_logout'/>" method="post">
		<button type="submit">Logout</button>
	</form>	

</body>
</html>