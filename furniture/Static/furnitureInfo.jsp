
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Furniture Info</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary"  >
    <div class="container-fluid">
        <a class="navbar-brand" href="#">My-work</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                </li>


                <!--                </li>-->
                <!--                <li class="nav-item">-->
                <!--                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>-->
                <!--                </li>-->
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>
        </div>
    </div>
</nav>
<center>
<h1>Welcome to the Furniture-info App</h1>

<br>

<form action="" method="post">
    <h2>Furniture Details</h2>
<br><br>
    Brand:
    <input type="text" name="Brand" required>
    <br><br>
    Material:
    <input type="text" name="Material" required>
    <br><br><br>
    Model Name:
    <input type="text" name="Model" required>
    <br><br>
    Size:
    <select name="size">
        <option value="king">King</option>
        <option value="queen">Queen</option>
        <option value="SingleSeater">SingleSeater</option>
        <option value="">Queen</option>
    </select>
    <br><br>
    Product Benefits:
    <textarea id="benifits" name="benifits" rows="4" required></textarea>
    <br><br>
    <button type="submit" style="background-color=blue">Save</button>
</form>
</center>
<br><br>

<form>
    <div class="mb-3">
        <label for="exampleInputEmail1" class="form-label">Email address</label>
        <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="exampleInputPassword1" class="form-label">Password</label>
        <input type="password" class="form-control" id="exampleInputPassword1">
    </div>
    <div class="mb-3 form-check">
        <input type="checkbox" class="form-check-input" id="exampleCheck1">
        <label class="form-check-label" for="exampleCheck1">Check me out</label>
    </div>
    <div class="mb-3">
        <label for="size" class="form-label">Select</label>
        <select id="size" class="form-select">
            <option>Single Seater</option>
            <option>Double seater</option>
            <option>King</option>
            <option>Queen</option>
        </select>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<a href="furnitureInfo.jsp">Back to Home</a></li>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>


