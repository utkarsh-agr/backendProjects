/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.module;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.*;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author HP
 */
@MultipartConfig
public class Register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String name=request.getParameter("user_name");
            String email=request.getParameter("user_email");
            String password=request.getParameter("user_password");
            Part part=request.getPart("user_img");
            String fileName=part.getSubmittedFileName();
            try{
                Thread.sleep(3000);
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 String url="jdbc:mysql://localhost:3306/learn";
                 Connection con=DriverManager.getConnection(url,"root","root");
                 
                 String q="insert into registrationmodule(name,email,password,imageName) values(?,?,?,?)";
                 
                 PreparedStatement pstmt=con.prepareStatement(q);
                 
                 InputStream is=part.getInputStream();
                 
                 byte[] data=new byte[is.available()];
                 
                 is.read(data);
                 
                 String path=request.getRealPath("/")+"img"+File.separator+fileName;
//                 out.println(path);
                 FileOutputStream fos=new FileOutputStream(path);
                 
                 fos.write(data);
                 fos.close();
                 
                 pstmt.setString(1, name);
                 pstmt.setString(2, email);
                 pstmt.setString(3, password);
                 pstmt.setString(4, fileName);
                 //pstmt.setBinaryStream(4, is,is.available());
                 
                 
                 pstmt.executeUpdate();
                 con.close();
                 out.println("done");
            }catch(Exception e){
                e.printStackTrace();
                out.println("error");
            }
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
