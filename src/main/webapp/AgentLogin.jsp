<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center; background: aqua;">
<h1>Agent Login</h1><br/>
	<form method="get" action="/loginAgentData">
		Email:<input type="text" name="email" placeholder="Enter Your Email" /><br /> 
		Password:<input type="text" name="password" placeholder="Enter Your Password" /><br />
		<input type="submit" name="submit" value="Sign In">
	</form>
	<p>New User?</p>
	<form method="get" action="/SignUpAgentFromLogin">
		<input type="submit" name="signup" value="Sign Up" />
	</form>

</body>
</html>