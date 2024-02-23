<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/signuppage" method="get">
First Name: <input type="text" name="firstName" placeholder="enter Your first name"/><br/>
Second Name: <input type="text" name="lastName" placeholder="enter Your last name"/><br/>
Email: <input type="text" name="email" placeholder="enter Your email"/><br/>
Address:<input type="text" name="address" placeholder="Enter Your Address"><br/>
Password: <input type="text" name="password" placeholder="Enter password"/><br/>
Mobile Number:<input type="text" name="mobileNumber" placeholder="Enter Your Mobile Number"/><br/>
<input type="submit" name="submit" value="Sign Up"/>
</form>
</body>
</html>