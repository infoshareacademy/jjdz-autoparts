<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
</head>
<body>

<form method="GET" action="/Brands">

    <select name="your_option">
        <c:forEach items="${brands}" var="brand">
        <option value="${brand.id}">${brand.name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="OK">
</form>

</body>
</html>
