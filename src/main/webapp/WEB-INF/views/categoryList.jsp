<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>category List</title>
</head>
<body>
<header>
    <h1>category List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">category</th>
            <th scope="col">description</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${customersVue}" var="customer">
            <tr>
                <td>${category.id}</td>
                <td>${category.category}</td>
                <td>${category.description}</td>
                <td>
                    <a
                            onclick="return confirm('do you really wanna delete this category?')"
                            href="deletecategory?id=${category.id}">
                        Delete
                    </a>
                </td>
                <td>
                    <a
                            href="editcategory?id=${category.id}">
                        Edit </a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</main>
<footer>
    <a href="createcategory">Category Creation</a>
</footer>
</body>
</html>
