<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Order Detail</title>
</head>
<body>
<h1>Create Order Detail</h1>
<form action="saveorderDetail" method="post">
    <div>
        <label for="quantity">Quantity:</label>
        <input type="text" id="quantity" name="quantity">
    </div>
    <div>
        <label for="product">Product:</label>
        <select id="product" name="product">
            <c:forEach var="product" items="${products}">
                <option value="${product.id}">${product.name}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <label for="commands">Command:</label>
        <select id="commands" name="commands">
            <c:forEach var="command" items="${commands}">
                <option value="${command.id}">${command.name}</option>
            </c:forEach>
        </select>
    </div>
    <div>
        <input type="submit" value="Save">
    </div>
</form>
</body>
</html>
