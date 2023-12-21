package com.xworkz.registration.servlet;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.repository.NewYearRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/updateRegistration")
public class UpdateRegistrationServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        NewYearRepository repository=new NewYearRepository();
        RegistrationDTO reg=new RegistrationDTO();
         String regId=req.getParameter("id");

         reg.setFirstName(req.getParameter("firstName"));
         reg.setLastName(req.getParameter("lastName"));
         reg.setGender(req.getParameter("gender"));
         reg.setPhoneNumber(Long.parseLong(req.getParameter("phoneNumber")));
         reg.setEmail(req.getParameter("email"));

         boolean isUpdated=repository.updatePassport(reg,Integer.parseInt(regId));

         req.setAttribute("updated" , "updated sucessfully");

         resp.sendRedirect("getUsers");

    }
}
