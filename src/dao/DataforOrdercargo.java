/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.OrderCargo;
/**
 *
 * @author Admin
 */
public class DataforOrdercargo {
    public static void saveData(OrderCargo ord)
    {
        String query="insert into ordercargo(quantity,WareousePlace) values('"+ord.getQuantity()+"','"+ord.getWarehouseplace()+"')";
        DbOperations.setDataOrDelete(query, "cargo ordered sucessfully");
        
    }
    public static OrderCargo getId()
    {
        OrderCargo ord=null;
        try{
            ResultSet rs=DbOperations.getData("select * from ordercargo");
            while(rs.next())
            {
                ord=new OrderCargo();
                ord.setOrderid(rs.getString("orderId"));
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return ord;
    }
    public void dipsay()
    {
        System.out.println("hallo world");
    }
    
}
