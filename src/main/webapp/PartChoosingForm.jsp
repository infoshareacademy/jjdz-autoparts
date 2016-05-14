<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Academy</title>
</head>
    <form method="GET" action="Parts2">
        <Input type="hidden" value="${brandName}" name="brandName" >${brandName}
        <br>

        <Input type="hidden" value="${modelName}" name="modelName" >${modelName}
        <br>

        <Input type="hidden" value="${engineName}" name="engineName" >${engineName}
        <br>

        <Input type="hidden" value="${categoryName}" name="categoryName" >${categoryName}
        <br>

        <Input type="hidden" value="${partBrand}" name="partBrand" >${partBrand}
        <br>

        <Input type="hidden" value="${partNumber}" name="partNumber" >${partNumber}
        <br>

        <Input type="hidden" value="${partName}" name="partName" >${partName}
        <br>

        <%--<select name="part">--%>
            <%--<c:forEach items="${parts}" var="part">--%>
                <%--<option value="${part.brand};--%>
                <%--${part.number_clear};--%>
                <%--${part.name};--%>
                <%--${part.link}">${part.brand} ${part.name}</option>--%>
            <%--</c:forEach>--%>
        <%--</select>--%>

        <input type="submit" value="OK">
    </form>

</body>
</html>
