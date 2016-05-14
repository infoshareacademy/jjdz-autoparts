<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Academy</title>
</head>
<body>

<form method="POST" action="Models">

    <select name="brand">
        <c:forEach items="${brands}" var="brand">
        <option value="${brand.id};${brand.name};${brand.link}">${brand.name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="OK">
</form>

</body>
</html>
