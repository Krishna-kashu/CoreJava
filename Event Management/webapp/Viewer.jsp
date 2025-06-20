<!DOCTYPE html>
<html lang="en" data-bs-theme="dark">
<head>
    <title>View Graduation Details</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Graduation Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link" href="index.jsp">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="event.jsp">Fill Details</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="mb-4">Search Graduation Record</h2>
    <form action="search" method="get" class="row g-3">
        <div class="col-md-6">
            <label for="gId" class="form-label">Student ID</label>
            <input type="number" name="gId" id="gId" class="form-control" required placeholder="Enter Student ID">
        </div>
        <div class="col-12 mt-3">
            <button type="submit" class="btn btn-primary btn-lg">Search</button>
        </div>
    </form>

    <div class="mt-5">
        <span class="text-danger">${failure}</span>

        <div class="card mt-4 bg-light text-dark" style="display: ${dto != null ? 'block' : 'none'};">
            <div class="card-body">
                <h5 class="card-title">Graduation Details</h5>
                <p><strong>Student Name:</strong> ${dto.studentName}</p>
                <p><strong>Degree Awarded:</strong> ${dto.degreeAwarded}</p>
                <p><strong>College Name:</strong> ${dto.collegeName}</p>
                <p><strong>Graduation Year:</strong> ${dto.graduationYear}</p>
                <p><strong>CGPA:</strong> ${dto.cgpa}</p>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
