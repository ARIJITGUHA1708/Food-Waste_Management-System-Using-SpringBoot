<%@page import="java.time.LocalTime"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Admin Home Page</h1>
<%
String email=(String) request.getAttribute("email");
String nameoffood=(String) request.getAttribute("nameoffood");
Date dateofcooking=(Date) request.getAttribute("dateofcooking");
LocalTime timeofcooking=(LocalTime) request.getAttribute("timeofcooking");
%>
<form action="" method="get">
Email:<input type="text" name="email" value="<%=email%>"/><br/>
Name Of Food: <input type="text" name="nameoffood" value="<%=nameoffood%>"/><br/>
Date Of Food: <input type="text" name="dateoffood" value="<%=dateofcooking%>"/><br/>
Time Of Cooking: <input type="text" name="timeofcooking" value="<%=timeofcooking%>"/><br>
<input type="submit" name="submit" formaction="" value="Accept"/>
<input type="button" formaction="" value="Cancel!"/>
</form>
</body>
</html>