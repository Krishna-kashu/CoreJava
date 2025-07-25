
<!DOCTYPE html>
<html>
<head>
    <title>RTO Form</title>
    <style>
        body { font-family: Arial; background: #f0f8ff; padding: 20px; }
        label, input { display: block; margin: 8px 0; }
        input[type="submit"] { background: #add8e6; padding: 8px 16px; border: none; }
    </style>
</head>
<body>
<h2>RTO Registration</h2>
<form action="submitRTO" method="post">
    <label>Vehicle Number:</label>
    <input type="text" name="vehicleNumber" />

    <label>Owner Name:</label>
    <input type="text" name="ownerName" />

    <label>Vehicle Type:</label>
    <input type="text" name="vehicleType" />

    <label>Registration Date:</label>
    <input type="date" name="registrationDate" />

    <label>State:</label>
    <input type="text" name="state" />

    <label>Contact:</label>
    <input type="text" name="contact" />

    <input type="submit" value="Submit" />
</form>
</body>
</html>
