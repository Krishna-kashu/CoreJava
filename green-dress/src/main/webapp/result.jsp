<!--<%@ page isELIgnored="false" %>-->
<!DOCTYPE html>
<html>
<head>
    <title>Submission Result</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f0fff0;
            color: #333;
            padding: 20px;
            text-align: center;
        }
        h2 {
            color: #2e8b57;
            margin-top: 30px;
        }
        .section {
            background-color: #ffffff;
            border: 1px solid #d0e0d0;
            border-radius: 10px;
            padding: 15px;
            margin: 20px auto;
            max-width: 600px;
            box-shadow: 0 0 8px rgba(0, 100, 0, 0.1);
            text-align: left;
        }
        .label {
            font-weight: bold;
            color: #006400;
        }
        .item {
            margin: 5px 0;
        }
    </style>
</head>
<body>

<h2>Submitted Form Details</h2>

<%
if (request.getAttribute("fname") != null) {
%>
<div class="section">
    <h2>Name Form</h2>
    <p><span>First Name:</span> ${fname}</p>
    <p><span>Last Name:</span> ${lname}</p>
    <p><span>Middle Name:</span> ${mname}</p>
    <p><span>Display Name:</span> ${dname}</p>
</div>
<%
} else if (request.getAttribute("hospitalName") != null) {
%>
<div class="section">
    <h2>Hospital Form</h2>
    <p><span>Hospital Name:</span> ${hospitalName}</p>
    <p><span>Address:</span> ${address}</p>
    <p><span>City:</span> ${city}</p>
    <p><span>State:</span> ${state}</p>
    <p><span>Pincode:</span> ${pincode}</p>
    <p><span>Phone:</span> ${phone}</p>
</div>
<%
} else if (request.getAttribute("vehicleNumber") != null) {
%>
<div class="section">
    <h2>RTO Form</h2>
    <p><span>Vehicle Number:</span> ${vehicleNumber}</p>
    <p><span>Owner Name:</span> ${ownerName}</p>
    <p><span>Vehicle Type:</span> ${vehicleType}</p>
    <p><span>Registration Date:</span> ${registrationDate}</p>
    <p><span>State:</span> ${state}</p>
    <p><span>Contact:</span> ${contact}</p>
</div>
<%
} else if (request.getAttribute("stationName") != null) {
%>
<div class="section">
    <h2>Police Station Form</h2>
    <p><span>Station Name:</span> ${stationName}</p>
    <p><span>Location:</span> ${location}</p>
    <p><span>City:</span> ${city}</p>
    <p><span>State:</span> ${state}</p>
    <p><span>Pin Code:</span> ${pincode}</p>
    <p><span>Phone:</span> ${phone}</p>
    <p><span>Email:</span> ${email}</p>
    <p><span>Station Code:</span> ${code}</p>
    <p><span>Officer Name:</span> ${officer}</p>
    <p><span>Jurisdiction Area:</span> ${jurisdiction}</p>
</div>
<%
} else if (request.getAttribute("fruitDTO") != null) {
%>
<div class="section">
    <h2>Fruit Form</h2>
<!--    <p><span>Fruit Name:</span> ${fruitName}</p>-->
<!--    <p><span>Color:</span> ${color}</p>-->
<!--    <p><span>Taste:</span> ${taste}</p>-->
<!--    <p><span>Season:</span> ${season}</p>-->
<!--    <p><span>Price:</span> ${price}</p>-->
<!--    <p><span>Origin Country:</span> ${origin}</p>-->
<!--    <p><span>Vitamin Content:</span> ${vitamin}</p>-->
<!--    <p><span>Seed Type:</span> ${seed}</p>-->
<!--    <p><span>Shelf Life:</span> ${life}</p>-->
<!--    <p><span>Favorite Dish:</span> ${dish}</p>-->
    <p><span>Fruit Details:</span> ${fruitDTO}</p>
</div>
<%
} else {
%>
<p>No form data submitted.</p>
<%
}
%>

</body>
</html>
