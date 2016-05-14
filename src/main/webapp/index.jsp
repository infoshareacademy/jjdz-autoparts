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

    <title>Infoshare Acedemy</title>

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
                <li class="active"><a href="#">Home</a></li>
                <li><a href="#about">About</a></li>
                <li><a href="#contact">Contact</a></li>
            </ul>
        </div><!--/.nav-collapse -->
    </div>
</nav>

<div class="container">

    <div class="starter-template">
        <h1>Wyszukiwarka części samochodowych</h1>
        <p class="lead">Zaloguj się do naszego portalu przy wykorzystaniu mediów społecznościowych.</p>
        <div class="row">


            <%--<% if (session.getAttribute("user") == "null") %>--%>
            <c:choose>

                <c:when test="${sessionScope.user == null}">
                    <div id="linkedIn" class="col-xs-12 col-lg-12">
                        <p>
                            <a href="LinkedInLogging">
                                <img border="0" alt="W3Schools"
                                     src="https://content.linkedin.com/content/dam/developer/global/en_US/site/img/signin-button.png"
                                     width="215" height="41">
                            </a>
                        </p>
                    </div>
                </c:when>

                <c:otherwise>
                    <div id="user">
                        <h1>Pomyślnie zalogowałeś się do portalu</h1>
                        <p>Witaj <%= session.getAttribute("user") %>
                        </p>
                    </div>
                </c:otherwise>

            </c:choose>

        </div>


    </div>
</div>


</body>
</html>
