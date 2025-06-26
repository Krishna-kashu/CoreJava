<!DOCTYPE html>
<html lang="en">
<head>
    <title>Graduation Details Form</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet">
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

        h2 {
          font-size: 2.5rem;
          font-weight: bold;
          color: #2c003e; /* Dark plum for visibility */
          text-shadow: 1px 1px 4px rgba(255, 255, 255, 0.7);
        }

        .form-label {
          color: #2c003e;
          font-weight: bold;
        }

        .container {
          text-shadow: 0 0 10px rgba(255, 255, 255, 0.3);
        }

        .text-success, .text-danger {
          font-size: 1.1rem;
          font-weight: bold;
          text-shadow: 1px 1px 3px rgba(255,255,255,0.6);
        }

        .btn-success {
          background: linear-gradient(45deg, #9dffba, #6ae2a9);
          border: none;
          font-weight: bold;
          box-shadow: 0 0 15px #baffc9;
          transition: transform 0.2s ease;
        }

        .btn-success:hover {
          transform: scale(1.05);
          box-shadow: 0 0 25px #7fffd4;
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
