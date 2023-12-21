package com.xworkz.registration.servlet;

import com.xworkz.registration.repository.NewYearRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/delete")
public class DeleteServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewYearRepository repository=new NewYearRepository();

        String regId=req.getParameter("id");

        boolean isDeleted=repository.deleteById(Integer.parseInt(regId));

        req.setAttribute("deleted",isDeleted);

        resp.sendRedirect("getUsers");
    }
}
