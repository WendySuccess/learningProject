<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<div align="center">
		<h2>Login</h2>
		<form action="LoginController" method="post">
			Email ID: <input type="text" name="emailID" required/><br/>
			Password: <input type="password" name="password" required/><br/>
			<input type="submit" value="Login">
		</form>
	</div>
</body>
</html>