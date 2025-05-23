<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
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
                    <td>Book Name</td>
                    <td>${details.name}</td>
                </tr>
                <tr>
                    <td>Book ID</td>
                    <td>${details.bookID}</td>
                </tr>
                <tr>
                    <td>Author Name</td>
                    <td>${details.authorName}</td>
                </tr>
                <tr>
                    <td>Book cost</td>
                    <td>${details.cost}</td>
                </tr>
                <tr>
                    <td>Published Year</td>
                    <td>${details.publishedYear}</td>
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
