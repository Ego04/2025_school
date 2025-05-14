<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String staff = (String)session.getAttribute("staff");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title><%= staff %> Menu</title>
<link href="main.css" rel="stylesheet">
</head>
<body>
<div class="ContentBox">
	<h1><%= staff %> Menu</h1>
		<button>Changing Staff Info</button><br>
		<% if(staff.equals("reception")){ %>
		<button>Add Patient</button><br>
		<button>Patient Manegement</button><br>
		<%}else{ %>
		<button>Srching Patient</button><br>
		<%} %>
		<button>Logout</button><br>
	</div>

</body>
</html>