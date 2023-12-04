package com.xworkz.resort.servlet;


import com.xworkz.resort.dto.FeedbackDTO;
import com.xworkz.resort.repository.FeedbackRepository;
import com.xworkz.resort.repository.impl.FeedbackRepositoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/feedback")

public class FeedbackServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String name= req.getParameter("name");
        String email=req.getParameter("mail");
       String numbet= req.getParameter("contactNumber");
       String comments= req.getParameter("comments");


        FeedbackDTO dto=new FeedbackDTO();
        FeedbackRepository repository =new FeedbackRepositoryImpl();

        dto.setName(name);
        dto.setEmail(email);
        dto.setNumber(numbet);
        dto.setComments(comments);

        repository.addFeedback(dto);

        RequestDispatcher dispatcher= req.getRequestDispatcher("resort.jsp");
        dispatcher.forward(req,resp);
    }
}