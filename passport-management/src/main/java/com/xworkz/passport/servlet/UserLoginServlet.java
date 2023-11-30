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
@WebServlet(urlPatterns = "/login")
public class UserLoginServlet extends HttpServlet
{
    PassportService service=new PassportServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String loginId=req.getParameter("loginMail");
        String password=req.getParameter("pass");

        List<PassportDTO> userExist=service.getLoginIdAndPassword(loginId,password);

        if(!userExist.isEmpty()){
            req.setAttribute("login","login sucessfull");
        }else{
            req.setAttribute("login","invalid credential");
        }

        RequestDispatcher dispatcher= req.getRequestDispatcher("login.jsp");
        dispatcher.forward(req,resp);


//        System.out.println(userExist);


    }

}
