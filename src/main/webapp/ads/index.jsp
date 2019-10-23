<%--
  Created by IntelliJ IDEA.
  User: eddybautista
  Date: 2019-10-23
  Time: 08:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads Page</title>
    <jsp:include page="../partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<jsp:include page="../partials/navbar.jsp" />
<h1> Here are some ads</h1>

<c:forEach var="ad" items="${ads}">
    <ul class="ad">
        <li>Title: ${ad.title}</li>
        <li>User: ${ad.userId}</li>
        <li>description: ${ad.description}</li>
    </ul>
</c:forEach>
</body>
</html>
