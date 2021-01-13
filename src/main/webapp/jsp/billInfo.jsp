<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en" class="h-100">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sticky Footer Template · Bootstrap v5.0</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sticky-footer/">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

    <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<style>
    .form-group > label {
        font-size: xx-small;
        text-align: right;
        clear: both;
        float:left;
        margin-right:15px;
    }

</style>
<body class="d-flex flex-column h-100">

<%@include file="header.jsp"%>

<!-- Begin page content -->
<main class="flex-shrink-0">
    <div class="container">

    </div>
    <div class="container">
        <div class="card card-outline-secondary">
            <div class="card-body">
                <h4 class="text-center">Credit Card Information</h4>
                <div class="form-group">
                    <label for="cc_full">Firstname and Lastname:</label>
                    <div id="cc_full"><% out.println(request.getParameter("firstname") + " " + request.getParameter("lastname"));%></div>
                </div>
                <div class="form-group">
                    <label for="cc_name">Card Holder's Name:</label>
                    <div id="cc_name"><%out.println(request.getParameter("cc-name"));%></div>
                </div>
                <div class="form-group">
                    <label for="cc_num">Card Number:</label>
                    <div id="cc_num"><%out.println(request.getParameter("cc-number"));%></div>
                </div>
                <div class="form-group row">
                    <div class="col-lg-2">
                        <label for="cc_exp">Expiration date:</label>
                        <div id="cc_exp"><%out.println(request.getParameter("cc-expiration"));%></div>
                    </div>
                    <div class="col-lg-4">
                        <label for="cc_ccv">CCV:</label>
                        <div id="cc_ccv"><%out.println(request.getParameter("cc-ccv"));%></div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</main>

<%@include file="footer.jsp"%>

</body>
</html>

