<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<head>
<meta charset="ISO-8859-1">
<title>Change your password</title>
</head>
<body>
<%@ include file="Header.html" %>
	<div class="container">	
		<div align="center">
			<h5>Change your password</h5>
			<form action="ChangePasswordServlet" method="post">
				<div class="mb-1">
					<div class="row">
						<div class="col"></div>
		  				<div class="col">
							<label for="lblPassword" class="form-label">New Password: </label>
							<input type="password" name="password" class="form-control"  required/><br/>
							<input type="submit" value="Change Password">
						</div>
						<div class="col"></div>
						<div class="col"></div>
					</div>
				</div>
			</form>
		</div>
	</div>
<%@ include file="Footer.html" %>
</body>
</html>