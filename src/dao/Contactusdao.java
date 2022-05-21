/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import model.contactusmodel;
/**
 *
 * @author Admin
 */
public class Contactusdao {
    public static void saveData(contactusmodel model)
    {
        String query="insert into contactus(email,mobileNo) values('"+model.getEmail()+"','"+model.getMobileNumber()+"')";
        DbOperations.setDataOrDelete(query, "contact saved successfully");
        
    }
    
}
