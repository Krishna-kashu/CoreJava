<!doctype html>
<html lang="en" data-bs-theme="dark">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login Application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background-color: #121212;
            color: #f8f9fa;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
            padding: 2rem;
        }

        .card {
            background-color: #1f1f1f;
            border: none;
            border-radius: 1rem;
            padding: 2rem;
            width: 100%;
            max-width: 500px;
            box-shadow: 0 0 20px rgba(0,0,0,0.5);
        }

        .btn-custom {
            background-color: #0d6efd;
            color: white;
        }

        .btn-custom:hover {
            background-color: #0b5ed7;
        }

        a {
            text-decoration: none;
        }
    </style>
</head>
<body>

<div class="card text-center">
    <h1 class="mb-4"> Login Application</h1>

    <div class="d-grid gap-3">
        <a href="login.jsp" class="btn btn-custom btn-lg">Go to Login</a>

        <form action="login">
            <input type="submit" value="Find All Users" class="btn btn-outline-light btn-lg">
        </form>
    </div>

    <div class="mt-4">
        <h5>Data Output:</h5>
        <p>${loginDtos}</p>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
