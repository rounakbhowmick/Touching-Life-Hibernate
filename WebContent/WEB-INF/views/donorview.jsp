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
<link type="text/css" rel="stylesheet" href="./css/donorviewstyle.css">
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
	<div class="donorview-container">
	
	<h1>Login and Security</h1>
		<table class="table">
			
			<tbody>
				<tr>
					<td>Name: ${donorname}</td>
					<td></td>
				</tr>
				<tr>
					
					<td>Email: ${email}</td>
					<td></td>
				</tr>
				<tr>
					<td>Age: ${age}</td>
					<td></td>
				</tr>
				<tr>
					<td>Weight: ${weight}</td>
					<td></td>
				</tr>
				<tr>
					<td>Blood Group: ${bloodgroup}</td>
					<td></td>
				</tr>
				<tr>
					<td>Phone Number: ${phonenumber}</td>
					<td></td>
				</tr>
				<tr>
					<td>City: ${city}</td>
					<td></td>
				</tr>
				<tr>
					<td>Available: ${available}</td>
					<td></td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>