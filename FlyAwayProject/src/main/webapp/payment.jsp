<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>Payment </title>
</head>
<body>

<div align="center">
	<h2>FlyAway !</h2>
	<h5>Payment Details</h5>

</div>

<div class="container">	
	<form action="PaymentStatus" method="post">
		<div class="row">
		  	<div class="col">
		 		<div class="mb-1">
		 			<label for="lblDateoftravel" class="form-label">Credit Card Number </label>
					<input type="date" name="Dateoftravel" class="form-control"  required/><br/>
				</div>
  			</div>
  			<div class="col"></div>
  		</div>
  		<div class="row">
		  	<div class="col">
  			<label for="lblnoofperson" class="form-label">Security Code</label>
				<input type="number" name="noofperson" class="form-control" required/><br/>
  			</div>
  			<div class="col"></div>
  		</div>
  		
		<div class="row">
			
			<div class="col"><input type="submit" value="Comfirm Payment "  class="btn btn-primary"></div>
		</div>
		</form>
		</div>


</body>
</html>