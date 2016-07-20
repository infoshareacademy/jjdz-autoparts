<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@tag description="navbar"
       pageEncoding="UTF-8"
%>


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
                <li><a href="/jjdz-autoparts">Home</a></li>
            </ul>
            <c:choose>
                <c:when test="${sessionData.isAdmin()}">
                    <ul class="nav navbar-nav">
                        <li><a href="usersList">Administrator</a></li>
                    </ul>
                </c:when>
            </c:choose>
            <ul class="nav navbar-nav">
                <li><a href="/jjdz-autoparts/Cart">Koszyk</a></li>
            </ul>
            <ul class="nav navbar-nav">
                <li><a href="http://localhost:18080/report-module/Report">Raport</a></li>
            </ul>
        </div>
    </div>
</nav>

