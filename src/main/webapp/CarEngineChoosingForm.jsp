<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Academy</title>
</head>
<body>

<form method="GET" action="PartFirstCategory">

    <Input type="hidden" value="${brandName}" name="brandName" >${brandName}
    <br>

    <Input type="hidden" value="${modelName}" name="modelName" >${modelName}
    <br>

    <select name="engine">
        <c:forEach items="${engines}" var="engine">
            <option value="${engine.id};${engine.name};${engine.link}">${engine.name}</option>
        </c:forEach>
    </select>


    <input type="submit" value="OK">
</form>

</body>
</html>
