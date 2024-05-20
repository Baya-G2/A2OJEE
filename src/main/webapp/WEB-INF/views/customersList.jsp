<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Customers List</title>
</head>
<body>
<header>
    <h1>Customers List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">First Name</th>
            <th scope="col">Last Name</th>
            <th scope="col">email</th>
            <th scope="col">address</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customersVue}" var="customer">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>
                <td>
                    <a
                            onclick="return confirm('do you really wanna delete this customer?')"
                            href="deletecustomer?id=${customer.id}">
                        Delete
                    </a>
                </td>
                <td>
                <a
                            href="editcustomer?id=${customer.id}">
                    Edit </a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</main>
<footer>
    <a href="createcustomer">Customer Creation</a>
</footer>
</body>
</html>
