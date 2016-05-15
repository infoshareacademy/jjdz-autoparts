<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="css/forms-template.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>
    <title>Engine selecting form</title>
</head>
<body>
<script>
    $(document).ready(function () {

    });

</script>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href=https://github.com/infoshareacademy/jjdz-autoparts>Autoparts</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="/jjdz-autoparts">Home</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>
<div class="container lower forms-template">
    <h1>Wyszukiwarka części samochodowych</h1>
    <p class="lead">Wybierz parametry właściwe dla wyszukiwanej części</p>
    <c:if test="${hasChildren == true}">
        <c:set var="formAction" value="PartCategory"/>
    </c:if>
    <c:if test="${hasChildren == false}">
        <c:set var="formAction" value="AllegroLink"/>
    </c:if>
    <form method="GET" action="${formAction}" class="form-horizontal" role="form">
        <div class="row">
            <p class="col-lg-6" align="right">Wybrana marka samochodu:</p>
            <p class="col-lg-6" align="left"> ${brandName}</p>

        </div>
        <div class="row">
            <p class="col-lg-6" align="right"> Wybrany model samochodu:</p>
            <p class="col-lg-6" align="left">${modelName}</p>
        </div>
        <div class="row">
            <p class="col-lg-6" align="right">Wybrany silnik:</p>
            <p class="col-lg-6" align="left"> ${engineName}</p>

        </div>
        <div class="row">
            <p class="col-lg-6" align="right"> Wybrana kategoria:</p>
            <p class="col-lg-6" align="left">${categoryName}</p>
        </div>
        <div class="form-group row lower">
            <label class="col-lg-3 control-label"><b>Wybierz model samochodu</b></label>
            <div class="col-lg-6">
                <c:if test="${hasChildren == true}">
                    <select name="category" id="basic" class="selectpicker show-tick form-control" data-live-search="true">
                        <c:forEach items="${categories}" var="category">
                            <option value="${category.id};${category.name};${category.link};${category.has_children}">${category.name}</option>
                        </c:forEach>
                    </select>
                </c:if>

                <c:if test="${hasChildren == false}">
                    <select name="part" id="basic" class="selectpicker show-tick form-control" data-live-search="true">
                        <c:forEach items="${parts}" var="part">
                            <option value="${part.brand};${part.number_clear};${part.name};${part.link}">${part.brand} ${part.name}</option>
                        </c:forEach>
                    </select>
                </c:if>
            </div>
            <input type="submit" value="OK">
        </div>

    </form>
</div>
</body>
</html>
