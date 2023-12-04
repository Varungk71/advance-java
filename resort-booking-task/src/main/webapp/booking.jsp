<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
   <link rel="stylesheet" href="resort.css">
   <script src="booking.js" type="text/javascript"></script>

</head>
<body style="margin: 0%;">
    <div id="heading">
        <img src="images/logo.png" alt="logo" id="logo">
        <span id="allign">Book your stay</span>
    </div>
    <header>
        <a href="resort.jsp" id="home" class="line">Home</a>
        <a href="feedback.jsp" id="feedback"class="line">Feedback</a>
        <a href="getBooking" id="details"class="line">View Details</a>
    </header>
    <form action="resort" method="post" id="BookingForm">
        <label for="fName">First Name :</label>
        <input type="text" name="firstName" id="first" onblur="validateFirstName()">
        <span class="color1" id="show1"></span>
        <span class="color1" id="show2"></span>
        <br>
        <br>
        <label for="lName">Last Name :</label>
        <input type="text" name="lastName" id="last" onblur="validateLastName()">
        <span class="color1" id="show3"></span>
        <span class="color1" id="show4"></span>
        <br>
        <br>
        <label for="mail">Email :</label>
        <input type="email" name="Email" id="mail1" onblur="validateEmail()">
        <span class="color1" id="show5"></span>
        <span class="color1" id="show6"></span>
        <br>
        <br>
        <label for="number">Contact Number :</label>
        <input type="number" name="phoneNumber" id="number1" onblur="validateNumber()">
        <span class="color1" id="show7"></span>
        <span class="color1" id="show8"></span>
        <br>
        <br>
        <label for="payment">Mode Of Payment</label>
        <select name="paymentMode" id="payment" onblur="validatePayment()">
            <option value="">--select--</option>
            <option value="cash">Cash</option>
            <option value="credit card">Credit Card</option>
            <option value="debit card">Debit Card</option>
            <option value="net banking">Net Banking</option>
            <option value="upi">Upi</option>
        </select>
        <span class="color1" id="show9"></span>
        <span class="color1" id="show10"></span>
        <br>
        <br>
        <label for="checkIn">Check In Date :</label>
        <input type="date" name="checkIn" id="checkIn" onblur="validateCheckIn()">
        <span class="color1" id="show11"></span>
        <span class="color1" id="show12"></span>
        <br>
        <br>
        <label for="checkOut">Check Out Date:</label>
        <input type="date" name="checkOut" id="checkOut" onblur="validateCheckOut()">
        <span class="color1" id="show13"></span>
        <span class="color1" id="show14"></span>
        <br>
        <br>
        <label for="adult">Adults :</label>
        <input type="number" name="member" id="adult"onblur="validateAdult()">
        <span class="color1" id="show15"></span>
        <span class="color1" id="show16"></span>
        <br>
        <br>
        <label for="child">Children :</label>
        <input type="number" name="children" id="child">
        <br>
        <br>
        <label for="room">Rooms :</label>
        <input type="number" name="room" id="room" onblur="validateRoom()">
        <span class="color1" id="show17"></span>
        <span class="color1" id="show18"></span>
        <br>
        <br>
        <br>
        <button type="submit" id="submitId">Submit</button>
        <button type="reset"id="resetId">Reset</button>

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