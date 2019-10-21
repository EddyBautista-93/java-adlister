<%@ page import="java.util.Scanner" %>
<%@ page import="java.util.Random" %><%--
  Created by IntelliJ IDEA.
  User: eddybautista
  Date: 2019-10-21
  Time: 09:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--instance property --%>
<%! int counter = 0; %>
<% counter += 1; %>
<html>
<head>

    <title>Title</title>
    <link rel="stylesheet" href="css/hello.css">

</head>
<body>
<%@include file="partials/navbar.html"%>
<%
//    Scanner x = new Scanner(System.in);


%>


<h1>First Jsp</h1>

<h1>The current count is <%= counter %>.</h1>

<%
    Random x = new Random();
    int randNum = x.nextInt((7-1)+1)+1;
    if (randNum == 1){
//        response.sendRedirect();
    }


%>

View the page source!

<%-- this is a JSP comment, you will *not* see this in the html --%>

<!-- this is an HTML comment, you *will* see this in the html -->

</body>
</html>
