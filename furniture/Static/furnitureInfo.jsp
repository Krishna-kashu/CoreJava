<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Furniture Info</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">

    <style>
        :root {
          --pig-pink: #fcd3de;
          --pig-pink-dark: #f8aabe;
          --pink-text: #aa336a;
        }

        body {
          background-color: #fff0f5;
        }

        .navbar {
          background-color: var(--pig-pink-dark) !important;
        }

        .navbar-brand,
        .nav-link,
        .form-text,
        label {
          color: #ffffff !important;
        }

        .form-section {
          background-color: var(--pig-pink);
          padding: 2rem;
          border-radius: 1rem;
          box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        h1, h2 {
          color: var(--pink-text);
        }

        .btn-primary {
          background-color: var(--pink-text);
          border-color: var(--pink-text);
        }

        .btn-primary:hover {
          background-color: #922d58;
          border-color: #922d58;
        }

        .btn-outline-primary {
          color: var(--pink-text);
          border-color: var(--pink-text);
        }

        .btn-outline-primary:hover {
          background-color: var(--pink-text);
          color: white;
        }

        .btn-success {
          background-color: #ff69b4;
          border-color: #ff69b4;
        }

        .btn-success:hover {
          background-color: #e754a6;
          border-color: #e754a6;
        }
    </style>
</head>
<body>

<!-- Navbar -->
<nav class="navbar navbar-expand-lg navbar-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="#">My-work</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-light" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<!-- Main Content -->
<div class="container mt-5">
    <div class="text-center mb-4">
        <h1 class="display-5">Welcome to the Furniture-info App</h1>
        <p class="text-muted">Please enter your furniture details below.</p>
    </div>

    <!-- Furniture Details Form -->
    <form method="post" class="form-section">
        <h2 class="mb-4">Furniture Details</h2>

        <div class="mb-3">
            <label for="brand" class="form-label">Brand</label>
            <input type="text" class="form-control" id="brand" name="Brand" required>
        </div>

        <div class="mb-3">
            <label for="material" class="form-label">Material</label>
            <input type="text" class="form-control" id="material" name="Material" required>
        </div>

        <div class="mb-3">
            <label for="model" class="form-label">Model Name</label>
            <input type="text" class="form-control" id="model" name="Model" required>
        </div>

        <div class="mb-3">
            <label for="size" class="form-label">Size</label>
            <select class="form-select" id="size" name="size">
                <option value="king">King</option>
                <option value="queen">Queen</option>
                <option value="single">Single Seater</option>
                <option value="double">Double Seater</option>
            </select>
        </div>

        <div class="mb-3">
            <label for="benefits" class="form-label">Product Benefits</label>
            <textarea class="form-control" id="benefits" name="benefits" rows="4" required></textarea>
        </div>

        <button type="submit" class="btn btn-primary">Save</button>
    </form>

    <!-- Divider -->
    <hr class="my-5">

    <!-- User Info Form -->
    <form class="form-section">
        <h2 class="mb-4">User Info</h2>

        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <input type="email" class="form-control" id="email" name="mail" aria-describedby="emailHelp">
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>

        <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password">
        </div>

        <div class="mb-3 form-check">
            <input type="checkbox" class="form-check-input" id="check">
            <label class="form-check-label" for="check">Check me out</label>
        </div>

        <div class="mb-3">
            <label for="seater" class="form-label">Preferred Seater</label>
            <select id="seater" class="form-select">
                <option>Single Seater</option>
                <option>Double Seater</option>
                <option>King</option>
                <option>Queen</option>
            </select>
        </div>

        <button type="submit" class="btn btn-success">Submit</button>
    </form>

    <!-- Back Link -->
    <div class="mt-4 text-center">
        <a href="furnitureInfo.jsp" class="btn btn-outline-primary">Back to Home</a>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
