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
            <c:choose>
                <c:when test="${!sessionData.isLoggedIn()}">
                    <p class="lead">Zaloguj się do naszego portalu przy wykorzystaniu mediów społecznościowych.</p>
                </c:when>
            </c:choose>
            <div class="row">

                <c:choose>

                    <c:when test="${!sessionData.isLoggedIn()}">
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
                            <h2>Witaj ${ sessionData.getUserData() }
                            </h2>
                            <div class="row">
                                <div class="col-xs-12 col-lg-6">
                                    <h3> Wyszukiwanie części</h3>
                                    <a href="Brands">
                                        <img src="http://coolspringscollision.com/wp-content/uploads/2014/10/genuine-parts1.png"
                                             width="300" height="200">
                                    </a>

                                </div>
                                <div class="col-xs-12 col-lg-6">
                                    <h3>Wyloguj się</h3>
                                    <a href="logout">
                                        <img src="https://www.hscripts.com/freeimages/icons/menu-buttons/button9/set1/logout.gif"
                                             width="218" height="88">
                                    </a>
                                </div>
                            </div>
                        </div>
                    </c:otherwise>

                </c:choose>

            </div>


        </div>
    </div>

</body>

</html>