<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
	crossorigin="anonymous"></script>
<title>Login Page</title>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<!--  JQUERY -->
<script>
	$(function() {
		$("#nav-placeholder").load("nav.html");
	});
</script>
<!--  END JQUERY -->
</head>
<body style="text-align: center; background-color: aqua;">
	<div id="nav-placeholder"></div>
	<div>
		<form action="/loginenter" method="get">
			<input type="text" name="email" placeholder="Enter Your Email" /><br />
			<input type="text" name="password" placeholder="Enter Your Password" /><br />
			<input type="submit" name="submit" value="Log In">
		</form>
		<p>new User?</p>
		<form method="get" action="/signup">
			<input type="submit" name="signup" value="Sign Up" />
		</form>
	</div>
</body>
</html>