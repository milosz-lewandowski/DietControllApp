<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: milosz
  Date: 03.08.18
  Time: 15:03
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
<c:forEach items="${mealshistory}" var="meal">
    <h4>id: ${meal.id}, name: ${meal.name}, ${meal.date} a tu powinny dalej byc produkty z ich wagą, suma kalorii etc...</h4>
</c:forEach>

</body>
</html>
