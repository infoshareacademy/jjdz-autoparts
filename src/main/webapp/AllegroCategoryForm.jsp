<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Acedemy</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">


    <!--<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">-->
    <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">-->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

<form method="GET" action="Output.jsp">


    <%--Wybraną część możesz wyszukać w kategorii allegro: <a href="${allegroLink}">${allegroLink}</a>--%>
    <%--<br><br>--%>
    <%--Jako hasło wyszukiwania wpisz: ${partName} ${partBrand} ${partId}--%>

    <nav class="navbar navbar-fixed-top navbar-inverse">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="https://github.com/infoshareacademy/jjdz-autoparts">Autoparts</a>
            </div>
            <div id="navbar" class="collapse navbar-collapse">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#">Wyniki</a></li>
                </ul>
            </div><!-- /.nav-collapse -->
        </div><!-- /.container -->
    </nav><!-- /.navbar -->

    <div class="container">

        <div class="row row-offcanvas row-offcanvas-right">

            <div class="col-xs-12 col-sm-9">
                <p class="pull-right visible-xs">
                    <button type="button" class="btn btn-primary btn-xs" data-toggle="offcanvas">Toggle nav</button>
                </p>
                <div class="jumbotron">
                    <h1>Witaj!</h1>
                    <h2>Poniżej znajdują się wyniki</h2>
                    <p></p>
                </div>
                <div class="row">
                    <div class="col-xs-6 col-lg-6">
                        <h2>Samochód</h2>
                        <p>Opis </p>
                        <%--<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>--%>
                    </div><!--/.col-xs-6.col-lg-4-->
                    <div class="col-xs-6 col-lg-6">
                        <h2>Link allegro</h2>
                        <p><a href="${allegroLink}">${allegroLink}</a></p>
                        <%--<p><a class="btn btn-default" href="#" role="button">View details &raquo;</a></p>--%>
                    </div><!--/.col-xs-6.col-lg-4-->

                </div>
            </div>

        </div>

        <hr>

        <footer>
            <p>&copy; Javatar</p>
        </footer>

    </div>




</form>

</body>
</html>
