<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h2>New Year Update Registration</h2>
    <br>
    <form action="updateRegistration" method="post">
        <h3 style="display : none"><input type="text" name="id" id="id" value="${ reg.getId()}" style="display : none"></h3>

        First Name : <input type="text" name="firstName" id="fname" value=${reg.getFirstName() }>
        <br>
        <br>
        Last Name : <input type="text" name="lastName" id="Lname" value=${reg.getLastName() }>
        <br>
        <br>
        Gender :
        <input type="radio" name="gender"  value="male" value=${reg.getGender() }> Male
        <input type="radio" name="gender"  value="female" value=${reg.getGender() }> Female
        <br>
        <br>
        Phone Number : <input type="number" name="phoneNumber" id="number" value=${reg.getPhoneNumber() } >
        <br>
        <br>
        Email : <input type="email" name="email" id="mail" value=${reg.getEmail() }>
        <br>
        <br>
        <button type="submit">update</button>

    </form>
</body>
</html>