package com.xworkz.registration.servlet;

import com.xworkz.registration.dto.RegistrationDTO;
import com.xworkz.registration.repository.NewYearRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class RegisterServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fName=req.getParameter("firstName");
        String lName=req.getParameter("lastName");
        String gender=req.getParameter("gender");
        String number=req.getParameter("phoneNumber");
        String email=req.getParameter("Email");

        RegistrationDTO register=new RegistrationDTO();
        register.setFirstName(fName);
        register.setLastName(lName);
        register.setGender(gender);
        register.setPhoneNumber(Long.parseLong(number));
        register.setEmail(email);

        NewYearRepository repository=new NewYearRepository();
        repository.addCustomer(register);

        req.setAttribute("user",register);

        RequestDispatcher dispatcher= req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);

    }
}
