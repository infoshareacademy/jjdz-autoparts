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

    <%--<div id="forms">--%>
    <%--<div class="row">--%>
    <%--<form method="POST" action="updateUser" class="form-horizontal" role="form">--%>
    <%--<div class="col-xs-12 col-lg-4">--%>

    <%--<div class="form-group row lower">--%>
    <%--<label class="col-lg-3 control-label"><b>Wybierz użytkownika</b></label>--%>
    <%--<select name="userId" class="selectpicker show-tick form-control" data-live-search="true"--%>
    <%--required>--%>
    <%--<c:forEach items="${users}" var="users">--%>
    <%--<option value="${users.id}">${users.eMail}</option>--%>
    <%--</c:forEach>--%>
    <%--</select>--%>
    <%--</div>--%>
    <%--<input class="col-lg-1 button-middle" type="submit" value="Modyfikuj">--%>

    <%--</div>--%>
    <%--</form>--%>
    <%--<div class="col-xs-12 col-lg-4">--%>

    <%--</div>--%>
    <%--<div class="col-xs-12 col-lg-4">--%>

    <%--</div>--%>
    <%--<div class="col-xs-12 col-lg-4">--%>

    <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <form method="POST" action="updateUser" role="form">
        <select name="user" required>
            <c:forEach items="${users}" var="users">
                <option value="${users.id}">${users.eMail}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Modyfikuj">
    </form>

</div>

</body>