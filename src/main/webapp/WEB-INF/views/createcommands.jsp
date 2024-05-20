<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Commands Creation</title>
</head>
<body>
<header>
    <h1>Commands Creation</h1>
</header>
<main>
    <form action="savecommands" method="post">
        <div>
            <label for="customerId">Customer ID:</label>
            <input type="text" id="customerId" name="customerId">
        </div>
        <div>
            <label for="livreurId">Livreur ID:</label>
            <input type="text" id="livreurId" name="livreurId">
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="commandsList">Commands List</a>
</footer>
</body>
</html>
