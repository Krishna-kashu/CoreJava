<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Book Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<div class="container mt-5">
    <form action="library" method="post" class="p-4 border rounded bg-light shadow-sm">
        <h4 class="text-success">${message}</h4>
        <h2 class="mb-4">Book Form</h2>

        <div class="mb-3">
            <label for="name" class="form-label">Book Name:</label>
            <input type="text" class="form-control" id="name" name="name" >
        </div>

        <div class="mb-3">
            <label for="bookID" class="form-label">Book ID:</label>
            <input type="text" class="form-control" id="bookID" name="bookID" required>
        </div>

        <div class="mb-3">
            <label for="author" class="form-label">Author Name:</label>
            <input type="text" class="form-control" id="author" name="author" required>
        </div>

        <div class="mb-3">
            <label for="year" class="form-label">Published Year:</label>
            <input type="number" class="form-control" id="year" name="year" required>
        </div>

        <div class="mb-3">
            <label for="cost" class="form-label">Cost:</label>
            <input type="number" class="form-control" id="cost" name="cost" required>
        </div>

        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</form>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
