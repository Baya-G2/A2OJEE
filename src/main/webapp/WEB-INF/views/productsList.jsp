<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Products List</title>
</head>
<body>
<header>
    <h1>Products List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">id</th>
            <th scope="col">product</th>
            <th scope="col">price</th>
            <th scope="col">category</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productsVue}" var="product">
            <tr>
                <td>${product.id}</td>
                <td>${product.product}</td>
                <td>${product.price}</td>
                <td>${product.category}</td>
                <td>
                    <a
                            onclick="return confirm('do you really wanna delete this product?')"
                            href="deleteproduct?id=${product.id}">
                        Delete
                    </a>
                </td>
                <td>
                    <a
                            href="editproduct?id=${product.id}">
                        Edit </a> </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</main>
<footer>
    <a href="createproduct">Product Creation</a>
</footer>
</body>
</html>
