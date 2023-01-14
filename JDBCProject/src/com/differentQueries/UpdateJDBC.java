/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.differentQueries;

import java.sql.*;
import java.util.Scanner;

public class UpdateJDBC {
    public static void main(String[] args){
        try{
            Connection con=ConnectionProvider.getConnection();
        
            String q="update students set student_name=? ,phone=? where roll_no=?";
        
            Scanner in=new Scanner(System.in);
        
            System.out.print("Enter Student name: ");
            String name=in.nextLine();
            System.out.print("Enter phone: ");
            int ph=in.nextInt();
            System.out.print("Enter Student roll no: ");
            int roll=in.nextInt();
        
            PreparedStatement pstmt=con.prepareStatement(q);
            pstmt.setString(1,name);
            pstmt.setObject(2, ph);
            pstmt.setObject(3,roll);
            
            pstmt.executeUpdate();
            System.out.println("Updated....");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
