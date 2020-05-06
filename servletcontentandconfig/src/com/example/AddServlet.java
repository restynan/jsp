package com.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet  extends HttpServlet {


    public void doGet (HttpServletRequest request, HttpServletResponse response) throws IOException {
        //servletConfig
        ServletConfig config =getServletConfig();
        String name=config.getInitParameter("name");

        //servletcontext    ----normally used when u want the parameter to be accessed by many servlets

        ServletContext context= getServletContext();
        String degree =context.getInitParameter("degree");

        PrintWriter out=response.getWriter();
        out.println(name + "      "+ degree);





    }
}
