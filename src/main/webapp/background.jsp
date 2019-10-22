<%--
  Created by IntelliJ IDEA.
  User: eddybautista
  Date: 2019-10-22
  Time: 09:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        body{
            background-color: ${param.color};
        }
        h1{
            font-family: "Apple Chancery";
            font-palette: dark;
            font-min-size: xx-large;
        }
    </style>
</head>
<body>
<h1>LOOK ITS ${param.color.toUpperCase()}</h1>

<c:if test="${param.color.equalsIgnoreCase('pug')}">
    <img src="css/pug.jpg">
</c:if>

</body>
</html>
