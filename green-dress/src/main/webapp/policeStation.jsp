<!DOCTYPE html>
<html>
<head>
    <title>Police Station Form</title>
    <style>
        body { background-color: #fffaf0; font-family: sans-serif; padding: 20px; }
        label, input { display: block; margin: 8px 0; }
        input[type="submit"] { background-color: #ffcccb; padding: 8px 16px; border: none; }
    </style>
</head>
<body>
<h2>Police Station Info</h2>
<form action="submitPolice" method="post">
    <label>Station Name:</label>
    <input type="text" name="stationName" />

    <label>Location:</label>
    <input type="text" name="location" />

    <label>City:</label>
    <input type="text" name="city" />

    <label>State:</label>
    <input type="text" name="state" />

    <label>Pin Code:</label>
    <input type="text" name="pincode" />

    <label>Phone:</label>
    <input type="text" name="phone" />

    <label>Email:</label>
    <input type="email" name="email" />

    <label>Station Code:</label>
    <input type="text" name="code" />

    <label>Officer Name:</label>
    <input type="text" name="officer" />

    <label>Jurisdiction Area:</label>
    <input type="text" name="jurisdiction" />

    <input type="submit" value="Submit" />
</form>
</body>
</html>
