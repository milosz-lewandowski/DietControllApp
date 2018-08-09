<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: milosz
  Date: 01.08.18
  Time: 09:54
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
<h2>Add new product:</h2>
<form:form method="post" modelAttribute="product">
    <div>Product name: <form:input path="name" /></div>
    <div>Whole product<form:radiobutton path="isCountable" value="Y"/>
    Measured in 100g <form:radiobutton path="isCountable" value="N"/></div>
    <div>Proteins: <form:input path="proteins"/></div>
    <div>Simple carbohydrates: <form:input path="simpleCarbo"/></div>
    <div>Complex carbohydrates: <form:input path="complexCarbo"/></div>
    <div>Fat: <form:input path="fat"/></div>
    <div>Dietary fiber: <form:input path="dietaryFiber"/></div>
    <div>Select category:</div>
    <form:checkboxes items="${categories}" path="categories" itemValue="id" itemLabel="name" />
    <button>Confirm</button>
</form:form>

</body>
</html>
