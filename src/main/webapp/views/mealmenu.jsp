<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div id="menu" style=" display: block; width: 50%; height: 20%; float: right">

    <h4>Meal: ${actMeal.name} created: ${actMeal.date}</h4>
    <table><thead>
    <tr></tr>
    </thead>
    <c:forEach items="${actProducts}" var="ap">
        id:${ap.id}
    </c:forEach>
    </table>
</div>