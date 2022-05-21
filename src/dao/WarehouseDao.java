/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.OrderCargo;
import model.Warehouse;
/**
 *
 * @author Admin
 */
public class WarehouseDao {
    public static void saveWarehouse(Warehouse warehouse)
    {
        String query="insert into warehouse(place,superVisorName,capacity,mobileNumber) values('"+warehouse.getPlace()+"','"+warehouse.getSupervisorname()+"','"+warehouse.getCapacity()+"','"+warehouse.getMobileNumber()+"')";
        DbOperations.setDataOrDelete(query, "warehouse Added successfully");
    }
   public static Warehouse GetId()
   {
       Warehouse warehous=null;
       try{
           ResultSet rs=DbOperations.getData("select * from warehouse");
           while(rs.next())
           {
               warehous=new Warehouse();
               warehous.setId(rs.getString("id"));
               
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       return  warehous;
   }
   public static ArrayList<Warehouse> getAllRecord()
   {
       ArrayList<Warehouse> lst=new ArrayList<>();
       ResultSet rs=DbOperations.getData("select * from warehouse");
       try{
           while(rs.next())
           {
           Warehouse hous=new Warehouse();
           hous.setPlace(rs.getString("place"));
           lst.add(hous);
           }
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       return lst;
   }
   public static ArrayList<Warehouse>getAllRecordByplace(String place)
   {
       ArrayList<Warehouse> lst=new ArrayList<>();
       ResultSet rs=DbOperations.getData("select * from warehouse where place='"+place+"'");
       try{
           while(rs.next())
           {
               Warehouse hous=new Warehouse();
               hous.setId(rs.getString("id"));
               hous.setPlace(rs.getString("place"));
               hous.setSupervisorname(rs.getString("superVisorName"));
               hous.setMobileNumber(rs.getString("mobileNumber"));
               lst.add(hous);
               
           }
           
           
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       
       return lst;
   }
   public static ArrayList<Warehouse>getRecords()
   {
       ArrayList<Warehouse> lst=new ArrayList<>();
       ResultSet rs=DbOperations.getData("select * from warehouse");
       try{
           while(rs.next())
           {
               Warehouse hous=new Warehouse();
               hous.setPlace(rs.getString("place"));
               hous.setMobileNumber(rs.getString("mobileNumber"));
               hous.setSupervisorname(rs.getString("superVisorName"));
               lst.add(hous);
               
           }
           
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null, e);
       }
       return lst;
       
   }
  
  
    
}
