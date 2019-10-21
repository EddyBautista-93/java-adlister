<%--
  Created by IntelliJ IDEA.
  User: eddybautista
  Date: 2019-10-21
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Your name is <%= request.getParameter("name")%></h1>
<%--<%--%>
<%--if (request.getParameter("password").equalsIgnoreCase("codeup")){--%>
<%--    request.setAttribute("message","Login Valid");--%>
<%--} else {--%>
<%--    request.setAttribute("message","Login fail");--%>
<%--}--%>
<%--%>--%>
<h1>${message}</h1>
</body>
</html>
