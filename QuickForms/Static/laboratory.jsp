<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Laboratory Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            padding: 20px;
        }
        form {
            background: white;
            padding: 20px;
            border-radius: 10px;
            max-width: 500px;
            margin: auto;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
        }
        label {
            display: block;
            margin-top: 15px;
        }
        input, textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            margin-top: 20px;
            width: 100%;
            padding: 10px;
            background: #007BFF;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        button:hover {
            background: #0056b3;
        }
    </style>
</head>
<body>

<form action="lab" method="post">
    <h2>Laboratory Form</h2>

    <label for="name">Student Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="RollNumber">Roll Number:</label>
    <input type="text" id="rollNumber" name="RollNumber" required>

    <label for="experiment">Experiment Number:</label>
    <input type="number" id="number" name="RNumber" required>

    <label for="Observation">Observation:</label>
    <textarea id="observation" name="observation" rows="4" required></textarea>

    <button type="submit">Submit</button>
</form>

</body>
</html>
