<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
</head>
<body>

<form method="GET" action="Output.jsp">


    Wybraną część możesz wyszukać w kategorii allegro: <a href="${allegroLink}">${allegroLink}</a>
    <br><br>
    Jako hasło wyszukiwania wpisz: ${partName} ${partBrand} ${partId}

</form>

</body>
</html>
