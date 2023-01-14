package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class RegisterServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        out.println("<h1>Welcome to submission page</h2>");
        
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_password");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String cond=request.getParameter("condition");
        
        if(cond!=null){
            if(cond.equals("checked")){
                out.println("<h2>name:"+ name+"<h2>");
                out.println("<h2>email:"+ email+"<h2>");
                out.println("<h2>password:"+ password+"<h2>");
                out.println("<h2>gender:"+ gender+"<h2>");
                out.println("<h2>course:"+ course+"<h2>");
                
                //This will show use of forward method
                
                RequestDispatcher rd=request.getRequestDispatcher("success");
                rd.forward(request, response);
            }
        }
        else
        {
            out.println("Please accept terms and conditions");
            
            //I want include the output of index.html too
            
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            
            rd.include(request, response);
        }
        
    }
}