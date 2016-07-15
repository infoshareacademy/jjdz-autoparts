<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

    <link href="css/forms-template.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>
    <title>Brand selecting form</title>
</head>
<body>
<script>
    $(document).ready(function () {

    });

</script>


<t:navbar></t:navbar>

<div class="container lower forms-template">
    <h1>Wyszukiwarka części samochodowych</h1>
    <p class="lead">Raport najczęściej poszukiwanych części</p>

    <div class="form-group row lower">

        <div class="row">
            <h3 class="control-label"><b>Raport z ostatniej godziny</b></h3></div>
    </div>
    <ul class="list-group">
        <c:forEach items="${hour}" var="hour">
            <br class="row">
            <b><c:out value="${hour.part.partName} ${hour.part.partBrand} ${hour.part.partId}"/> </b>
            <c:out value=" dla samochodu ${hour.part.carBrand} ${hour.part.carModel} ${hour.part.carEngine}"/>

        </c:forEach>
    </ul>


    <div class="form-group row lower">

        <div class="row">
            <h3 class="control-label"><b>Raport z jednego dnia</b></h3></div>
    </div>
    <ul class="list-group">
        <c:forEach items="${daily}" var="daily">
            <br class="row">
            <b><c:out value="${daily.part.partName} ${daily.part.partBrand} ${daily.part.partId}"/> </b>
            <c:out value=" dla samochodu ${daily.part.carBrand} ${daily.part.carModel} ${daily.part.carEngine}"/>

        </c:forEach>
    </ul>


    <div class="form-group row lower">

        <div class="row">
            <h3 class="control-label"><b>Raport z jednego tygodnia</b></h3></div>
    </div>
    <ul class="list-group">
        <c:forEach items="${weekly}" var="weekly">
            <br class="row">
            <b><c:out value="${weekly.part.partName} ${weekly.part.partBrand} ${weekly.part.partId}"/> </b>
            <c:out value=" dla samochodu ${weekly.part.carBrand} ${weekly.part.carModel} ${weekly.part.carEngine}"/>

        </c:forEach>
    </ul>
</div>


</body>
</html>