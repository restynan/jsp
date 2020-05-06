package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class AddServlet  extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        int num1= Integer.parseInt(request.getParameter("num1"));
        int num2= Integer.parseInt(request.getParameter("num2"));
        int addedValue = num1 + num2;


        //using cookies
        Cookie cookie = new Cookie("k",addedValue +"");
        response.addCookie(cookie);
        response.sendRedirect("sq");

    }

}
