<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Commands List</title>
</head>
<body>
<header>
    <h1>Commands List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Customer ID</th>
            <th scope="col">Livreur ID</th>
            <th scope="col">Order State</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${commandsVue}" var="command">
            <tr>
                <td>${command.id}</td>
                <td>${command.customer.id}</td>
                <td>${command.livreur.id}</td>
                <td>${command.orderState}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="createcommands">Create New Command</a>
</footer>
</body>
</html>
