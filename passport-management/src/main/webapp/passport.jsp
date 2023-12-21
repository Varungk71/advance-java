<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html lang="en">
 <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="passport.css">
    <script src="passport.js"  type="text/javascript"></script>
</head>
<a href="login.jsp" id="homepage">Home</a>
<body style="margin-left: 500px;">

<header>
    <h2>User Registration</h2>

</header>

<form  action="passport" method="post">

    Register to apply at <span class="required">*</span>
    <input type="radio" name="office" id="office1" value="cpv delhi"  >CPV Delhi
    <br>
    <input type="radio" name="office" id="office2"  >Passport Office
    <br>
    <br>
    Passport Office <span class="required">*</span>
    <select name="passportOffice" id="place" >
        <option>--select--</option>
        <option value="ahmedabad">Ahmedabad</option>
        <option value="banglore">Banglore</option>
        <option value="bhopal">Bhopal</option>
        <option value="chennai">Chennai</option>
        <option value="delhi">Delhi</option>
        <option value="hyderabad">Hyderabad</option>
        <option value="jammu">Jammu</option>
        <option value="kolkata">Kolkata</option>
        <option value="pune">Pune</option>
        <option value="goa">Goa</option>
    </select>
    <br>
    <br>
    Given Name <small>(Max 45 Characters)</small><span class="required">*</span>
    <input type="text" name="givenName"   id="gname"  required onblur="return validateName()">
    <span id="display" class="required"></span>
    <br>
    <br>
    Surname <small>(Max 45 Characters)</small><span class="required">*</span>
    <input type="text" name="surName"   id="surname" >
    <span id="display1" class="required"></span>
    <br>
    <br>
    Date of Birth(DD/MM/YYYY)<span class="required">*</span>
    <input type="date" name="dateOfBirth"   id="dob">
    <br>
    <br>
    E-mail Id <small>max 35 characters</small><span class="required">*</span>
    <input type="email" name="emailId"   id="email">
    <span id="display2" class="required"></span>
    <br>
    <br>
    Do you Want your Login Id
    <input type="radio" name="loginid" id="email2" value="yes" onclick="handleRadio('yes')">Yes
    <input type="radio" name="loginid" id="email3" value="no" onclick="handleRadio('no')">No
    <br>
    to be same as E-mail id

    <br>
    <br>
    Login id<span class="required ">*</span>
    <input type="text" name="loginId" id="loginid">
    <br>
    <br>
    Password <span class="required">*</span>
    <input type="password" name="password" id="password1"  >
    <span id="display3" class="required"></span>
    <br>
    <br>
    Confirm Password <span class="required">*</span>
    <input type="password" name="confirmPassword" id="password2"  >
    <span id="display4" class="required"></span>
    <br>
    <br>
    Hint Question <span class="required ">*</span>
    <select name="hintQuestion" id="question" >
        <option >--select--</option>
        <option value="birth city">Birth City</option>
        <option value="favourite color">Favourite Colour</option>
        <option value="favourite cricketer">Favourite Cricketer</option>
        <option value="favourite food">Favourite Food</option>
        <option value="first school"> First School</option>
    </select>
    <br>
    <br>
    Hint Answer <span class="required ">*</span>
    <input type="text" name="hintAnswer" id="answer"  >
    <br>
    <br>
    <!-- Enter Characters Display<span class=" ">*</span>
    <input type="text" name="capta" id="character">
    <br>
    <br> -->
    <br>
  <button type="submit" id="submit">Register</button>
   <button type="reset" id="reset">clear</button>

 <!--     <input type="submit"  id="submit" value="register"> -->
  <!--    <input type="reset"  id="reset" value="clear">    -->
</form>
</body>
<h2> ${ name }</h2>
<footer>
    <p> © Content Owned by Ministry of External Affairs, Government of India</p>

</footer>
</html>