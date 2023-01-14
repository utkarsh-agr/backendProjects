/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.differentQueries;
import java.sql.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class InsertImage {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionProvider.getConnection();
        
            String q="insert into img(pic) values(?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            JFileChooser jfc=new JFileChooser();
            jfc.showOpenDialog(null);
        
            File file=jfc.getSelectedFile();
        
            FileInputStream fis=new FileInputStream(file);
            pstmt.setBinaryStream(1,fis,fis.available());
            
            pstmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"success");
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
