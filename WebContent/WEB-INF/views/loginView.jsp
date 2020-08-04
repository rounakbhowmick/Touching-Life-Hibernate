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
				<h1>Login</h1>
				<form action="${pageContext.request.contextPath}/login"
					method="post">

					<div class="form-group">

						<input type="email" class="form-control" id="email" name="email"
							placeholder="Enter email">
					</div>

					<div class="form-group">
						<input type="password" class="form-control" id="password"
							placeholder="Password" name="password">
					</div>

					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
				${message}
			</div>
		</div>
	</section>
</body>
</html>