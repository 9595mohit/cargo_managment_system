/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class tables {
    public static void main(String []args)
    {
        try
        {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(10),adress varchar(200),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email));";
            String adminDetails = "insert into user(name,email,mobileNumber, adress,password, securityQuestion,answer,status) values('Admin','admin@gmail.com','1234567890','india','admin','What is your Primary School name?','ABC','true');";
            String warehouse="create table warehouse(id int AUTO_INCREMENT primary key,place varchar(200),superVisorName varchar(200),capacity varchar(200),mobileNumber varchar(200))";
            String orderCargo="create table ordercargo(orderId int AUTO_INCREMENT primary key,quantity varchar(200),WareousePlace varchar(200))";
            String shiftcargo="create table shiftcargo(orderId int(20),Quantityshifted varchar(200),shiftedfrom varchar(200),shiftedto varchar(200),shiftedDate varchar(200),shiftedtime varchar(200),accept varchar(200))";
            String dispatchcargo="create table dispatchcargo(orderId int(20),Quantityshifted varchar(200),shiftedfrom varchar(200),shiftedto varchar(200),shiftedDate varchar(200),shiftedtime varchar(200),accept varchar(200))";
            String contactus="create table contactus(email varchar(200),mobileNo varchar(200))";
            String damagegoods="create table damagegoods(orderId int(20),shiftedto varchar(200),damagegoods varchar(200))";
            //DbOperations.setDataOrDelete(userTable, "User Table Created SuccessFully");
            //DbOperations.setDataOrDelete(adminDetails, "admon details sumbited succesfullt!");
            //DbOperations.setDataOrDelete(warehouse, "warehouse table created successfully");
            //DbOperations.setDataOrDelete(orderCargo, "oredr cargo table created successfully");
            //DbOperations.setDataOrDelete(shiftcargo, "shift cargo tables created succesfully");
            //DbOperations.setDataOrDelete(dispatchcargo, "Dispatch cargo table created successfully");
            //DbOperations.setDataOrDelete(damagegoods, "damage goods table created successfully");
            DbOperations.setDataOrDelete(contactus,"contact us table created successfully!");
            
        }   
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
