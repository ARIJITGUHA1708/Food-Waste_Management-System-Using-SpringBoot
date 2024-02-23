<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
.button
{
border:none;
color:white;
padding 16px 32px;
text-align:center;
text-decoration:none;
display: inline-block;
font-size:16px;
margin:4px 2px;
trasition-duration:0.4s;
cursor:pointer;
}
</style>
<meta charset="ISO-8859-1">
<title>Donor Home Page</title>
</head>
<body>
<%
String email=request.getAttribute("email").toString();
request.setAttribute("email", email);
%>
	<!--  <%= email %> --> 
	<form>
	<input type="hidden" name="email" id="email" value="<%=email%>"/>
	<button type="submit" formaction="/gotohome">Home</button>
	<button type="submit" formaction="/donorPreviousRequest">Previous Request</button>
	<button type="submit" formaction="/donorNewRequest" name="email">New Request</button>
	</form>
</body>
</html>