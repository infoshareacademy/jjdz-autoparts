<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

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


<%--<nav class="navbar navbar-inverse navbar-fixed-top">--%>
    <%--<div class="container">--%>
        <%--<div class="navbar-header">--%>
            <%--<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"--%>
                    <%--aria-expanded="false" aria-controls="navbar">--%>
                <%--<span class="sr-only">Toggle navigation</span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
                <%--<span class="icon-bar"></span>--%>
            <%--</button>--%>
            <%--<a class="navbar-brand" href=https://github.com/infoshareacademy/jjdz-autoparts>Autoparts</a>--%>
        <%--</div>--%>
        <%--<div id="navbar" class="collapse navbar-collapse">--%>
            <%--<ul class="nav navbar-nav">--%>
                <%--<li class="active"><a href="#">Home</a></li>--%>
                <%--<li><a href="#about">About</a></li>--%>
                <%--<li><a href="#contact">Contact</a></li>--%>
            <%--</ul>--%>
        <%--</div><!--/.nav-collapse -->--%>
    <%--</div>--%>
<%--</nav>--%>

<div class="container">
    <form method="POST" action="Models" class="form-horizontal" role="form">
        <div class="row">
            <div class="form-group">
                <label class="col-lg-2 control-label">Wybierz kategorię</label>

                <div class="col-lg-10">
                    <select name="brand" id="basic" class="selectpicker show-tick form-control" data-live-search="true">
                        <c:forEach items="${brands}" var="brand">
                            <option
                                    value="${brand.id};${brand.name};${brand.link}">${brand.name}</option>
                        </c:forEach>
                    </select>

                    <input type="submit" value="OK">
                </div>

            </div>
        </div>

    </form>
</div>
</body>
</html>
