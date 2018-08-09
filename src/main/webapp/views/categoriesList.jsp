<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: milosz
  Date: 01.08.18
  Time: 12:58
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
<h2>List of categories:</h2>

<c:forEach items="${categories}" var="cat">
    <div>${cat.id} ---- ${cat.name}</div>
</c:forEach>
<h2>Add a new category:</h2>
</body>
</html>
