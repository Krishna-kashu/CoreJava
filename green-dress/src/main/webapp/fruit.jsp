<!DOCTYPE html>
<html>
<head>
    <title>Fruit Form</title>
    <style>
        body { background-color: #fff0f5; font-family: Verdana; padding: 20px; }
        label, input { display: block; margin: 8px 0; }
        input[type="submit"] { background-color: #ffb6c1; border: none; padding: 8px 16px; }
    </style>
</head>
<body>
<h2>Enter Fruit Details</h2>
<form action="submitFruit" method="post">
    <label>Fruit Name:</label>
    <input type="text" name="fruitName" />

    <label>Color:</label>
    <input type="text" name="color" />

    <label>Taste:</label>
    <input type="text" name="taste" />

    <label>Season:</label>
    <input type="text" name="season" />

    <label>Price per kg:</label>
    <input type="text" name="price" />

    <label>Origin Country:</label>
    <input type="text" name="origin" />

    <label>Vitamin Content:</label>
    <input type="text" name="vitamin" />

    <label>Seed Type:</label>
    <input type="text" name="seed" />

    <label>Shelf Life:</label>
    <input type="text" name="life" />

    <label>Favorite Dish:</label>
    <input type="text" name="dish" />

    <input type="submit" value="Submit" />
</form>
</body>
</html>
