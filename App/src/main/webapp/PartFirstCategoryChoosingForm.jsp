<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>

    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
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
    <title>Infoshare Academy</title>
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

    <form method="GET" action="PartCategory" class="form-horizontal" role="form">
        <div class="row">
            <p class="col-lg-6" align="right">Wybrana marka samochodu:</p>
            <p class="col-lg-6" align="left"><c:out value="${brandName}"></c:out> </p>

        </div>
        <div class="row">
            <p class="col-lg-6" align="right"> Wybrany model samochodu:</p>
            <p class="col-lg-6" align="left"><c:out value="${modelName}"/></p>
        </div>
        <div class="row">
            <p class="col-lg-6" align="right">Wybrany silnik:</p>
            <p class="col-lg-6" align="left"> <c:out value="${engineName}"/></p>

        </div>

        <div class="form-group row lower">
            <label class="col-lg-3 control-label"><b>Wybierz kategorię</b></label>
            <div class="col-lg-6">

                <select id="basic" class="selectpicker show-tick form-control" data-live-search="true" name="category">
                    <c:forEach items="${categories}" var="category">
                        <option value="${category.name};${category.link};${category.has_children}"><c:out value="${category.name}"/></option>
                    </c:forEach>
                </select>
            </div>

            <input class="col-lg-1 button-middle" type="submit" value="OK" autofocus>
        </div>
    </form>
</div>

</body>
</html>
