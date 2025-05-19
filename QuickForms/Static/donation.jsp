<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Donation Form</title>
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

<form action="donate" method="post">
    <h2>Donation Form</h2>

    <label for="name">Donor Name:</label>
    <input type="text" id="name" name="name" required>

    <label for="contact">Contact Number:</label>
    <input type="text" id="contact" name="contact" required>

    <label for="mail">E-mail:</label>
    <input type="email" id="mail" name="email" required>

    <label for="amount">Donation Amount:</label>
    <input type="number" id="amount" name="amount" required>

    <label for="description">Message:</label>
    <textarea id="description" name="description" rows="4" required></textarea>

    <button type="submit">Submit</button>
</form>

</body>
</html>
