<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donation Form</title>
</head>
<body>
    <h1>Donation Form</h1>
    <form action="donate" method="POST">
        Donor Name:
        <input type="text" name="donorName" required><br><br>

        Donation Amount:
        <input type="number" name="donationAmount" required><br><br>

        Email:
        <input type="email" name="donorEmail" required><br><br>

        Message
        <textarea id="donationMessage" name="donationMessage"></textarea><br><br>

        <input type="submit" value="Submit Donation">
    </form>
    <br>
    <a href="index.html">Back to Home</a>
</body>
</html>
