<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align:center;background:aqua;">
<h1>Sign Up Page</h1>
<form method="get" action="/AgentSignUp">
Name: <input type="text" name="name" placeholder="Enter Your Name"/><br/>
Address: <input type="text" name="address" placeholder="Enter Your Address"/><br/>
Email: <input type="text" name="email" placeholder="Enter Your Email"/><br/>
Password: <input type="password" name="password" placeholder="Enter Your Password"/><br/><br/>
<input type="submit" name="signup" value="Sign Up!"/><br/>
</form>


</body>
</html>