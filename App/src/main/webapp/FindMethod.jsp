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
        <div class="row">
                    <div id="user">
                        <h1>Wybierz metodę wyboru samochodu</h1>
                        </h2>
                        <div class="row">
                            <div class="col-xs-12 col-lg-6">
                                <h3>Formularz z pytaniami</h3>
                                <a href="Brands">
                                    <img src="http://www.speakersbank.org.au/wp-content/uploads/2016/01/Form2-512.png"
                                         width="300" height="200">
                                </a>

                            </div>
                            <div class="col-xs-12 col-lg-6">
                                <h3>Kod Aztec</h3>
                                <a href="Aztec.jsp">
                                    <img src="http://www.taltech.com/assets/img/barcodes/barcode-azteccode-350dpi.png"
                                         width="218" height="88">
                                </a>
                            </div>
                        </div>
                    </div>

        </div>


    </div>
</div>

</body>

</html>