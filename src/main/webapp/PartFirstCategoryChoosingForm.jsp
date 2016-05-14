<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/bootstrap-select.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="js/bootstrap-select.js"></script>
    <title>Car selecting form</title>
</head>

<body>
<script>
    $(document).ready(function () {

    });

</script>
    <div class="container">
        <form method="POST" action="PartCategory" class="form-horizontal" role="form">

            <Input type="hidden" value="${brandName}" name="brandName" >${brandName}
            <br>

            <Input type="hidden" value="${modelName}" name="modelName" >${modelName}
            <br>

            <Input type="hidden" value="${engineName}" name="engineName" >${engineName}
            <br>
            <div class="form-group">
                <label for="basic" class="col-lg-2 control-label">Wybierz kategorię</label>

                <!--todo: pobieranie danych i dodawanie nowej opcji do wyszukania po wyborze poprzedniej-->
                <!--todo: przycisk akceptacji? dynamiczna zmiana? wybierasz kategorie i pojawia sie podkategoria nizej, jesli zmieniasz kategorie to usuwaja sie wszystkie i
                todo: pojawia tylko jeden poziom nizej-->
                <div class="col-lg-10">
                    <select id="basic" class="selectpicker show-tick form-control" data-live-search="true" name="category">
                        <c:forEach items="${categories}" var="category">
                            <option value="${category.id};${category.name};${category.link};${category.has_children}">${category.name}</option>
                        </c:forEach>
                    </select>
                </div>

                <input type="submit" value="OK">
            </div>
        </form>
    </div>

</body>
</html>
