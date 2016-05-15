<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Academy</title>
</head>
<body>
    <c:if test="${hasChildren == true}">
        <c:set var="formAction" value="PartCategory"/>
    </c:if>
    <c:if test="${hasChildren == false}">
        <c:set var="formAction" value="AllegroLink"/>
    </c:if>
    <form method="GET" action="${formAction}">

        ${brandName}
        <br>

        ${modelName}
        <br>

        ${engineName}
        <br>

        ${categoryName}
        <br>

        <c:if test="${hasChildren == true}">
            <select name="category">
                <c:forEach items="${categories}" var="category">
                    <option value="${category.name};${category.link};${category.has_children}">${category.name}</option>
                </c:forEach>
            </select>
        </c:if>

        <c:if test="${hasChildren == false}">
            <select name="part">
                <c:forEach items="${parts}" var="part">
                    <option value="${part.brand};${part.number_clear};${part.name};${part.link}">${part.brand} ${part.name}</option>
                </c:forEach>
            </select>
        </c:if>

        <input type="submit" value="OK">
    </form>

</body>
</html>
