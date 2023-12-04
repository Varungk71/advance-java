<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="resort.css">
    <title>Document</title>
    <style>
            table,th,td{
                        border: 2px solid black;
                        border-collapse: collapse;
                        margin-left: auto;
                        margin-right: auto;
                        margin-top:4%;
                    }
                    th{
                        background-color: rgb(122, 237, 237);
                    }
                    td{
                        background-color: rgb(251, 219, 139);
                    }
        </style>
</head>
<body>

    <div id="heading">
        <img src="images/logo.png" alt="logo" id="logo">
        <span id="allign">Resort Details</span>
    </div>
    <header>
        <a href="resort.jsp" id="home" class="line">Home</a>
        <a href="booking.jsp" id="book"class="line">Book</a>
        <a href="feedback.jsp" id="feedback"class="line">Feedback</a>
    </header>
    <table>
        <tr>
            <th>Sl.No</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Contact Number</th>
            <th>Mode Of Payment</th>
            <th>Check In Date</th>
            <th>Check Out Date</th>
            <th>Adults</th>
            <th>Children</th>
            <th>Rooms</th>
        </tr>
    < c:forEach items="${ resort }" var="details" >
    <tr>
        <td>${ details.getId() }</td>
        <td>${ details.getFirstName() }</td>
        <td>${ details.getLastName() }</td>
        <td>${ details.getEmail() }</td>
        <td>${ details.getContactNumber() }</td>
        <td>${ details.getModeOfPayment() }</td>
        <td>${ details.getCheckInDate() }</td>
        <td>${ details.getCheckOutDate() }</td>
        <td>${ details.getAdults() }</td>
        <td>${ details.getChildren() }</td>
        <td>${ details.getRoom() }</td>

    </tr>
    </c:forEach >

    </table>

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