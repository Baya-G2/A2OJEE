<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Cash Payment List</title>
</head>
<body>
<h1>Cash Payment List</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Amount</th>
        <th>Payed At</th>
        <th>Cash Tendered</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="cash" items="${cashList}">
        <tr>
            <td>${cash.id}</td>
            <td>${cash.amount}</td>
            <td>${cash.payedAt}</td>
            <td>${cash.cashTendered}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
