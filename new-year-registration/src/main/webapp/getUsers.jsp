<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %>
<html lang="en">
<head>
</head>
<body>
    <table>
           <tr>
               <th>Sl.No </th>
               <th>First Name</th>
               <th>Last Name</th>
               <th>Gender</th>
               <th>Phone Number</th>
               <th>Email</th>
               <th>Action</th>
           </tr>
       < c:forEach items="${ getList }" var="book" >
           <tr>
           <td>${ book.getId() }</td>
           <td>${ book.getFirstName() }</td>
           <td>${ book.getLastName() }</td>
           <td>${ book.getGender() } </td>
           <td>${ book.getPhoneNumber() }</td>
           <td>${ book.getEmail() }</td>
           <td> <a href="update?id=${ book.getId() }">Update</a>
           &nbsp; &nbsp; &nbsp;
           <a href="delete?id=${ book.getId() }">Delete</a>
           </td>
           </tr>
           </c:forEach >
       </table>
</body>
</html>