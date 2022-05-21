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
import model.ShiftCargoModel;

/**
 *
 * @author Admin
 */
public class ShiftCargodao {

    public static ArrayList<OrderCargo> getAllRecordsOrderCargo()//get all record in order cargo table
    {
        ArrayList<OrderCargo> lst = new ArrayList<>();

        try {
            ResultSet rs = DbOperations.getData("select * from ordercargo");
            while (rs.next()) {
                OrderCargo ord = new OrderCargo();
                ord.setOrderid(rs.getString("orderId"));
                lst.add(ord);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lst;

    }

    public static ArrayList<Warehouse> getAllRecordsWarehous()//get all record in warehous
    {
        ArrayList<Warehouse> lst = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from warehouse");
            while (rs.next()) {
                Warehouse wr = new Warehouse();
                wr.setPlace(rs.getString("place"));
                lst.add(wr);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lst;
    }

    public static OrderCargo getOrderCargoField(String OrderId) {
        OrderCargo ord = null;

        try {

            ResultSet rs = DbOperations.getData("select * from ordercargo where orderId='" + OrderId + "'");
            while (rs.next()) {
                ord = new OrderCargo();
                ord.setQuantity(rs.getString("quantity"));
                ord.setWarehouseplace(rs.getString("WareousePlace"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return ord;
    }

    public static Warehouse getWarehousField(String place) {
        Warehouse wr = null;
        try {
            ResultSet rs = DbOperations.getData("select * from warehouse where place='" + place + "'");
            while (rs.next()) {
                wr = new Warehouse();
                wr.setCapacity(rs.getString("capacity"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return wr;
    }

    public static void saveData(ShiftCargoModel model, String date, String time) {
        String query = "insert into shiftcargo(orderId,Quantityshifted,shiftedfrom,shiftedto,shiftedDate,shiftedtime,accept) values('" + model.getOrderId() + "','" + model.getQanity() + "','" + model.getPlace() + "','" + model.getShiftedto() + "','" + date + "','" + time + "','NO')";
        DbOperations.setDataOrDelete(query, "Cargo shifted successfully");
    }

    public static ArrayList<ShiftCargoModel> getRecord() {
        ArrayList<ShiftCargoModel> lst = new ArrayList<>();
        try {
            String query = "select * from shiftCargo";
            ResultSet rs = DbOperations.getData(query);
            while (rs.next()) {
                ShiftCargoModel md = new ShiftCargoModel();
                md.setOrderId(rs.getString("orderId"));
                md.setQanity(rs.getString("Quantityshifted"));
                md.setPlace(rs.getString("shiftedfrom"));
                md.setShiftedto(rs.getString("shiftedto"));
                md.setDate(rs.getString("shiftedDate"));
                md.setTime(rs.getString("shiftedtime"));
                md.setAcctept(rs.getString("accept"));
                lst.add(md);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lst;
    }

    public static ArrayList<ShiftCargoModel> getRecordByOrderid(String id) {
        ArrayList<ShiftCargoModel> lst = new ArrayList<>();

        try {
            String query = "select * from shiftCargo where orderId='" + id + "'";
            ResultSet rs = DbOperations.getData(query);
            while (rs.next()) {
                ShiftCargoModel md = new ShiftCargoModel();
                md.setOrderId(rs.getString("orderId"));
                md.setQanity(rs.getString("Quantityshifted"));
                md.setPlace(rs.getString("shiftedfrom"));
                md.setShiftedto(rs.getString("shiftedto"));
                md.setDate(rs.getString("shiftedDate"));
                md.setTime(rs.getString("shiftedtime"));
                md.setAcctept(rs.getString("accept"));
                lst.add(md);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lst;
    }
    public static void AcceptCargo(String orderid,String accept,String shiftedfrom,String shiftedto)
    {
        String query="update shiftcargo set accept='"+accept+"' where orderId='"+orderid+"' and shiftedfrom='"+shiftedfrom+"' and shiftedto='"+shiftedto+"'";
        DbOperations.setDataOrDelete(query, "Cargo accepted successfully");
    }
    public static ArrayList<ShiftCargoModel>getGetPassData(String orderid,String shiftedto)
    {
        ArrayList<ShiftCargoModel> lst=new ArrayList<>();
        try{
        String query="select * from shiftcargo where orderId='"+orderid+"' and shiftedto='"+shiftedto+"'";
        ResultSet rs=DbOperations.getData(query);
        while(rs.next())
        {
            ShiftCargoModel md=new ShiftCargoModel();
            md.setOrderId(rs.getString("orderId"));
            md.setQanity(rs.getString("Quantityshifted"));
            md.setDate(rs.getString("shiftedDate"));
            md.setPlace(rs.getString("shiftedfrom"));
            md.setShiftedto(rs.getString("shiftedto"));
            lst.add(md);
        }
     }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return lst; 
    }

}
