<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<div class="container">	
	<h2>FlyAway !</h2>
	<h5>Flight Reservation</h5>
	<form action="PersonalRegister" method="post">
		<div class="row">
		  	<div class="col">
		 		<div class="mb-1">
		 			<label for="lblPassengerName" class="form-label">Passenger Name: </label>
					<input type="text" name="PassengerName" class="form-control"  required/><br/>
				</div>
  			</div>
  			</div>
  			<div class="row">
  			<div class="col">
  				<label for="lblDateofBirth" class="form-label">Date of Birth:</label>
				<input type="date" name="DateofBirth" class="form-control" required/><br/>
  			</div>
  			<div class="col"></div>
  		</div>
  		<div class="row">
  			<div class="col">
  				<div class="mb-1">
  					<label for="lblEmail" class="form-label">Email:</label>
					<input type="text" name="Email" required class="form-control"><br/>
				</div>
			</div>
  	  		<div class="col">
  				<div class="mb-1">
  					<label for="lblPhoneNumber" class="form-label">Phone Number:</label>
					<input type="text" name="PhoneNumber" required class="form-control"><br/>
				</div>
			</div>
		</div>
		<div class="row">
			
			<div class="col"><input type="submit" value="Submit"  class="btn btn-primary"></div>
		</div>
		</form>
	
</div>
</body>
</html>