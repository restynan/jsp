package com.example;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
         int value = (int) request.getAttribute("addedValue");
        int square =value*value;

        PrintWriter out = response.getWriter();
        out.println("Square value :" +square);

    }


}
