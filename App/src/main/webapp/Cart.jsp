<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <!--<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">-->
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link href="css/forms-template.css" rel="stylesheet">

    <![endif]-->
</head>
<body>


<t:navbar></t:navbar>

<div class="container lower forms-template">

    <h1>Wyszukiwarka części samochodowych</h1>
    <p class="lead">Zarządzaj swoim koszykiem</p>
    <div class="row">

        <ul class="list-group">
            <c:forEach items="${crudViewList}" var="list" varStatus="carsCount">
                <form method="GET" action="CRUD" name="selectPart">
                    <div class="row">
                        <div class="col-lg-12 ">
                                ${list.carInCRUD.carBrand} ${list.carInCRUD.carModel} ${list.carInCRUD.carEngine}

                        </div>
                        <ul class="list-group">
                            <c:forEach items="${list.partsInCRUD}" var="parts" varStatus="partCount">
                                <div class="col-lg-12 ">
                                    <div class="row">
                                        <div class="col-lg-5">
                                                ${parts.partBrand} ${parts.partName} ${parts.partId}</div>
                                        <div class="col-lg-2">Ilość: ${parts.recordCount}</div>
                                        <div class="col-lg-5">
                                            <button type="submit"
                                                    value="${list.carInCRUD.carBrand};${list.carInCRUD.carModel};${list.carInCRUD.carEngine};;${parts.partBrand};${parts.partName};${parts.partId}"
                                                    name="remove">Usuń z koszyka
                                            </button>
                                            <button type="submit"
                                                    value="${list.carInCRUD.carBrand};${list.carInCRUD.carModel};${list.carInCRUD.carEngine};;${parts.partBrand};${parts.partName};${parts.partId};;${list.carInCRUD.engineLink}"
                                                    name="add">Dodaj do koszyka
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </ul>
                    </div>
                </form>
            </c:forEach>

        </ul>
    </div>

</div>


<form metod="GET" action="Brands">
    <div class="container">
        <div class="forms-template">
            <input type="submit" value="Wyszukaj nową część dla dowolnego samochodu" align="center"/>
        </div>
    </div>
</form>
<form metod="GET" action="PartFirstCategory">
    <%--<ul class="list-group">--%>
    <c:forEach items="${cars}" var="cars" varStatus="carsSelectCount">
        <div class="container">
            <div class="forms-template">
                <p>Wyszukaj nową część dla samochodu o marce: ${cars.carBrand}, modelu: ${cars.carModel},
                    pojemności
                    silnika: ${cars.carEngine}</p>
                <button type="submit"
                        value="${cars.engineLink};${cars.carModel};${cars.carBrand}"
                        name="search">Wyszukaj
                </button>
            </div>
        </div>
    </c:forEach>
    <%--</ul>--%>
</form>

<form method="POST" action="Output.jsp">
    <div class="container">
        <div class="forms-template">
            <input type="submit" value="Zakończ pracę z aplikacją" align="center"/>
        </div>
    </div>
</form>
<hr>
<footer>
    <div class="col-xs-2 col-lg-2" text-align="center">
        <p>&copy; Javatar</p>
    </div>
</footer>
</body>
</html>
