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
    <title>Model selecting form</title>
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
    <form method="GET" action="Engines" class="form-horizontal" role="form">

        <p class="col-lg-6" align="right"> Wybrana marka samochodu:</p>
        <p class="col-lg-6" align="left"> ${brandName}</p>
        <br>

        <div class="form-group row lower">
            <label class="col-lg-3 control-label"><b>Wybierz model samochodu</b></label>
            <div class="col-lg-6">
                <select name="model" id="basic" class="selectpicker show-tick form-control" data-live-search="true">
                    <c:forEach items="${models}" var="model">
                        <option value="${model.id};${model.name};${model.link}">${model.name}</option>
                    </c:forEach>
                </select>
            </div>
            <input class="col-lg-1 button-middle" type="submit" value="OK">
        </div>
    </form>
</div>
</body>
</html>
