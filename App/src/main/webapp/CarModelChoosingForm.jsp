<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
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
<t:navbar></t:navbar>
<div class="container lower forms-template">
    <h1>Wyszukiwarka części samochodowych</h1>
    <p class="lead">Wybierz parametry właściwe dla wyszukiwanej części</p>
    <form method="GET" action="Engines" class="form-horizontal" role="form">

        <p class="col-lg-6" align="right"> Wybrana marka samochodu:</p>
        <p class="col-lg-6" align="left"><c:out value="${brandName}"/></p>
        <br>

        <div class="form-group row lower">
            <label class="col-lg-3 control-label"><b>Wybierz model samochodu</b></label>
            <c:if test="${not empty errorMessage}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <c:out value="${errorMessage}"/>
                </div>
            </c:if>
            <c:if test="${not empty warningMessage}">
                <div class="alert alert-danger alert-dismissible" role="alert">
                    <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                            aria-hidden="true">&times;</span></button>
                    <c:out value="${warningMessage}"/>
                </div>
            </c:if>
            <div class="col-lg-6">
                <select name="model" id="basic" class="selectpicker show-tick form-control" data-live-search="true">
                    <c:forEach items="${models}" var="model">
                        <option value="${model.name};${model.link}"><c:out value="${model.name}"/></option>
                    </c:forEach>
                </select>
            </div>
            <c:if test="${empty errorMessage}">
                <input class="col-lg-1 button-middle" type="submit" value="OK" autofocus>
            </c:if>
        </div>
    </form>
</div>
</body>
</html>
