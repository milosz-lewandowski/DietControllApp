<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: milosz
  Date: 03.08.18
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ include file="menu.jsp"  %>
<%@ include file="mealmenu.jsp"  %>
<h2>Add new meal:</h2>
<form:form method="post" modelAttribute="actMeal">
    <div>Meal name: <form:input path="name" /></div>
    <div>Date and time: <form:input path="date" /></div>
    <button>Confirm</button>
</form:form>

</body>
</html>
