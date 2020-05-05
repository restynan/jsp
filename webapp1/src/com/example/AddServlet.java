package com.example;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet  extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int num1= Integer.parseInt(request.getParameter("num1"));
        int num2= Integer.parseInt(request.getParameter("num2"));
        int addedValue = num1 + num2;
       // System.out.println(num1+num2);

        // send the added value square servlet
        request.setAttribute("addedValue",addedValue);
        RequestDispatcher rd = request.getRequestDispatcher("sq");
        rd.forward(request,response);


    }

}
