<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EarPhone Viewer Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body class="bg-light">


<div class="container mt-5">
    <h2 class="mb-4">Find EarPhone By ID</h2>

    <form action="phone" method="get">
        <div class="mb-3">
            <label class="form-label">ID</label>
            <input type="text" name="phoneID" class="form-control" required placeholder="enter earphone id">
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>
</body>
</html>
