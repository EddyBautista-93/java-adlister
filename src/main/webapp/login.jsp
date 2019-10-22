<%--
  Created by IntelliJ IDEA.
  User: eddybautista
  Date: 2019-10-21
  Time: 12:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>
<%@include file="partials/nav.html"%>

<form class="row" action="login.jsp" method="post">
    <div class="input-field col s6">
        <input name="username" id="username" type="text" class="validate">
        <label class="active" for="username">Username</label>
    </div>
    <div class="input-field col s6">
        <input name="password" id="first_name2" type="password" class="validate">
        <label class="active" for="first_name2">Password</label>
    </div>
    <button class="btn waves-effect waves-light" type="submit" name="action">Submit
        <i class="material-icons right"></i>
    </button>
</form>


<c:if test="${param.username.equalsIgnoreCase('username') && param.password.equalsIgnoreCase('password')}">
    <c:redirect url="profile.jsp">
    </c:redirect>
</c:if>
<%@include file="partials/footer.html"%>
</body>
</html>
