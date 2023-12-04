package com.xworkz.homeappliances.servlet;

import com.xworkz.homeappliances.dto.AppliancesDTO;

//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;

@WebServlet(urlPatterns = "/home" ,loadOnStartup = +1)
public class HomeServlet extends HttpServlet {
    public HomeServlet()
    {
        System.out.println("constructor");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name=req.getParameter("name");

//        AppliancesDTO dto=new AppliancesDTO();
//
//        dto.setName(name);

        req.setAttribute("home","appliance added sucessfully");
        RequestDispatcher dispatcher= req.getRequestDispatcher("index.jsp");
        dispatcher.forward(req,resp);

//        System.out.println(name);


    }
}
