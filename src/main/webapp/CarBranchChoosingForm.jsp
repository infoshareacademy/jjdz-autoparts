<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>

    <!-- (Optional) Latest compiled and minified JavaScript translation files -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/i18n/defaults-*.min.js"></script>
    <title>Infoshare Academy</title>
</head>
<body>

<form method="POST" action="Models" class="form-horizontal" role="form">

    <div class="form-group">
        <label class="col-lg-2 control-label">Wybierz kategorię</label>

        <div class="col-lg-10">
            <select name="brand" data-live-search="true" class="selectpicker">
                <c:forEach items="${brands}" var="brand">
                    <option
                            value="${brand.id};${brand.name};${brand.link}">${brand.name}</option>
                </c:forEach>
            </select>
        </div>
    </div>

    <input type="submit" value="OK">
</form>

</body>
</html>
