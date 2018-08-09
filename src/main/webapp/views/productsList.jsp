<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%=session.getAttribute("actProductMeal")%>
<%--
  Created by IntelliJ IDEA.
  User: milosz
  Date: 31.07.18
  Time: 16:11
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
<h2>Oto lista dostępnych dla ciebie produktów</h2>
<c:forEach items="${list}" var="p">
    <h4>${p.id}. ${p.name}, proteins: ${p.proteins} i reszta atrybutów;
        <form:form method="post" action="addtomeallist" modelAttribute="actProductMeal">
        <%--<c:choose>--%>
            <%--<c:when test="${p.isCountable=='Y'}">--%>
                <%--Set quantity in heads: <form:input path="weight"/>--%>
            <%--</c:when>--%>
            <%--<c:otherwise>--%>
                <%--Set weight in grams: <form:input path="weight"/>--%>
            <%--</c:otherwise>--%>
        <%--</c:choose>--%>
            <input type="hidden" value="${p}" name="product">
            <%--<form:hidden path="product"/>--%>
            <button>Add this to meal</button>
        </form:form>
    </h4>
</c:forEach>
</body>
</html>
