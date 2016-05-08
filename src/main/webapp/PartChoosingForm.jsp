<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
</head>
<body>

<form method="GET" action="Parts">

    <select name="part">
        <c:forEach items="${parts}" var="part">
            <option value="${part.id};${part.name};${part.link}">${part.name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="OK">
</form>

</body>
</html>
