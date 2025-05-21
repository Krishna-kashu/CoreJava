<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>

            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="container mt-4">
    <h2 class="mb-4 text-center">Add New Product</h2>

    <form action="product" method="post">
        <div class="mb-3">
            <label class="form-label">Email address</label>
            <input type="email" class="form-control" required>
            <div class="form-text">Enter valid email address</div>
        </div>

        <div class="mb-3">
            <label class="form-label">Name</label>
            <input type="text" class="form-control" name="name" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Product Type</label>
            <select class="form-select" name="type">
                <option selected disabled>Select a type</option>
                <option>Electronics</option>
                <option>Home Decor</option>
                <option>Accessories</option>
            </select>
        </div>

        <div class="row">
            <div class="col-md-4 mb-3">
                <label class="form-label">Incoming Price</label>
                <input type="number" class="form-control" name="incomingPrice" required>
            </div>
            <div class="col-md-4 mb-3">
                <label class="form-label">Selling Price</label>
                <input type="number" class="form-control" name="sellingPrice" required>
            </div>
            <div class="col-md-4 mb-3">
                <label class="form-label">MRP</label>
                <input type="number" class="form-control" name="mrp" required>
            </div>
        </div>

        <div class="mb-3">
            <label class="form-label">Description</label>
            <textarea class="form-control" rows="3" name="description" required></textarea>
        </div>

        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" class="form-control" name="brand" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Quantity</label>
            <input type="number" class="form-control" name="quantity" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Manufacture Date</label>
            <input type="date" class="form-control" name="manufDate">
        </div>

        <div class="mb-3">
            <label class="form-label">Color</label>
            <select class="form-select" name="color">
                <option selected disabled>Select a color</option>
                <option value="1">Black </option>
                <option value="2">Red</option>
                <option value="3">Blue</option>
                <option value="4">Brown </option>
                <option value="5">Green</option>
                <option value="6">Yellow</option>
                <option value="7">Orange </option>
                <option value="8">Pink</option>
                <option value="9">Light Green</option>
                <option value="10">Golden </option>
                <option value="11">White</option>
                <option value="12">Olive</option>
                <option value="13">purple </option>
                <option value="14">Rose Gold</option>
                <option value="15">Gray</option>
            </select>
        </div>

        <div class="mb-3">
            <label class="form-label d-block">Return Policy</label>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="returnPolicy" value="yes">
                <label class="form-check-label">Yes</label>
            </div>
            <div class="form-check form-check-inline">
                <input class="form-check-input" type="radio" name="returnPolicy" value="no">
                <label class="form-check-label">No</label>
            </div>
        </div>

        <div class="mb-4">
            <label class="form-label">Warranty</label>
            <select class="form-select" name="warranty">
                <option selected disabled>Select warranty period</option>
                <option>5 months or less</option>
                <option>6 months</option>
                <option>1 year</option>
                <option>2 years</option>
                <option>More than 2 years</option>
            </select>
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>

