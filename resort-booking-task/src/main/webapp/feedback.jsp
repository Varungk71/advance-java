<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="images/logo.png" type="png">
    <link rel="stylesheet" href="feedback.css">
    <link rel="stylesheet" href="resort.css">
    <script src="feedback.js" type="text/javascript"></script>
    <title>Xworkz</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body >
    <div id="heading">
        <img src="images/logo.png" alt="logo" id="logo">
        <span id="allign">Feedback Form</span>
        <input type="search" name="search" id="searchId" placeholder=" search here">
    </div>
    <header>
        <a href="resort.jsp" id="home" class="line">Home</a>
        <a href="booking.jsp" id="book" class="line">Book</a>
        <a href="getBooking" id="details" class="line" style="margin-left: 64%;">View Details</a>
    </header>

    <form action="feedback" method="post" id="feedbackForm">
        <label for="name">Name :</label>
        <input type="text" name="name" id="name" onblur="validateName()" placeholder="enter name">
        <span id="display1" class="colour"></span>
        <span id="display2" class="colour"></span>
        <br>

        <label for="mail">Email :</label>
        <input type="email" name="mail" id="mail" onblur="validateMail()" placeholder="enter email">
        <br>
        <span id="display3" class="colour"></span>
        <span id="display4" class="colour"></span>
        <br>

        <label for="contactNumber">Contact Number:</label>
        <input type="number" name="contactNumber" id="number" onblur="validateNumber()"
            placeholder="enter mobile number">
        <br>
        <span id="display5" class="colour"></span>
        <span id="display6" class="colour"></span>
        <br>
        <label for="comments">Comments:</label>
        <br>
        <textarea name="comments" id="comment" cols="45" rows="5" onblur="validateComment()"
            placeholder="leave a comment here"></textarea>
        <br>
        <span id="display7" class="colour"></span>
        <span id="display8" class="colour"></span>
        <br>
        <br><br>
        <button type="submit" class="move">Submit</button>
        <button type="reset">Clear</button>
    </form>
    <footer id="footer">
        <p id="datetime"> </p>
        <a href="https://www.facebook.com/varun.gk.397?mibextid=ZbWKwL"><img src="images/facebook.png" alt="facebook"
                class="image" id="facebook"></a>
        <a href="https://instagram.com/varun_g_k_?igshid=OGQ5ZDc2ODk2ZA=="><img src="images/instagram.jpg"
                alt="instagram" class="image"></a>
        <a href="https://whatsapp.com/dl/"><img src="images/whatsapp.png" alt="whatsapp" class="image"></a>
        <a
            href="https://www.linkedin.com/in/varun-g-k-6374411a2?utm_source=share&utm_campaign=share_via&utm_content=profile&utm_medium=android_app"><img
                src="images/linkedin.png" alt="linkedIn" class="image"></a>
    </footer>
</body>
<script>
    // Get current date and time
    var now = new Date();
    var datetime = now.toLocaleString();

    // Insert date and time into HTML
    document.getElementById("datetime").innerHTML = "©copyright " + datetime;
</script>

</html>