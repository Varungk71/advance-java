package com.xworkz.passport.servlet;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.impl.PassportServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/getAllUsers")
public class GetUsersServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PassportService service=new PassportServiceImpl();

        List<PassportDTO> getUsers =service.getAllUsers();
        System.out.println(getUsers);

        req.setAttribute("users",getUsers);

        RequestDispatcher dispatcher= req.getRequestDispatcher("getUsers.jsp");
        dispatcher.forward(req,resp);
    }
}
