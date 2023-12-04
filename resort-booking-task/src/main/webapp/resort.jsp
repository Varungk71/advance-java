<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="resort.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
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
        <a href="getBooking" id="details"class="line">View Details</a>
    </header>
<p id="space"></p>
       <div class="card-group">
        <div class="card">
          <img src="images/resort1.jpg" class="card-img-top" alt="resort1">
          <div class="card-body">
            <h5 class="card-title">Starling River Resort</h5>
            <p class="card-text">Survey no 16/1B ,Sakshalli village ,Harnoda Gram ,Dandeli 581325 India</p>
            <p class="card-text"><small class="text-body-secondary">Last updated 30 mins ago</small></p>
          </div>
        </div>
        <div class="card">
          <img src="images/resort2.jpg" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">Mayur Aaditya Resort</h5>
            <p class="card-text">P B Road Dharwad ,Hubli-Dharwad 580009 India</p>
            <p class="card-text"><small class="text-body-secondary">Last updated 3 months ago</small></p>
          </div>
        </div>
        <div class="card">
          <img src="images/resort7.webp" class="card-img-top" alt="...">
          <div class="card-body">
            <h5 class="card-title">Trivik Hotels & Resorts</h5>
            <p class="card-text">Sy No 216 & 344 Channagondanahalli ,Elunoorkhan Rd , Vasthur Hobli ,Mullaiyanagiri ,Karnataka 577101 </p>
            <p class="card-text"><small class="text-body-secondary">Last updated 20 mins ago</small></p>
          </div>
        </div>
      </div>
<br>

      <div>
        <div class="card-group">
            <div class="card">
              <img src="images/resort8.jpg" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Whistling Woodzs Resort</h5>
                <p class="card-text"> Village Badgund, Ganeshgudi Uttar Karnataka Dist, Dandeli, Karnataka 581365</p>
                <p class="card-text"><small class="text-body-secondary">Last updated 30 days ago</small></p>
              </div>
            </div>
            <div class="card">
              <img src="images/resort5.webp" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Siri Nature Roost</h5>
                <p class="card-text">SH 57 ,Allampura,Chikkamagaluru ,Karnataka 577101</p>
                <p class="card-text"><small class="text-body-secondary">Last updated 20 days ago</small></p>
              </div>
            </div>
            <div class="card">
              <img src="images/resort6.webp" class="card-img-top" alt="...">
              <div class="card-body">
                <h5 class="card-title">Nexstay Coffee Grove Resort</h5>
                <p class="card-text">Anishka plantation ,Kelagurr, Aldur Hobli ,Chikkamagaluru District ,Yelagudige ,Karnataka 577101</p>
                <p class="card-text"><small class="text-body-secondary">Last updated 30 days ago</small></p>
              </div>
            </div>
          </div>
      </div>


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