
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agent Home Page</title>
</head>
<body>
<h1>Welcome </h1>
<%
String email2=(String)request.getAttribute("emailofdonor");
String nameoffood2=(String)request.getAttribute("nameoffood");
%>


<h4>New Requests</h4><br/><br/>
<%=email2%>
<%=nameoffood2%>
<table>
<tr><td>
</td>
</tr>
</table>

</body>
</html>