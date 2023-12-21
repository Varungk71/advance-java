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
@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        NewYearRepository repository=new NewYearRepository();
        String regId=req.getParameter("id");
        RegistrationDTO register=repository.getById(Integer.parseInt(regId));

        req.setAttribute("reg",register);
        RequestDispatcher dispatcher=req.getRequestDispatcher("updateRegister.jsp");
        dispatcher.forward(req,resp);
    }
}
