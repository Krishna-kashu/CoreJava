<!DOCTYPE html>
<html>
<head>
    <title>Weather Form</title>
</head>
<body>
<h2>Enter Weather Information</h2>
<form method="post" action="weather">
    Place Name: <label>
    <input type="text" name="placeName" required>
</label><br>
    Weather: <input type="text" name="weather" required><br>
    Min Temp: <input type="number" name="minTemp" step="0.1"><br>
    Max Temp: <input type="number" name="maxTemp" step="0.1"><br>
    Cloudy: <input type="checkbox" name="cloudy"><br>
    Raining: <input type="checkbox" name="raining"><br>
    Rain in MM: <input type="number" name="rainMM" step="0.1"><br>
    Humidity (%): <input type="number" name="humidity" step="0.1"><br>
    Wind Speed (km/h): <input type="number" name="windSpeed" step="0.1"><br>
    Sun Rise Time: <input type="time" name="sunriseTime"><br>
    Sun Set Time: <input type="time" name="sunsetTime"><br>
    Moon Rise Time: <input type="time" name="moonRiseTime"><br>
    Moon Set Time: <input type="time" name="moonSetTime"><br>
    Rain Start Time: <input type="time" name="rainStartTime"><br>
    Rain End Time: <input type="time" name="rainEndTime"><br>
    Precipitation: <input type="number" name="precipitation" step="0.1"><br><br>
    <input type="submit" name="submit" value="Save Weather Info">
</form>

</body>
</html>
