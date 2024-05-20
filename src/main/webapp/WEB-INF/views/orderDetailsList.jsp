<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order Details List</title>
</head>
<body>
<h1>Order Details List</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Quantity</th>
        <th>Product</th>
        <th>Command</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="orderDetail" items="${orderDetailList}">
        <tr>
            <td>${orderDetail.id}</td>
            <td>${orderDetail.quantity}</td>
            <td>${orderDetail.product.name}</td>
            <td>${orderDetail.commands.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
