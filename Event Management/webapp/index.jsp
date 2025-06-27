<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Graduation Portal - Home</title>
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
          padding-top: 8rem;
          text-align: center;
          text-shadow: 0 0 10px rgba(255, 255, 255, 0.3);
        }

        h1.display-4 {
          font-size: 3rem;
          font-weight: bold;
          color: #2c003e; /* Dark plum for visibility */
          text-shadow: 1px 1px 4px rgba(255, 255, 255, 0.7);
        }

        .lead {
          font-size: 1.3rem;
          color: #3b004f; /* Deep pastel purple */
          text-shadow: 1px 1px 3px rgba(255, 255, 255, 0.6);
        }

        .btn-glow {
          background: linear-gradient(45deg, #ff8ad4, #a179ff);
          color: white;
          border: none;
          padding: 0.75rem 1.5rem;
          font-size: 1.1rem;
          font-weight: bold;
          border-radius: 8px;
          box-shadow: 0 0 20px #fbcaff, 0 0 30px #ffbdf7;
          transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .btn-glow:hover {
          transform: scale(1.05);
          box-shadow: 0 0 30px #ffbdf7, 0 0 50px #ff8ad4;
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">Graduation Portal</a>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav me-auto">
                <li class="nav-item"><a class="nav-link active" href="event.jsp">Fill Details</a></li>
                <li class="nav-item"><a class="nav-link" href="Viewer.jsp">View Records</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container">
    <h1 class="display-4">Welcome to the Graduation Details Portal</h1>
    <p class="lead mt-3">Submit and view your graduation information with ease.</p>
    <a href="event.jsp" class="btn btn-glow mt-4">Fill Graduation Details</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
