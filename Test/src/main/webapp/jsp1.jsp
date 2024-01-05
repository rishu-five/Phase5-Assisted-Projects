<%@ page language="java" %>
<%@ page import="java.io.*, javax.servlet.*" %>
<%@ page import="javax.servlet.http.*" %>

<%! String myName; %>
<%
    myName = request.getParameter();
    String test = "Welcome " + myName;
%>
<!DOCTYPE html>
<html>
<head>
    <title>Test JSP</title>
</head>
<body>
    <h1><%= test %></h1>
</body>
</html>