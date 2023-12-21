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
import java.util.List;

@WebServlet(urlPatterns = "/getUsers")
public class GetServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        NewYearRepository repository=new NewYearRepository();
        List<RegistrationDTO> registered=repository.getAllDetails();
        System.out.println(registered);
        req.setAttribute("getList",registered);

        RequestDispatcher dispatcher= req.getRequestDispatcher("getUsers.jsp");
        dispatcher.forward(req,resp);

    }
}
