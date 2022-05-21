/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Damagegoods;
/**
 *
 * @author Admin
 */
public class Damagegoodsdao {
    public static void saveData(Damagegoods damage)
    {
        String query="insert into damagegoods(orderId,shiftedto,damagegoods) values('"+damage.getOrderid()+"','"+damage.getShiftedto()+"','"+damage.getDamageQuantity()+"')";
        DbOperations.setDataOrDelete(query,"Damage goods datails successfully");
    }
    public static ArrayList<Damagegoods> getData()
    {
        ArrayList<Damagegoods> lst=new ArrayList<>();
        Damagegoods dt=new Damagegoods();
        try{
            ResultSet rs=DbOperations.getData("select * from damagegoods");
            while(rs.next())
            {
                dt.setOrderid(rs.getString("orderId"));
                dt.setShiftedto(rs.getString("shiftedto"));
                dt.setDamageQuantity(rs.getString("damagegoods"));
                lst.add(dt);
            }
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return lst;
        
    }
    public static void deleteData(String orderid,String shiftedto)
    {
        String query="delete from damagegoods where orderId='"+orderid+"' and shiftedto='"+shiftedto+"'";
        DbOperations.setDataOrDelete(query, "cargo reordered successfully");
        
    }
    
}
