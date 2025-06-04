<!DOCTYPE html>
<html>
<head>
    <title>Product Form</title>
</head>
<body>
<div align="center">
<h2>Enter Product Details</h2>

    <form action="ProductValidationServlet" method="post">
        Product ID: <input type="text" name="productId" /><br/><br/>
        Product Name: <input type="text" name="productName" /><br/><br/>
        Price: <input type="text" name="price" /><br/><br/>
        Quantity: <input type="text" name="quantity" /><br/><br/>
        Category:
        <select name="category" >
            <option value="Electronics">Electronics</option>
            <option value="Clothing">Clothing</option>
            <option value="Books">Books</option>
            <option value="Home">Home</option>
        </select><br/><br/>
        <input type="submit" value="Submit Product" />
    </form>
</div>

</body>
</html>
