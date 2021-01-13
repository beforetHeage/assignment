<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="en" class="h-100">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Sticky Footer Template · Bootstrap v5.0</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/sticky-footer/">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">


    <!-- Bootstrap core CSS -->
    <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>
</head>
<body class="d-flex flex-column h-100">

<%@include file="header-cover.jsp"%>

<!-- Begin page content -->
<main class="flex-shrink-0">
    <div class="container">

    </div>
    <div class="container">
        <h1 class="mt-5">Welcome <% out.println(request.getParameter("firstname") + " " + request.getParameter("lastname"));%></h1>
        <p class="lead">Your payment completed successfully!</p>
    </div>
</main>

<%@include file="footer.jsp"%>

</body>
</html>

