/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author Admin
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("connection successfully");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cargo?useSSL=false","root","ROOTPASSWORD");
            System.out.println("data base connect successfully");
            return con;
            
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
