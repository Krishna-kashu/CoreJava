<!DOCTYPE html>
<html>
<head>
    <title>Hospital Form</title>
    <style>
        body { background: #f8f8ff; font-family: sans-serif; padding: 20px; }
        label, input { display: block; margin: 10px 0; }
        input[type="submit"] { background: #87cefa; border: none; padding: 8px 16px; }
    </style>
</head>
<body>
<h2>Hospital Information</h2>
<form action="submitHospital" method="post">
    <label>Hospital Name:</label>
    <input type="text" name="hospitalName" />

    <label>Address:</label>
    <input type="text" name="address" />

    <label>City:</label>
    <input type="text" name="city" />

    <label>State:</label>
    <input type="text" name="state" />

    <label>Pin Code:</label>
    <input type="text" name="pincode" />

    <label>Phone Number:</label>
    <input type="text" name="phone" />

    <input type="submit" value="Submit" />
</form>
</body>
</html>
