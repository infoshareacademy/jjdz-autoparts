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
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/css/bootstrap-select.min.css">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.10.0/js/bootstrap-select.min.js"></script>
    <title>Infoshare Academy</title>
</head>

<body>
    <script>
        $(document).ready(function () {

        });

    </script>

    <div class="container">
        <form method="GET" action="PartCategory" class="form-horizontal" role="form">
            <div class="form-group">

                <label for="basic">Marka: </label>${brandName}
            <br>

                <label for="basic">Model: </label>${modelName}
            <br>

                <label for="basic">Silnik: </label>${engineName}
            <br>

            <label for="basic" class="col-lg-2 control-label">Wybierz kategorię</label>

            <div class="col-lg-10">
                <select id="basic" class="selectpicker show-tick form-control" data-live-search="true" name="category">
                    <c:forEach items="${categories}" var="category">
                        <option value="${category.name};${category.link};${category.has_children}">${category.name}</option>
                    </c:forEach>
                </select>
            </div>

            <input type="submit" value="OK">
            </div>
        </form>
    </div>

</body>
</html>
