<%@ page language="java" contentType="text/html; charset=US-ASCII"
pageEncoding="US-ASCII"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <style>
        table,th,td{
                    border: 2px solid black;
                    border-collapse: collapse;
                    margin-left: auto;
                    margin-right: auto;
                    margin-top:4%;
                    background-color: rgb(122, 237, 237)
                }
                th{;
                }
                td{
                    background-color: rgb(251, 219, 139);
                }
                #homeButton{
                text-decoration:none;
                }
                a{
                text-decoration:none;
                }
    </style>
</head>
<body>
<a href="login.jsp" id="homeButton">Home</a>

    <table>
        <tr>
            <th>Sl.No</th>
            <th>Given name</th>
            <th>Sur Name</th>
            <th>E-mail</th>
            <th>date of Birth</th>
            <th>Hint Question</th>
            <th>Hint Answer</th>
            <th>Login Id</th>
            <th>Passport Office</th>
            <th>Action</th>
        </tr>
    < c:forEach items="${ users }" var="user">
        <tr>
            <td>${ user.getId() }</td>
            <td>${ user.getGivenName() }</td>
            <td>${ user.getSurName() }</td>
            <td>${ user.getEmailId() }</td>
            <td>${ user.getDateOfBirth() }</td>
            <td>${ user.getHintQuestion() }</td>
            <td>${ user.getHintAnswer() }</td>
            <td>${ user.getLoginId() }</td>
            <td>${ user.getPassportOffice() }</td>

            <td><a href="update?passportId=${ user.getId() }">Update</a>
            &nbsp; &nbsp; &nbsp;
            <a href="delete?passId=${ user.getId() }">Delete</a>   </td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>