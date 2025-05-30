<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>EventMate - Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <style>
        body {
            background: url('images/event-bg.jpg') no-repeat center center fixed;
            background-size: cover;
        }
        .hero-text {
            background-color: rgba(255, 255, 255, 0.85);
            padding: 40px;
            border-radius: 12px;
        }
        .card-custom {
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light shadow-sm">
    <div class="container-fluid">
        <a class="navbar-brand fw-bold text-primary" href="#">
            <img src="images/logo.ico" alt="EventMate" width="30" height="30" class="d-inline-block align-text-top">
            EventMate
        </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="registrationForm.jsp">Register for Event</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="EventServlet">View Registrations</a>
                </li>
            </ul>
            <form class="d-flex" action="#" method="get">
                <input class="form-control me-2" type="search" placeholder="Search Events" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>

<div class="container mt-5 text-center">
    <div class="hero-text mx-auto col-md-8">
        <h1 class="mb-4 text-primary">Welcome to EventMate</h1>
        <p class="lead">Plan, register, and explore events effortlessly with our user-friendly platform.</p>
        <a href="registrationForm.jsp" class="btn btn-primary me-2">Register Now</a>
        <a href="EventServlet" class="btn btn-outline-primary">View Participants</a>
    </div>
</div>

<div class="container mt-5">
    <h3 class="mb-4 text-center text-white">Upcoming Events</h3>
    <div class="row row-cols-1 row-cols-md-3 g-4">
        <!-- Sample Event Cards -->
        <div class="col">
            <div class="card card-custom">
                <img src="images/event1.jpeg" class="card-img-top" alt="Tech Talk">
                <div class="card-body">
                    <h5 class="card-title">Tech Talk 2025</h5>
                    <p class="card-text">Join top speakers discussing the future of AI and Web3.</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card card-custom">
                <img src="images/event2.jpeg" class="card-img-top" alt="Cultural Fest">
                <div class="card-body">
                    <h5 class="card-title">Cultural Fest</h5>
                    <p class="card-text">Celebrate diverse cultures with music, dance, and food stalls.</p>
                </div>
            </div>
        </div>
        <div class="col">
            <div class="card card-custom">
                <img src="images/event3.jpeg" class="card-img-top" alt="Startup Pitch">
                <div class="card-body">
                    <h5 class="card-title">Startup Pitch Day</h5>
                    <p class="card-text">Pitch your ideas to investors and innovators across industries.</p>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
