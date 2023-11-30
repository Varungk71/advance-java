package com.xworkz.passport.servlet;

import com.xworkz.passport.dto.PassportDTO;
import com.xworkz.passport.service.impl.PassportServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/passport")
public class PassportServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        String registerPlace=req.getParameter("");
    String officeName=req.getParameter("passportOffice");
    String givenName=req.getParameter("givenName");
    String surName=req.getParameter("surName");
    String datOfBirth=req.getParameter("dateOfBirth");
    String email=req.getParameter("emailId");
    String loginId=req.getParameter("loginId");
    String password=req.getParameter("password");
    String confirmPassword=req.getParameter("confirmPassword");
    String hintQuestion=req.getParameter("hintQuestion");
    String hintAnswer=req.getParameter("hintAnswer");

        System.out.println(officeName);
        System.out.println(givenName);
        System.out.println(surName);
        System.out.println(datOfBirth);
        System.out.println(email);
        System.out.println(loginId);
        System.out.println(password);
        System.out.println(confirmPassword);
        System.out.println(hintQuestion);
        System.out.println(hintAnswer);


        PassportServiceImpl service = new PassportServiceImpl();
        PassportDTO passportDTO=new PassportDTO();
        passportDTO.setPassportOffice(officeName);
        passportDTO.setGivenName(givenName);
        passportDTO.setSurName(surName);
        passportDTO.setDateOfBirth(datOfBirth);
        passportDTO.setEmailId(email);
        passportDTO.setLoginId(loginId);
        passportDTO.setPassword(password);
        passportDTO.setConfirmPassword(confirmPassword);
        passportDTO.setHintQuestion(hintQuestion);
        passportDTO.setHintAnswer(hintAnswer);

        req.setAttribute("name", givenName +" thank you for the registration");

        RequestDispatcher dispatcher = req.getRequestDispatcher("passport.jsp");
        dispatcher.forward(req,resp);

        service.validateAndSave(passportDTO);

    }
}

