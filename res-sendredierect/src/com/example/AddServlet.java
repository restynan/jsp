package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AddServlet  extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int num1= Integer.parseInt(request.getParameter("num1"));
        int num2= Integer.parseInt(request.getParameter("num2"));
        int addedValue = num1 + num2;
       // System.out.println(num1+num2)


        // URL Rewriting
       // response.sendRedirect("sq?addedValue="+addedValue);

        HttpSession session =request.getSession();
        session.setAttribute("addedValue",addedValue);
        response.sendRedirect("sq");

    }

}
