<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Creation</title>
</head>
<body>
<header>
    <h1>Product Creation</h1>
</header>
<main>
    <form action="saveproduct" method="post">
        <div>
            <label for="product">Product Name : </label>
            <input type="text" id="product" name="product">
        </div>
        <div>
            <label for="price">Price : </label>
            <input type="text" id="price" name="price">
        </div>
        <div>
            <label for="category">Category : </label>
            <select id="category" name="category">
                <option value="1">candle</option>
                <option value="2">Home Parfume</option>
            </select>
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="productsList">Products List</a>
</footer>
</body>
</html>
