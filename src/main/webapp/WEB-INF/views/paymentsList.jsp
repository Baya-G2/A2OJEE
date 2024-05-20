<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Payments List</title>
</head>
<body>
<h1>Payments List</h1>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Amount</th>
        <th>Payment Date</th>
        <th>Type</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="payment" items="${paymentList}">
        <tr>
            <td>${payment.id}</td>
            <td>${payment.amount}</td>
            <td>${payment.payedAt}</td>
            <td>${payment.class.simpleName}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
