<!DOCTYPE html>
<html>
<head>
    <title>Name Form</title>
    <style>
        body { background-color: #fffaf0; font-family: sans-serif; padding: 30px; }
        label, input { display: block; margin: 8px 0; }
        input[type="submit"] { background-color: #98fb98; padding: 8px 16px; border: none; }
    </style>
</head>
<body>
<h2>Enter Your Details</h2>
<form action="submit" method="post">
    <label>First Name:</label>
    <input type="text" name="firstname" required />

    <label>Middle Name:</label>
    <input type="text" name="middlename" />

    <label>Last Name:</label>
    <input type="text" name="lastname" required />

    <label>Display Name:</label>
    <input type="text" name="displayname" />

    <input type="submit" value="Submit" />
</form>
</body>
</html>
