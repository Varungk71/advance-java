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
import java.util.List;
@WebServlet(urlPatterns = "/getBooking")
public class GetDetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ResortService service=new ResortServiceImpl();
        List<ResortDTO> resort=service.getUsers();

        System.out.println(resort);

        req.setAttribute("resort",resort);
        RequestDispatcher dispatcher= req.getRequestDispatcher("details.jsp");
        dispatcher.forward(req,resp);
    }
}
