
package com.servlets;
import jakarta.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;


public class FirstServlet implements Servlet {
    
    ServletConfig conf;

    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.conf=sc;
        System.out.println("Creating object");
    }

    @Override
    public ServletConfig getServletConfig() {
        return conf;
        
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        System.out.println("Servicing....");
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>This is my servlet page</h1>");
   }

    @Override
    public String getServletInfo() {
        return "This is my First servlet";
    }

    @Override
    public void destroy() {
        System.out.println("The object is being destroyed");
    }
    
    
    
}
