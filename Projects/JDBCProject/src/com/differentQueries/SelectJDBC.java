
package com.differentQueries;
import java.sql.*;

public class SelectJDBC {
    public static void main(String[] args){
        try{
            Connection con=ConnectionProvider.getConnection();
            String q="select * from students";
            Statement stmt=con.createStatement();
            
            ResultSet set=stmt.executeQuery(q);
            
            while(set.next()){
                int roll=set.getInt(1);
                String name=set.getString(2);
                int phone=set.getInt(3);
                
                System.out.println(name+":"+roll+":"+phone);
                
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
