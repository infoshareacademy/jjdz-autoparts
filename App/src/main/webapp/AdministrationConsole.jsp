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

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
          integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <link href="css/forms-template.css" rel="stylesheet">
</head>
<body>
<t:navbar></t:navbar>

<div class="container lower forms-template">

    <h1 align="center">Lista użytkowników</h1>
    <c:if test="${not empty errorMessage}">
        <div class="alert alert-danger alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            <c:out value="${errorMessage}"/>
        </div>
    </c:if>
    <c:if test="${not empty warningMessage}">
        <div class="alert alert-danger alert-dismissible" role="alert">
            <button type="button" class="close" data-dismiss="alert" aria-label="Close"><span
                    aria-hidden="true">&times;</span></button>
            <c:out value="${warningMessage}"/>
        </div>
    </c:if>
    <div class="row">
        <table class="table table-bordered">
            <thead>
            <tr>
                <th>Imię</th>
                <th>Nazwisko</th>
                <th>Email</th>
                <th>Administrator</th>
                <th>Raporty</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${users}" var="users">
                <tr>
                    <td><c:out value="${users.firstName}"/></td>
                    <td><c:out value="${users.lastName}"/></td>
                    <td><c:out value="${users.eMail}"/></td>
                    <td>
                        <c:if test="${users.administrator == 1}">
                            <c:out value="Tak"></c:out></c:if>
                        <c:if test="${users.administrator == 0}">
                            <c:out value="Nie"></c:out></c:if>
                    </td>
                    <td>
                        <c:if test="${users.reports == 1}">
                            <c:out value="Tak"></c:out></c:if>
                        <c:if test="${users.reports == 0}">
                            <c:out value="Nie"></c:out></c:if>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="adminForms">
        <h1>Zarządzaj prawami do administrowania aplikacją</h1>
        <div class="col-xs-12 col-lg-6">
            <form method="POST" action="setAdminUser" class="form-horizontal" role="form">
                <div class="form-group row lower">
                    <h3>Dodaj prawa administratora</h3>
                    <select name="userId" class="selectpicker show-tick form-control" data-live-search="true"
                            required>
                        <c:forEach items="${usersNotAdmin}" var="usersNotAdmin">
                            <option value="${usersNotAdmin.id}">${usersNotAdmin.eMail}</option>
                        </c:forEach>
                    </select>
                </div>
                <input class="col-lg-6 button-middle" type="submit" value="Zatwierdź">
            </form>
        </div>
        <div class="col-xs-12 col-lg-6">

            <form method="POST" action="revokeAdmin" class="form-horizontal" role="form">
                <div class="form-group row lower">
                    <h3>Odbierz prawa administratora</h3>
                    <select name="userId" class="selectpicker show-tick form-control" data-live-search="true"
                            required>
                        <c:forEach items="${usersAdmin}" var="usersAdmin">
                            <option value="${usersAdmin.id}">${usersAdmin.eMail}</option>
                        </c:forEach>
                    </select>
                </div>
                <input class="col-lg-6 button-middle" type="submit" value="Zatwierdź">
            </form>
        </div>
    </div>

    <div class="reportsForms">
        <h1>Zarządzaj prawami do raportów</h1>
        <div class="col-xs-12 col-lg-6">
            <form method="POST" action="setReportsUser" class="form-horizontal" role="form">
                <div class="form-group row lower">
                    <h3>Dodaj prawo do raportów</h3>
                    <select name="userId" class="selectpicker show-tick form-control" data-live-search="true"
                            required>
                        <c:forEach items="${usersNotReports}" var="usersNotReports">
                            <option value="${usersNotReports.id}">${usersNotReports.eMail}</option>
                        </c:forEach>
                    </select>
                </div>
                <input class="col-lg-6 button-middle" type="submit" value="Zatwierdź">
            </form>
        </div>
        <div class="col-xs-12 col-lg-6">
            <form method="POST" action="revokeReports" class="form-horizontal" role="form">
                <div class="form-group row lower">
                    <h3>Odbierz prawo do raportów</h3>
                    <select name="userId" class="selectpicker show-tick form-control" data-live-search="true"
                            required>
                        <c:forEach items="${usersReports}" var="usersReports">
                            <option value="${usersReports.id}">${usersReports.eMail}</option>
                        </c:forEach>
                    </select>
                </div>
                <input class="col-lg-6 button-middle" type="submit" value="Zatwierdź">
            </form>
        </div>
    </div>
</div>


</body>