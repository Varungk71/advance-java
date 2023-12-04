package com.xworkz.resort.servlet;

import com.xworkz.resort.dto.ResortDTO;
import com.xworkz.resort.service.ResortService;
import com.xworkz.resort.service.impl.ResortServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/resort")
public class ResortServlet extends HttpServlet {
    private Integer room;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ResortDTO resort=new ResortDTO();
        ResortService service=new ResortServiceImpl();
       String firstName= req.getParameter("firstName");
        String lastName=req.getParameter("lastName");
        String mail= req.getParameter("Email");
       String number= req.getParameter("phoneNumber");
       String payment= req.getParameter("paymentMode");
        String checkInDate=req.getParameter("checkIn");
        String checkOutDate=req.getParameter("checkOut");
        String noOfAdult= req.getParameter("member");
        String noOfChild= req.getParameter("children");
        String room= req.getParameter("room");

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(mail);
        System.out.println(number);
        System.out.println(payment);
        System.out.println(checkInDate);
        System.out.println(checkOutDate);
        System.out.println(noOfAdult);
        System.out.println(noOfChild);
        System.out.println(room);

        resort.setFirstName(firstName);
        resort.setLastName(lastName);
        resort.setEmail(mail);
        resort.setContactNumber(number);
        resort.setModeOfPayment(payment);
        resort.setCheckInDate(checkInDate);
        resort.setCheckOutDate(checkOutDate);
        resort.setAdults(noOfAdult);
        resort.setChildren(noOfChild);
        resort.setRoom(room);


        req.setAttribute("book","booked sucessfully");
        RequestDispatcher dispatcher=req.getRequestDispatcher("resort.jsp");
        dispatcher.forward(req,resp);

        service.addUser(resort);

    }
}
