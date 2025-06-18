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
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            padding: 1rem;
        }

        .login-card {
            background-color: #1f1f1f;
            padding: 2rem;
            border-radius: 1rem;
            box-shadow: 0 0 20px rgba(0,0,0,0.4);
            width: 100%;
            max-width: 450px;
        }

        .form-control {
            background-color: #2c2c2c;
            border: 1px solid #444;
            color: #fff;
        }

        .form-control::placeholder {
            color: #bbb;
        }

        .btn-custom {
            width: 48%;
        }
    </style>
</head>
<body>

<div class="login-card">
    <h2 class="text-center mb-4">Login Application</h2>

    <form action="login" method="post">
        <div class="mb-3">
            <input type="text" class="form-control" name="userName" placeholder="Username" required>
        </div>
        <div class="mb-3">
            <input type="email" class="form-control" name="userEmail" placeholder="Email" required>
        </div>
        <div class="mb-4">
            <input type="password" class="form-control" name="userPassword" placeholder="Password" required>
        </div>
        <div class="d-flex justify-content-between">
            <input type="submit" value="Login" class="btn btn-primary btn-custom">
            <input type="reset" value="Clear" class="btn btn-warning btn-custom">
        </div>
    </form>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
