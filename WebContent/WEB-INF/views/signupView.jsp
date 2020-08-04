<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Touching Life</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="./css/style.css">

</head>
<body>
	<nav>
		<img class="logo" src="./assets/logo.svg" alt="logo" />
		<ul>
			<li><a href="${pageContext.request.contextPath}/login">
					Login </a></li>
			<li><a href="${pageContext.request.contextPath}/signup">
					SignUp </a></li>
		</ul>
	</nav>
	<section>
		<div class="container">
			<div class="image">
				<img class="home-page-image" src="./assets/regimage.jpg" alt="">
			</div>
			<div class="content">
				<h1>Sign Up as a Donor</h1>
				<form action="${pageContext.request.contextPath}/signup"
					method="post">
					<div class="form-group">
						<input type="text" class="form-control" id="fname" name="fname"
							placeholder="Enter your first name">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="lname" name="lname"
							placeholder="Enter your last name">
					</div>
					<div class="form-group">

						<input type="email" class="form-control" id="email" name="email"
							placeholder="Enter email">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="age" name="age"
							placeholder="Enter your age">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="weight" name="weight"
							placeholder="Enter your weight">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="bloodgroup" name="bloodgroup"
							placeholder="Enter your Blood Group">
					</div>
					  <div class="form-group">
    	<input type="password" class="form-control" id="password" placeholder="Password" name="password">
  </div>
					<div class="form-group">
						<input type="text" class="form-control" id="phoneno" name="phoneno"
							placeholder="Enter your phone no">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="city" name="city"
							placeholder="Enter your city">
					</div>
					<div class="form-group">
						<input type="text" class="form-control" id="availability" name="availability"
							aria-describedby="status"
							placeholder="Enter your availability status"> <small
							id="status" class="form-text text-muted">Type Yes if you
							are available to donate blood else type No</small>
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			${message}
			</div>
		</div>
	</section>

</body>
</html>