<html>
<body>
<div align="center">
<h2>FlyAway !</h2>
<h5>Your Airline Booking Portal</h5>
<a href="admindetails">Admin List</a>
<a href="adminLogin.jsp">Admin Login</a>
	</div>
		<h2>Login</h2>
		<form action="SearchFlight" method="post">
			Date of travel: <input type="date" name="Dateoftravel" required/><br/>
			Source: <input type="search" name="Source" required/><br/>
			Destination:<input type="search" name="Destination" required/><br/>
			Number of persons:<input type="number" name="Destination" required/><br/>
			<input type="submit" value="Search">
		</form>
</body>
</html>
