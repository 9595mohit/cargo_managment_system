/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.User;

/**
 *
 * @author Admin
 */
public class UserDao {

    public static void save(User user) {
        String query = "insert into user(name,email,mobileNumber,adress, password, securityQuestion,answer,status) values('" + user.getName() + "','" + user.getEmail() + "','" + user.getMobileNumber() + "','" + user.getAdress() + "','" + user.getPassword() + "','" + user.getSecurityQuestion() + "','" + user.getAnswer() + "','false');";
        DbOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval");
    }
    public static User login(String email,String password)
    {
        User user=null;
        try
        {
            ResultSet rs=DbOperations.getData("select * from user where email='"+email+"' and password='"+password+"'");
            while(rs.next()){
                user=new User();
                user.setStatus(rs.getString("status"));
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        return user;
    }
    public static User getSecurityQuestion(String email)
    {   
       User user=null;
        try
        {
            ResultSet rs=DbOperations.getData("select * from user where email='"+email+"'");
            while(rs.next())
            {
                user=new User();
                user.setSecurityQuestion(rs.getString("securityQuestion"));
                user.setAnswer(rs.getString("answer"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return user;
    }
    public static void update(String email,String newpassword)
    {
        String query="update user set password='"+newpassword+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "password change successfully");
    }
    public static ArrayList<User> getAllRecords()
    {
       ArrayList<User> lst=new ArrayList<>();
       try{
           String query="select * from user";
           ResultSet rs=DbOperations.getData(query);
           while(rs.next())
           {
               User user=new User();
               user.setId(Integer.parseInt(rs.getString("id")));
               user.setName(rs.getString("name"));
               user.setEmail(rs.getString("email"));
               user.setMobileNumber(rs.getString("mobileNumber"));
               user.setAdress(rs.getString("adress"));
               user.setSecurityQuestion(rs.getString("securityQuestion"));
               user.setStatus(rs.getString("status"));
               lst.add(user);
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       return lst;
        
    }
    public static void changeStatus(String email,String status)
    {
        String query="update user set status='"+status+"' where email='"+email+"'";
        DbOperations.setDataOrDelete(query, "user status Changed Successfully");
    }
}
