<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Home - Furniture Info App</title>
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
        .nav-link {
          color: #fff !important;
        }

        .hero-section {
          padding: 6rem 1rem;
          background-color: var(--pig-pink);
          border-radius: 1rem;
          margin-top: 2rem;
          text-align: center;
          box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        .hero-section h1 {
          color: var(--pink-text);
          font-weight: bold;
        }

        .hero-section a {
          margin-top: 2rem;
          display: inline-block;
          padding: 0.75rem 1.5rem;
          background-color: var(--pink-text);
          color: #fff;
          text-decoration: none;
          border-radius: 8px;
          transition: background-color 0.3s ease;
        }

        .hero-section a:hover {
          background-color: #922d58;
        }

        .btn-outline-success {
          color: var(--pink-text);
          border-color: var(--pink-text);
        }

        .btn-outline-success:hover {
          background-color: var(--pink-text);
          color: white;
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
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<!-- Hero Section -->
<div class="container">
    <div class="hero-section">
        <h1>Welcome to the Furniture-info App</h1>
        <p class="text-muted mt-3">Click below to manage your furniture details.</p>
        <a href="furnitureInfo.jsp">Go to Furniture Info</a>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
