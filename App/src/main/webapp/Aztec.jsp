<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/starter-template.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css"
          integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"
            integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS"
            crossorigin="anonymous"></script>
    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
    <title>Infoshare Acedemy</title>

</head>
<body>
<t:navbar></t:navbar>

<div class="container">

    <div class="starter-template">
        <h1>Wyszukiwarka części samochodowych</h1>
        <form method="GET" action="AztecKey" class="form-horizontal" role="form">

            <div class="form-group row lower">
                <label class="col-lg-3 control-label"><b>Podaj klucz sesji użytkownika z aplikacji AtenaAztec</b></label>

                <div class="col-lg-6">
                    <input type="key" class="form-control">
                </div>
                <input class="col-lg-1 button-middle" type="submit" value="OK">
            </div>
        </form>
    </div>
</div>

</body>

</html>