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

@WebServlet(urlPatterns = "/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PassportService service=new PassportServiceImpl();

        String passId=req.getParameter("passportId");
        Integer id=Integer.parseInt(passId);

        PassportDTO passport=service.validateAndGetById(id);


        req.setAttribute("pass",passport);
        RequestDispatcher dispatcher= req.getRequestDispatcher("update-data.jsp");
        dispatcher.forward(req,resp);
    }
}
