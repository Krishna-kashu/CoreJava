<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>View Graduation Details</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
    />
    <style>
        body {
          margin: 0;
          min-height: 100vh;
          color: white;
          font-family: 'Segoe UI', sans-serif;
          background: linear-gradient(135deg, #ffd6ec, #d4f5ff, #ffeaa7, #dcd0ff, #c7f9cc);
          background-size: 400% 400%;
          animation: gradientMove 15s ease infinite;
          overflow: hidden;
          position: relative;
        }

        @keyframes gradientMove {
          0% { background-position: 0% 50%; }
          50% { background-position: 100% 50%; }
          100% { background-position: 0% 50%; }
        }

        body::before {
          content: "";
          position: absolute;
          inset: 0;
          background-image: radial-gradient(white 1px, transparent 1px),
                            radial-gradient(white 1px, transparent 1px);
          background-size: 80px 80px;
          background-position: 0 0, 40px 40px;
          opacity: 0.3;
          pointer-events: none;
        }

        .navbar {
          background-color: rgba(0, 0, 0, 0.3) !important;
          backdrop-filter: blur(5px);
        }

        .navbar-brand, .nav-link {
          color: white !important;
          font-weight: bold;
        }

        .container {
          padding-top: 4rem;
          text-shadow: 0 0 10px rgba(255, 255, 255, 0.3);
        }

        h2 {
          font-weight: bold;
          color: #2c003e;
          text-shadow: 1px 1px 4px rgba(255, 255, 255, 0.7);
        }

        label {
          font-weight: bold;
          color: #3b004f;
          text-shadow: 1px 1px 3px rgba(255, 255, 255, 0.6);
        }

        .form-control {
          box-shadow: 0 0 10px rgba(255, 255, 255, 0.3);
        }

        .btn-glow {
          background: linear-gradient(45deg, #8adfff, #a179ff);
          color: white;
          border: none;
          padding: 0.75rem 1.5rem;
          font-size: 1.1rem;
          font-weight: bold;
          border-radius: 8px;
          box-shadow: 0 0 20px #cceaff, 0 0 30px #b9bfff;
          transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .btn-glow:hover {
          transform: scale(1.05);
          box-shadow: 0 0 30px #a8d8ff, 0 0 50px #a179ff;
        }

        .card {
          background-color: rgba(255, 255, 255, 0.9);
          border-radius: 15px;
          box-shadow: 0 0 30px rgba(0, 0, 0, 0.2);
        }

        .card-title {
          color: #3b004f;
          font-weight: bold;
        }

        .card p {
          color: #2c003e;
        }

        .text-danger {
          font-weight: bold;
          font-size: 1.1rem;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
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

<div class="container">
    <h2 class="mb-4">Search Graduation Record</h2>
    <form action="search" method="get" class="row g-3">
        <div class="col-md-6">
            <label for="gId" class="form-label">Student ID</label>
            <input type="number" name="gId" id="gId" class="form-control" required placeholder="Enter Student ID">
        </div>
        <div class="col-12 mt-3">
            <button type="submit" class="btn btn-glow">Search</button>
        </div>
    </form>

    <div class="mt-5">
        <span class="text-danger">${failure}</span>

        <div class="card mt-4" style="display: ${dto != null ? 'block' : 'none'};">
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

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
