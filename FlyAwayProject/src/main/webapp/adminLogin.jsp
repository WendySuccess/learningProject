<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<%@ include file="Header.html" %>
<body>
	<div align="center">
		<h2>Login</h2>
		<form action="LoginController" method="post">
			Email ID: <input type="text" name="emailID" required/><br/>
			Password: <input type="password" name="password" required/><br/>
			<input type="submit" value="Login">
		</form>
	</div>
	<%@ include file="Footer.html" %>
</body>
</html>