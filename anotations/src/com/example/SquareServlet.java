package com.example;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/sq")
public class SquareServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       //using cookies
        int value=0;
        Cookie[] cookie =request.getCookies();

        for (Cookie c  : cookie){

            if(c.getName().equals("k")){
                value=Integer.parseInt(c.getValue());
            }


        }


        int square =value*value;

        PrintWriter out = response.getWriter();
        out.println("Square value :" +square);

    }


}
