<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
</head>
<body>

<form method="POST" action="/Brands">
    Please enter your name: <input type="text" name="user_name"> <br/>

    <select name="your_option">
        <c:foreach items="${brands}" var="brand">
        <option value="${brand.id}">${brand.name}</option>
        </c:foreach>
    </select>
    <input type="submit" value="OK">
</form>

</body>
</html>
