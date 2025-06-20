<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
<head>
    <title>Graduation Details Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Graduation Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="Viewer.jsp">View Records</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="mb-4">Enter Graduation Details</h2>

    <div class="mb-3 text-success">${success}</div>
    <div class="mb-3 text-danger">${failure}</div>

    <form action="graduate" method="post" class="row g-3">
        <div class="col-md-6">
            <label for="studentName" class="form-label">Student Name</label>
            <input type="text" class="form-control" id="studentName" name="studentName" required>
        </div>
        <div class="col-md-6">
            <label for="degreeAwarded" class="form-label">Degree Awarded</label>
            <input type="text" class="form-control" id="degreeAwarded" name="degreeAwarded" required>
        </div>
        <div class="col-md-6">
            <label for="collegeName" class="form-label">College Name</label>
            <input type="text" class="form-control" id="collegeName" name="collegeName" required>
        </div>
        <div class="col-md-3">
            <label for="graduationYear" class="form-label">Graduation Year</label>
            <input type="number" class="form-control" id="graduationYear" name="graduationYear" min="2000" max="2030" required>
        </div>
        <div class="col-md-3">
            <label for="cgpa" class="form-label">CGPA</label>
            <input type="text" class="form-control" id="cgpa" name="cgpa" required>
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-success btn-lg">Submit Graduation Details</button>
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
