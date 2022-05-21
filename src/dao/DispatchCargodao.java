/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ShiftCargoModel;
/**
 *
 * @author Admin
 */
public class DispatchCargodao {
    public static void saveDispatcgData(ShiftCargoModel md)
    {
        String query="insert into dispatchcargo(orderId,Quantityshifted,shiftedfrom,shiftedto,shiftedDate,shiftedtime,accept) values('"+md.getOrderId()+"','"+md.getQanity()+"','"+md.getPlace()+"','"+md.getShiftedto()+"','"+md.getDate()+"','"+md.getTime()+"','"+md.getAcctept()+"')";
        DbOperations.setDataOrDelete(query, "Cargo Dispatched Successfully");
        
        
    }
    public static ArrayList<ShiftCargoModel>getDataById(String orderId )
    {
        ArrayList<ShiftCargoModel> lst=new ArrayList<>();
        try{
            ResultSet rs=DbOperations.getData("select * from shiftcargo where orderId='"+orderId+"'");
            while(rs.next())
            {
                ShiftCargoModel md=new ShiftCargoModel();
                md.setOrderId(rs.getString("orderId"));
                md.setQanity(rs.getString("Quantityshifted"));
                md.setPlace("shiftedfrom");
                md.setShiftedto("shiftedto");
                md.setDate(rs.getString("shiftedDate"));
                md.setTime(rs.getString("shiftedtime"));
                md.setAcctept(rs.getString("accept"));
                lst.add(md);
                
            }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return  lst;
    }
    
}
