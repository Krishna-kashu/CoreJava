<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <div class="card shadow">
        <div class="card-body text-center">
            <h2 class="text-success mb-4">${message}</h2>

            <table class="table table-bordered table-striped table-hover">
                <thead class="table-dark">
                <tr>
                    <th>Field</th>
                    <th>Details</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Name</td>
                    <td>${product.name}</td>
                </tr>
                <tr>
                    <td>Type</td>
                    <td>${product.type}</td>
                </tr>
                <tr>
                    <td>IncomingPrice</td>
                    <td>${product.incomingPrice}</td>
                </tr>
                <tr>
                    <td>SellingPrice</td>
                    <td>${product.sellingPrice}</td>
                </tr>
                <tr>
                    <td>MRP</td>
                    <td>${product.mrp}</td>
                </tr>
                <tr>
                    <td>Description</td>
                    <td>${product.description}</td>
                </tr>
                <tr>
                    <td>Quantity</td>
                    <td>${product.quantity}</td>
                </tr>
                <tr>
                    <td>Color</td>
                    <td>${product.color}</td>
                </tr>
                <tr>
                    <td>Manufacture Date</td>
                    <td>${product.manufDate}</td>
                </tr>
                <tr>
                    <td>Warranty</td>
                    <td>${product.warranty}</td>
                </tr>

                </tbody>
            </table>

            <a href="index.jsp" class="btn btn-primary mt-3">Back to Home</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
