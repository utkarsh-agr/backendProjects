
package com.servlets;

import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends GenericServlet  {

    @Override
    public void service(ServletRequest sr, ServletResponse sr1) throws ServletException, IOException {
        System.out.println("servicing.....");
        sr1.setContentType("text/html");
        PrintWriter out=sr1.getWriter();
        out.println("<h1>This is my servlet<h1>");
    }
    
}
