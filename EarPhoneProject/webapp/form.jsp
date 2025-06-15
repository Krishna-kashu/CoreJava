<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>EarPhone Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function validateForm() {
            const brand = document.forms["earForm"]["brand"].value.trim();
            const type = document.forms["earForm"]["type"].value.trim();
            const cost = document.forms["earForm"]["cost"].value;
            const features = document.forms["earForm"]["features"].value.trim();
            const color = document.forms["earForm"]["color"].value.trim();
            const warranty = document.forms["earForm"]["warranty"].value;

            const costValue = parseFloat(cost);

            if (brand.length < 2) {
                alert("Brand must be at least 2 characters long.");
                return false;
            }

            if (type.length < 2) {
                alert("Type must be at least 2 characters.");
                return false;
            }

            if (isNaN(costValue) || costValue <= 0) {
                alert("Please enter a valid positive cost.");
                return false;
            }

            if (features.length < 10) {
                alert("Features must be at least 10 characters.");
                return false;
            }

            if (color.length < 3) {
                alert("Please enter a valid color.");
                return false;
            }

            if (warranty === "") {
                alert("Please select a warranty period.");
                return false;
            }

            return true;
        }
    </script>
</head>
<body class="bg-light">

<h4 class="text-success">${message}</h4>
<div class="container mt-5">
    <h2 class="mb-4">Register Your EarPhone</h2>
    <h4 class="text-danger">${message}</h4>

    <form action="ear" method="post">
        <div class="mb-3">
            <label class="form-label">Brand</label>
            <input type="text" name="brand" class="form-control" value="${dto.brand}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Type</label>
            <input type="text" name="type" class="form-control" value="${dto.type}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Cost</label>
            <input type="number" name="cost" class="form-control" step="0.01" value="${dto.cost}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Features</label>
            <textarea name="features" class="form-control" rows="3" required>${dto.features}</textarea>
        </div>
        <div class="mb-3">
            <label class="form-label">Color</label>
            <input type="text" name="color" class="form-control" value="${dto.color}" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Warranty</label>
            <select name="warranty" class="form-select" required>
                <option value="">Select</option>
                <option ${dto.warranty}>6 Months</option>
                <option ${dto.warranty }>1 Year</option>
                <option ${dto.warranty }>2 Years</option>
            </select>
        </div>
        <button type="submit" class="btn btn-success">Submit</button>
    </form>
</div>
</body>
</html>
