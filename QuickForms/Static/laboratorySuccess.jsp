<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Lab Observation Submitted</title>
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
                    <td>Name</td>
                    <td>${labData.name}</td>
                </tr>
                <tr>
                    <td>Roll Number</td>
                    <td>${labData.rollNumber}</td>
                </tr>
                <tr>
                    <td>Experiment Number</td>
                    <td>${labData.expNumber}</td>
                </tr>
                <tr>
                    <td>Observation</td>
                    <td>${labData.observation}</td>
                </tr>
                </tbody>
            </table>

            <a href="index.jsp" class="btn btn-primary mt-3">Back to Form</a>
        </div>
    </div>
</div>

</body>
</html>
