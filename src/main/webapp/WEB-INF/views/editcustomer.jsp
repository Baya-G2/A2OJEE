<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Edition</title>
</head>
<body>
<header>
    <h1>Customer Edition</h1>
</header>
<main>
    <form action="editcustomer" method="post">
        <div>
            <label for="FirstName">First Name : </label>
            <input type="text" id="FirstName" name="FirstName">
        </div>
        <div>
            <label for="LastName">Last Name : </label>
            <input type="text" id="LastName" name="LastName">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="address">Address : </label>
            <input type="text" id="address" name="address">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="customersList">Customers List</a>
</footer>
</body>
</html>

