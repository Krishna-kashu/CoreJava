<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EarPhone Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
<div class="container mt-5">
    <h2 class="mb-4">Register Your EarPhone</h2>
    <form action="ear" method="post">
        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" name="brand" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Type</label>
            <input type="text" name="type" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Cost (₹)</label>
            <input type="number" name="cost" class="form-control" step="0.01" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Features</label>
            <textarea name="features" class="form-control" rows="3" required></textarea>
        </div>
        <div class="mb-3">
            <label class="form-label">Color</label>
            <input type="text" name="color" class="form-control" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Warranty</label>
            <select name="warranty" class="form-select" required>
                <option value="">Select</option>
                <option>6 Months</option>
                <option>1 Year</option>
                <option>2 Years</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>
</body>
</html>
