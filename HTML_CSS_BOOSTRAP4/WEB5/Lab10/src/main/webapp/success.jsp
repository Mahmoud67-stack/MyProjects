<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Successful Login</title>
</head>
<body>

<%

String username = request.getParameter("username");

out.println(username);%>

<h2> Welcome <% out.println(username);%> :) </h2>

</body>
</html>