/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cargo.managment.system;
import dao.ShiftCargodao;
import java.util.ArrayList;
import java.util.Iterator;
import model.ShiftCargoModel;
import dao.Damagegoodsdao;
import model.Damagegoods;
/**
 *
 * @author Admin
 */
public class DamageGoods extends javax.swing.JFrame {

    /**
     * Creates new form DamageGoods
     */
    String damageQuantity="^[1-9]?[0-9]{1}$|^100$";
    public DamageGoods() {
        initComponents();
        btnsubmite.setEnabled(false);
    }
    public void validateField()
    {
        String damage=txtDamageQuntity.getText();
        String orderid=(String)txtorderId.getSelectedItem();
        String shiftedto=(String)txtShiftedfrom.getSelectedItem();
        if(!orderid.equals("--select--")&& !shiftedto.equals("--select--") && !damage.equals("") && damage.matches(damageQuantity))
        {
            btnsubmite.setEnabled(true);
        }
        else
        {
            btnsubmite.setEnabled(false);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDamageQuntity = new javax.swing.JTextField();
        btnsubmite = new javax.swing.JButton();
        txtorderId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtShiftedfrom = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 250));
        setMinimumSize(new java.awt.Dimension(700, 400));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Damage Goods");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Order Id:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("You ware hous:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Quantity Damage:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        txtDamageQuntity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtDamageQuntity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDamageQuntityKeyReleased(evt);
            }
        });
        getContentPane().add(txtDamageQuntity, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 129, -1));

        btnsubmite.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsubmite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/shift oder.png"))); // NOI18N
        btnsubmite.setText("Submite");
        btnsubmite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsubmiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnsubmite, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        txtorderId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtorderId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));
        txtorderId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorderIdActionPerformed(evt);
            }
        });
        txtorderId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtorderIdKeyReleased(evt);
            }
        });
        getContentPane().add(txtorderId, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 114, 129, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        txtShiftedfrom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtShiftedfrom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--select--" }));
        txtShiftedfrom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtShiftedfromKeyReleased(evt);
            }
        });
        getContentPane().add(txtShiftedfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/700x400-dark-imperial-blue-soli.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String orderid=(String)txtorderId.getSelectedItem();
        ArrayList<ShiftCargoModel> lst=ShiftCargodao.getRecord();
        Iterator<ShiftCargoModel>itr=lst.iterator();
        while(itr.hasNext())
        {
            ShiftCargoModel md=itr.next();
            txtorderId.addItem(md.getOrderId());
        }
        
        
        
    }//GEN-LAST:event_formComponentShown

    private void txtDamageQuntityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDamageQuntityKeyReleased
        // TODO add your handling code here:
         validateField();
    }//GEN-LAST:event_txtDamageQuntityKeyReleased

    private void txtorderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorderIdActionPerformed
        // TODO add your handling code here:
        String orderid=(String)txtorderId.getSelectedItem();
        ArrayList<ShiftCargoModel> lst=ShiftCargodao.getRecordByOrderid(orderid);
        Iterator<ShiftCargoModel>itr=lst.iterator();
        while(itr.hasNext())
        {
            ShiftCargoModel md=itr.next();
            txtShiftedfrom.addItem(md.getShiftedto());
        }
        
        
    }//GEN-LAST:event_txtorderIdActionPerformed

    private void txtorderIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtorderIdKeyReleased
        // TODO add your handling code here:
         validateField();
    }//GEN-LAST:event_txtorderIdKeyReleased

    private void btnsubmiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsubmiteActionPerformed
        // TODO add your handling code here:
        Damagegoods dg=new Damagegoods();
        dg.setOrderid((String)txtorderId.getSelectedItem());
        dg.setShiftedto((String)txtShiftedfrom.getSelectedItem());
        dg.setDamageQuantity((String)txtDamageQuntity.getText());
        Damagegoodsdao.saveData(dg);
        setVisible(false);
        new DamageGoods().setVisible(true);
        
    }//GEN-LAST:event_btnsubmiteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtShiftedfromKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtShiftedfromKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtShiftedfromKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DamageGoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DamageGoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DamageGoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DamageGoods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DamageGoods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsubmite;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDamageQuntity;
    private javax.swing.JComboBox<String> txtShiftedfrom;
    private javax.swing.JComboBox<String> txtorderId;
    // End of variables declaration//GEN-END:variables
}
