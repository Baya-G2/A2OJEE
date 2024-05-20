<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create Payment</title>
</head>
<body>
<h1>Create Payment</h1>
<form action="savePayment" method="post">
    <div>
        <label for="amount">Amount:</label>
        <input type="text" id="amount" name="amount">
    </div>
    <div>
        <label for="payedAt">Payment Date:</label>
        <input type="date" id="payedAt" name="payedAt">
    </div>
    <div>
        <label for="paymentType">Payment Type:</label>
        <select id="paymentType" name="paymentType">
            <option value="CASH">Cash</option>
            <option value="CHECK">Check</option>
        </select>
    </div>
    <div id="cashDetails" style="display:none;">
        <label for="cashTendered">Cash Tendered:</label>
        <input type="text" id="cashTendered" name="cashTendered">
    </div>
    <div id="checkDetails" style="display:none;">
        <label for="bankName">Bank Name:</label>
        <input type="text" id="bankName" name="bankName">
        <label for="bankId">Bank ID:</label>
        <input type="text" id="bankId" name="bankId">
    </div>
    <div>
        <input type="submit" value="Save">
    </div>
</form>
<script>
    document.getElementById('paymentType').addEventListener('change', function() {
        var cashDetails = document.getElementById('cashDetails');
        var checkDetails = document.getElementById('checkDetails');
        if (this.value === 'CASH') {
            cashDetails.style.display = 'block';
            checkDetails.style.display = 'none';
        } else if (this.value === 'CHECK') {
            cashDetails.style.display = 'none';
            checkDetails.style.display = 'block';
        } else {
            cashDetails.style.display = 'none';
            checkDetails.style.display = 'none';
        }
    });
</script>
</body>
</html>
