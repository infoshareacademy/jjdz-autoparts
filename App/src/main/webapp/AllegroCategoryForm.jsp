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

<form method="POST" action="AddingToCart">

    <t:navbar></t:navbar>

    <div class="container lower forms-template">

        <h1>Wyszukiwarka części samochodowych</h1>
        <p class="lead">Poniżej znajdują się wyniki</p>
        <div class="row">
            <div class="col-xs-6 col-lg-6">
                <h2>Dodaj do koszyka</h2>
                <input autofocus type="submit" name="part" value="${partName} ${partBrand} ${partId}"/>

            </div><!--/.col-xs-6.col-lg-4-->
            <div class="col-xs-6 col-lg-6">
                <h2>Link allegro</h2>
                <p><a href="${allegroLink}"><c:out value="${allegroLink}"/></a></p>
            </div><!--/.col-xs-6.col-lg-4-->

        </div>

    </div>

</form>

<form method="POST" action="AddToFavourites">

    <div class="container">
        <div class="forms-template">
            <input type="submit" value="Dodaj do ulubionych" align="center"/>
        </div>

    </div>

</form>

<form method="GET" action="Cart">
    <div class="container">
        <div class="forms-template">
            <input type="submit" value="Przejdź do koszyka" align="center"/>
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
