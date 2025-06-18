<!doctype html>
<html lang="en" data-bs-theme="dark">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Application - Result</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
          background-color: #121212;
          color: #f8f9fa;
          display: flex;
          justify-content: center;
          align-items: center;
          min-height: 100vh;
          padding: 1rem;
        }

        .result-card {
          background-color: #1f1f1f;
          padding: 2rem;
          border-radius: 1rem;
          box-shadow: 0 0 20px rgba(0,0,0,0.5);
          width: 100%;
          max-width: 500px;
          text-align: center;
        }

        .btn-logout {
          background-color: #dc3545;
          color: white;
          padding: 0.5rem 1.2rem;
          font-weight: 500;
          border: none;
          border-radius: 8px;
          text-decoration: none;
          display: inline-block;
          margin-top: 1.5rem;
          transition: background-color 0.3s ease;
        }

        .btn-logout:hover {
          background-color: #c82333;
        }

        h2 {
          margin-bottom: 1.5rem;
        }

        .result-message {
          font-size: 1.2rem;
          color: #00dfc4;
          margin-top: 1rem;
        }
    </style>
</head>
<body>

<div class="result-card">
    <h2>You are logged in!</h2>
    <div class="result-message">${result}</div>
    <a href="login.jsp" class="btn-logout">Log Out</a>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
