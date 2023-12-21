package com.xworkz.passport.servlet;

import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.impl.PassportServiceImpl;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PassportService service =new PassportServiceImpl();

       String passId= req.getParameter("passId");
//       int id=Integer.parseInt(passId);

       req.setAttribute("deleted","deleted sucessfully");

       boolean isDeleted=service.deleteById(Integer.parseInt(passId));
        if(isDeleted==true) {
            resp.sendRedirect("getAllUsers");
        }
        else{
            req.setAttribute("recordNotFound","not deleted");
        }

    }
}
