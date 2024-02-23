<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String email= request.getParameter("email");
%>
	<form action="/donorNewRequestData" method="get">
		E-mail: <input type="text" name="email" value="<%=email%>"/><br />
		Type Of Food <input type="text" name="nameOfFood" /><br />
		Date Of Cooking<input type="text" name="dateOfCooking" /><br />
		Time Of Cooking <input type="text" name="timeOfCooking" /><br />
		<input type="submit" name="submit" value="Submit!"/>

	</form>
</body>
</html>