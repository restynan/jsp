package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // int value = Integer.parseInt(request.getParameter("addedValue"));


        //using session
        HttpSession session =request.getSession();
       int value =(int) session.getAttribute("addedValue");


        int square =value*value;

        PrintWriter out = response.getWriter();
        out.println("Square value :" +square);

    }


}
