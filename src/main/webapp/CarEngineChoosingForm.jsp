<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
</head>
<body>

<form method="GET" action="Parts">

    <select name="engine">
        <c:forEach items="${engines}" var="engine">
            <option value="${engine.id};${engine.name};${engine.link}">${engine.name}</option>
        </c:forEach>
    </select>

    <input type="submit" value="OK">
</form>

</body>
</html>
