<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<div align="center">
	<h2>FlyAway !</h2>
	<h5>Your Airline Booking Portal</h5>
	<a href="admindetails">Admin List</a>
	<a href="adminLogin.jsp">Admin Login</a>
</div>
<div class="container">	
	<form action="SearchFlight" method="post">
		<div class="row">
		  	<div class="col">
		 		<div class="mb-1">
		 			<label for="lblDateoftravel" class="form-label">Date of travel: </label>
					<input type="date" name="Dateoftravel" class="form-control"  required/><br/>
				</div>
  			</div>
  			<div class="col">
  			<label for="lblnoofperson" class="form-label">Number of persons:</label>
				<input type="number" name="noofperson" class="form-control" required/><br/>
			
  			</div>
  		</div>
  		<div class="row">
  			<div class="col">
  				<div class="mb-1">
  					<label for="lblSource" class="form-label">Source:</label>
					<input type="search" name="Source" required class="form-control"><br/>
				</div>
			</div>
  	  		<div class="col">
  				<div class="mb-1">
  					<label for="lblDestination" class="form-label">Destination:</label>
					<input type="search" name="Destination" required class="form-control"><br/>
				</div>
			</div>
		</div>
		<div class="row">
			
			<div class="col"><input type="submit" value="Search"  class="btn btn-primary"></div>
		</div>
		</form>

		</div>
</body>
</html>
