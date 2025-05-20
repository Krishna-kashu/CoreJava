<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="card shadow">
        <div class="card-body text-center">
            <h2 class="text-success mb-4">${message}</h2>

            <table class="table table-bordered table-striped table-hover">
                <thead class="table-dark">
                <tr>
                    <th>Field</th>
                    <th>Details</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Donor Name</td>
                    <td>${donation.name}</td>
                </tr>
                <tr>
                    <td>Contact Number</td>
                    <td>${donation.contact}</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>${donation.email}</td>
                </tr>
                <tr>
                    <td>Donation Amount</td>
                    <td>${donation.amount}</td>
                </tr>
                <tr>
                    <td>Message</td>
                    <td>${donation.description}</td>
                </tr>
                </tbody>
            </table>

            <a href="index.jsp" class="btn btn-primary mt-3">Back to Home</a>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
