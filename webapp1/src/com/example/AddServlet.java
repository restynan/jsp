package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet  extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse res) throws IOException {

        int num1= Integer.parseInt(request.getParameter("num1"));
        int num2= Integer.parseInt(request.getParameter("num2"));
        int k = num1 + num2;
       // System.out.println(num1+num2);
        PrintWriter out = res.getWriter();

        out.println("The result : "+k) ;
    }

}
