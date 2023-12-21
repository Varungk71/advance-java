<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>New Year Registration</h2>
    <br>
    <form action="register" method="post">
        First Name : <input type="text" name="firstName" id="fname">
        <br>
        <br>
        Last Name : <input type="text" name="lastName" id="Lname">
        <br>
        <br>
        Gender :
        <input type="radio" name="gender" id="male" value="male"> Male
        <input type="radio" name="gender" id="female" value="female"> Female
        <br>
        <br>
        Phone Number : <input type="number" name="phoneNumber" id="number">
        <br>
        <br>
        Email : <input type="email" name="Email" id="mail">
        <br>
        <br>
        <button type="submit">Submit</button>

        <a href="getUsers">get details </a>
    </form>
</body>
</html>