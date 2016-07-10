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
    <p class="lead">Wybierz parametry właściwe dla wyszukiwanej części</p>

    <form method="GET" action="Models" class="form-horizontal" role="form">

        <div class="form-group row lower">
            <label class="col-lg-3 control-label"><b>Wybierz markę samochodu</b></label>

            <div class="col-lg-6">
                <select name="brand" id="basic" class="selectpicker show-tick form-control" data-live-search="true">
                    <c:forEach items="${brands}" var="brand">
                        <option
                                value="${brand.name};${brand.link}"><c:out value="${brand.name}"/></option>
                    </c:forEach>
                </select>

            </div>
            <input class="col-lg-1 button-middle" type="submit" value="OK" autofocus>
        </div>
    </form>
</div>
</body>
</html>
