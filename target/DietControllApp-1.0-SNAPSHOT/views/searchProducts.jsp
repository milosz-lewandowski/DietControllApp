<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: milosz
  Date: 02.08.18
  Time: 10:07
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

<h2>Choose categories of products:</h2>
<form:form method="post" action="choosen">
    <c:forEach items="${catlist}" var="cat">
        ${cat.name}<input type="radio" name="choosen">
    </c:forEach>
    <button>Confirm</button>
</form:form>

<h2>Search product by name:</h2>
<form:form method="post" action="query">
    <input type="text" name="squery">
    <button>Confirm</button>
</form:form>

</body>
</html>
