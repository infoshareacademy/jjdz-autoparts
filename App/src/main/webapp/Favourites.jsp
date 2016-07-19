<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Infoshare Academy</title>
    <%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link href="css/forms-template.css" rel="stylesheet">
    <link rel="stylesheet" href="css/font-awesome/css/font-awesome.min.css">

    <![endif]-->
</head>
<body>

<t:navbar></t:navbar>

<div class="container lower forms-template">
    <c:choose>
        <c:when test="${!sessionData.isLoggedIn()}">
            <p class="lead">Zaloguj się do naszego portalu przy wykorzystaniu mediów społecznościowych.</p>
            <div class="row">
                <div id="linkedIn" class="col-xs-12 col-lg-12">
                    <p>
                        <a href="LinkedInLogging">
                            <img border="0" alt="W3Schools"
                                 src="https://content.linkedin.com/content/dam/developer/global/en_US/site/img/signin-button.png"
                                 width="215" height="41">
                        </a>
                    </p>
                </div>
            </div>
        </c:when>

        <c:otherwise>
            <h1>Wyszukiwarka części samochodowych</h1>
            <p class="lead">Twoje ulubione części</p>

            <ul class="list-group">
                <c:forEach items="${favouriteParts}" var="part" varStatus="favsCount">

                    <ul class="list-group button-middle ">
                        <div class="col-lg-12 ">
                            <div class="row">
                                <form method="GET" action="FavsMgmt" name="partToDelete">
                                    <div class="col-lg-12 row" align="center">
                                        <br>
                                        <c:out value="${part.partBrand}"/> <c:out value="${part.partName}"/> <c:out
                                            value="${part.partId}"/> <a href="${part.partLink}">Wyszukaj w Allegro</a>
                                        <button type="submit"
                                                value="${part.partId}"
                                                name="remove"> Usuń z ulubionych
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </ul>
                </c:forEach>

            </ul>
        </c:otherwise>
    </c:choose>
</div>
<hr>
<footer>
    <div class="col-xs-2 col-lg-2" text-align="center">
        <p>&copy; Javatar</p>
    </div>
</footer>
</body>
</html>
