<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	<a href="https://accounts.google.com/o/oauth2/auth?scope=https://www.googleapis.com/auth/userinfo.profile+https://www.googleapis.com/auth/userinfo.email&redirect_uri=http://localhost:8080/SpringMVC_Google/login-google&response_type=code
    &client_id=602716084882-d5c9uaeca6961pg4hf3mqgld8i45von1.apps.googleusercontent.com&approval_prompt=force">Login Google</a>

	<form action='<c:url value='j_spring_security_login'></c:url>'  method="Post">
		<table>
			<tr>
				<td>User: </td>
				<td> <input type="text" name="username"> </td>
			</tr>
			<tr>
				<td>Password: </td>
				<td> <input type="password" name="password">
			</tr>
			<tr>
				<td colspan="2"> <button type="submit">Login</button>
			</tr>
		</table>
	</form>
</body>
</html>