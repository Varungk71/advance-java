package com.xworkz.passport.servlet;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.service.PassportService;
import com.xworkz.passport.service.impl.PassportServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/updateUser")
public class UpdatePassportServlet extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PassportDTO pass=new PassportDTO();
        String pId=req.getParameter("id");

        System.out.println(Integer.parseInt(pId));
        PassportService service=new PassportServiceImpl();

        pass.setPassportOffice(req.getParameter("passportOffice"));
        pass.setGivenName(req.getParameter("givenName"));
        pass.setSurName(req.getParameter("surName"));
        pass.setDateOfBirth(req.getParameter("dateOfBirth"));
        pass.setEmailId(req.getParameter("emailId"));
        pass.setLoginId(req.getParameter("loginId"));
        pass.setPassword(req.getParameter("password"));
        pass.setConfirmPassword(req.getParameter("confirmPassword"));
        pass.setHintQuestion(req.getParameter("hintQuestion"));
        pass.setHintAnswer(req.getParameter("hintAnswer"));

        req.setAttribute("updated","updated sucessfully");

//        RequestDispatcher dispatcher= req.getRequestDispatcher("update-data.jsp");
//        dispatcher.forward(req,resp);

        resp.sendRedirect("getAllUsers");
        service.updatePassport(pass,Integer.parseInt(pId));
    }
}