<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>category Creation</title>
</head>
<body>
<header>
    <h1>category Creation</h1>
</header>
<main>
    <form action="savecategory" method="post">
        <div>
            <label for="category">category : </label>
            <input type="text" id="category" name="category">
        </div>
        <div>
            <label for="description">description : </label>
            <input type="text" id="description" name="description">
        </div>


        <div>
            <input type="submit" value="save">
        </div>
    </form>
</main>
<footer>
    <a href="categoryList">category List</a>
</footer>
</body>
</html>

