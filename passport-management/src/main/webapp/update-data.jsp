<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="passport.css">
</head>
<a href="login.jsp" id="homepage">Home</a>

<body style="margin-left: 500px; padding:20px;">

<h2 >Update Registration</h2>
<form  action="updateUser" method="post">
    <h3 style="display : none"><input type="text" name="id" id="id" value="${pass.getId()}" style="display : none"></h3>
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
    <input type="text" name="givenName"   id="gname"  required onblur="return validateName()" value="${pass.getGivenName()}">
    <span id="display" class="required"></span>
    <br>
    <br>
    Surname <small>(Max 45 Characters)</small><span class="required">*</span>
    <input type="text" name="surName"   id="surname" value="${ pass.getSurName() }" >
    <span id="display1" class="required"></span>
    <br>
    <br>
    Date of Birth(DD/MM/YYYY)<span class="required" >*</span>
    <input type="datetime" name="dateOfBirth"   id="dob" value = "${pass.getDateOfBirth()} ">
    <br>
    <br>
    E-mail Id <small>max 35 characters</small><span class="required">*</span>
    <input type="email" name="emailId"   id="email" value="${ pass.getEmailId() }">
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
    <input type="text" name="loginId" id="loginid" value="${ pass.getLoginId() }">
    <br>
    <br>
    Password <span class="required">*</span>
    <input type="text" name="password" id="password1" value="${ pass.getPassword() }" >
    <span id="display3" class="required"></span>
    <br>
    <br>
    Confirm Password <span class="required">*</span>
    <input type="text" name="confirmPassword" id="password2" value="${ pass.getConfirmPassword() }" >
    <span id="display4" class="required"></span>
    <br>
    <br>
    Hint Question <span class="required ">*</span>
    <select name="hintQuestion" id="question" value="${ pass.getHintQuestion() }" >
        <option value="${ pass.getHintQuestion() }">--select--</option>
        <option value="${ pass.getHintQuestion() }">Favourite Colour</option>
        <option value="${ pass.getHintQuestion() }" >Birth City</option>
        <option value="${ pass.getHintQuestion() }">Favourite Cricketer</option>
        <option value="${ pass.getHintQuestion() }">Favourite Food</option>
        <option > First School</option>
    </select>
    <br>
    <br>
    Hint Answer <span class="required ">*</span>
    <input type="text" name="hintAnswer" id="answer" value="${ pass.getHintAnswer() }" >
    <br>
    <br>
    <!-- Enter Characters Display<span class=" ">*</span>
    <input type="text" name="capta" id="character">
    <br>
    <br> -->
    <br>
  <button type="submit" id="submit">Update</button>
   <button type="reset" id="reset">clear</button>

 <!--     <input type="submit"  id="submit" value="register"> -->
  <!--    <input type="reset"  id="reset" value="clear">    -->
</form>


<h2> ${ updated } <a href="getUsers.jsp" style="display:none;" >click here</a>  </h2>
</body>

</html>
