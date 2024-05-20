<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Cash Payment</title>
</head>
<body>
<h1>Create Cash Payment</h1>
<form action="saveCash" method="post">
    <div>
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount">
    </div>
    <div>
        <label for="payedAt">Payed At:</label>
        <input type="text" id="payedAt" name="payedAt">
    </div>
    <div>
        <label for="cashTendered">Cash Tendered:</label>
        <input type="text" id="cashTendered" name="cashTendered">
    </div>
    <div>
        <input type="submit" value="Save">
    </div>
</form>
</body>
</html>
