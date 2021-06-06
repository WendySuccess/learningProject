<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Change your password</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<form action="changePasswordServlet" method="post">
			Password: <input type="password" name="password" required/><br/>
			<input type="submit" value="Change Password">
		</form>
	</div>
</body>
</html>