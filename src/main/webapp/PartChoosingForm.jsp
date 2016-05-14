<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Academy</title>
</head>
<%--todo: usunąć po sprawdzeniu czy na pewno nie używane (tak samo z servletem)--%>
<%--todo: SPRAWDZIC I POPRAWIC KODOWANIE ZNAKÓW --%>

    <form method="GET" action="AllegroLink">
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

        <input type="submit" value="OK">
    </form>

</body>
</html>
