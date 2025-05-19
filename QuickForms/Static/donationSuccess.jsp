<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Thank You</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: #f2f2f2;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .thank-you-box {
            background: white;
            padding: 30px;
            border-radius: 10px;
            text-align: center;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .thank-you-box h2 {
            color: #28a745;
        }
        .thank-you-box p {
            margin-top: 10px;
        }
        .thank-you-box a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            color: white;
            background-color: #007BFF;
            padding: 10px 20px;
            border-radius: 5px;
        }
        .thank-you-box a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

<div class="thank-you-box">
    <h2 class="success">${message}</h2>

    <div class="details">
        <p><strong>Donor Name:</strong> ${donorName}</p>
        <p><strong>Donation Amount:</strong> ${donorNumber}</p>
        <p><strong>Email:</strong> ${donorEmail}</p>
        <p><strong>Donation Message:</strong> ${donationMessage}</p>
        <p><strong>Message:</strong> ${message}</p>
    </div>
    <a href="index.jsp">Back to Home</a>
</div>

</body>
</html>
