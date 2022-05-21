/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comman;

import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class OpenPdf {
     public static void openByOrderId(String orderid)
    {
        try
        {
            if((new File("D:\\"+orderid+".pdf")).exists())
            {
                Process p=Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler D:\\"+orderid+".pdf");
                
            }
            else
            {
               JOptionPane.showMessageDialog(null, "file is not exists"); 
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
