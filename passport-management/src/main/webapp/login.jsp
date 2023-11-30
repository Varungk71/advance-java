<!-- <%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%> -->
 <!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>passport</title>


    <style>
        #span{
            margin-left: 40%;
            font-style:oblique;
            font-size: larger;
            color: brown;
        }
        div{
            text-align: center;

            background-color: rgb(95, 213, 115);
        }
        #passport{
            padding: 3%; margin-left: 35%; margin-right: 35%; margin-top: 2%;
        }
        #new{
        text-decoration: none ;
        }
        #getAll{
        text-decoration: none ;
        }
    </style>
</head>

<body>


    <span id="span">Passport Application</span>
    <h2> ${ login }</h2>
<div id="passport">
    <h2>Login</h2>
    <br>
    <form action="login">
        <span>emailId / loginId</span>
        <br>
        <input type="email" name="loginMail" id="loginMail">
        <br>
        <span>password</span>
        <br>
        <input type="password" name="pass" id="password">
        <br>
        <br>
        <button type="submit" id="submit" >login</button>
        <br>
        <br>
        <a href="passport.jsp" id="new">New user ? Register here</a>
        <br>
        <br>
        <a href="getAllUsers" id="getAll"> Get details</a>
    </form>

<br>
<!-- <a href="">Login</a> -->
<br>

</div>
</body>

</html>
