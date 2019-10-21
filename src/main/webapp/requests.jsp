<%--
  Created by IntelliJ IDEA.
  User: eddybautista
  Date: 2019-10-21
  Time: 10:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>Implicit Object Example</title>
</head>
<body>
<h1>Welcome To The Site!</h1>
<p>Path: <%= request.getRequestURL() %></p>
<p>Query String: <%= request.getQueryString() %></p>
<p>"name" parameter: <%= request.getParameter("name") %></p>
<p>User-Agent header: <%= request.getHeader("user-agent") %></p>
</body>
</html>