package com.xworkz.webapp.servlet;

import com.xworkz.webapp.dto.UserDTO;
import com.xworkz.webapp.service.UserService;
import com.xworkz.webapp.service.impl.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/user" ,loadOnStartup = +1)

public class UserServlet extends HttpServlet
{
    @Override
    public void init() throws ServletException {
        System.out.println("servlet object initialised");
        super.init();
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

       String name= req.getParameter("name");
       String phoneNumber= req.getParameter("phoneNumber");
       String mail= req.getParameter("email");
        String password=req.getParameter("password");

        UserDTO user=new UserDTO();
        user.setName(name);
        user.setPhoneNumber(Long.parseLong(phoneNumber));
        user.setEmail(mail);
        user.setPassword(password);

        System.out.println(name);
        System.out.println(phoneNumber);
        System.out.println(mail);
        System.out.println(password);

//        PrintWriter printWriter= resp.getWriter();

        req.setAttribute("userName",name);

        RequestDispatcher dispatcher=req.getRequestDispatcher("response.jsp");
        dispatcher.forward(req,resp);

        /*resp.setContentType("text/html");
        printWriter.print(" <html> " +
              "  <head>" +
               " <style> #server{ background-color=aqua; }      </style>"+
                "</head> " +
                        "<body id="+"server"+">     <h2> thank you "+ name + " for joining us </h2>    " +

                "</body>" +
                        "" +
                    "</html> ");*/

        UserService service=new UserServiceImpl();

        service.validateAndSave(user);


    }

    @Override
    public void destroy() {
        super.destroy();
        System.out.println("servlet object destroyed");


    }
}
