<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<header class="d-flex flex-column flex-md-row align-items-center p-3 px-md-4 mb-3 bg-white border-bottom shadow-sm">
    <p class="h5 my-0 me-md-auto fw-normal">Shop</p>
    <%
        String fname = request.getParameter("firstname");
        String lname = request.getParameter("lastname");
        String c_name = request.getParameter("cc-name");
        String c_num = request.getParameter("cc-number");
        String c_exp = request.getParameter("cc-expiration");
        String c_ccv = request.getParameter("cc-ccv");
    %>
    <a class="btn btn-outline-primary" href="${pageContext.request.contextPath}/InfoBill?firstname=<%=fname%>&lastname=<%=lname%>&cc-name=<%=c_name%>&cc-number=<%=c_num%>&cc-expiration=<%=c_exp%>&cc-ccv=<%=c_ccv%>">Check Billing</a>
</header>