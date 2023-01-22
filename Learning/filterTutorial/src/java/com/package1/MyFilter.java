/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.package1;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.*;

/**
 *
 * @author HP
 */
public class MyFilter implements Filter {

    

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        
    }
    
    @Override
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws ServletException,IOException{
        System.out.println("Before Filter");
        //......
        //.....
        chain.doFilter(request,response);
        System.out.println("After Servlet");
        //....
        //....
    }
    
    @Override
    public void destroy() {
    }
    
}
