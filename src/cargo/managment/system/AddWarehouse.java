/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cargo.managment.system;
import dao.WarehouseDao;
import model.Warehouse;
/**
 *
 * @author Admin
 */
public class AddWarehouse extends javax.swing.JFrame {
       
       Warehouse w=WarehouseDao.GetId();
       String capacity1="-?\\d+(\\.\\d+)?";
       /**
     * Creates new form AddWarehouse
     */
       
    public AddWarehouse() {
        int id=Integer.parseInt(w.getId())+1;
        
        initComponents();
        btnAdd.setEnabled(false);
        lblId.setText(String.valueOf(id));
        
        
    }
    public void clear()
    {
        txtPlace.setText("");
        txtSuperVisorName.setText("");
        txtCapacity.setText("");
        txtMobileNumber.setText("");
        btnAdd.setEnabled(false);
    }
    public void validateField()
    {
        String place=txtPlace.getText();
        String supervisorname=txtSuperVisorName.getText();
        String capacity=txtCapacity.getText();
        String mobileNumber=txtMobileNumber.getText();
        if(!place.equals("") && !supervisorname.equals("") && !capacity.equals("") && capacity.matches(capacity1) && !mobileNumber.equals("") && mobileNumber.length()==10)
        {
            btnAdd.setEnabled(true);
        }
        else
        {
            btnAdd.setEnabled(false);
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
        lblId = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPlace = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSuperVisorName = new javax.swing.JTextField();
        txtCapacity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(380, 250));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Warehouse");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblId.setForeground(new java.awt.Color(255, 255, 255));
        lblId.setText("00");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Place:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 121, -1, -1));

        txtPlace.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtPlace.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlaceKeyReleased(evt);
            }
        });
        getContentPane().add(txtPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 118, 270, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Supervisor Name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 162, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Capacity:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 203, -1, -1));

        txtSuperVisorName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtSuperVisorName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSuperVisorNameKeyReleased(evt);
            }
        });
        getContentPane().add(txtSuperVisorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 159, 270, -1));

        txtCapacity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtCapacity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCapacityKeyReleased(evt);
            }
        });
        getContentPane().add(txtCapacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 200, 270, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mobile Number:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 244, -1, -1));

        txtMobileNumber.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtMobileNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMobileNumberKeyReleased(evt);
            }
        });
        getContentPane().add(txtMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 241, 270, -1));

        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/save.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 291, -1, -1));

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        getContentPane().add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 291, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/close.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(639, 11, 34, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cargoImages/700x400-dark-imperial-blue-soli.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Warehouse warehouse=new Warehouse();
        warehouse.setId(lblId.getText());
        warehouse.setPlace(txtPlace.getText());
        warehouse.setSupervisorname(txtSuperVisorName.getText());
        warehouse.setCapacity(txtCapacity.getText());
        warehouse.setMobileNumber(txtMobileNumber.getText());
        WarehouseDao.saveWarehouse(warehouse);
        clear();
        setVisible(false);
        new AddWarehouse().setVisible(true);

        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPlaceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlaceKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtPlaceKeyReleased

    private void txtSuperVisorNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSuperVisorNameKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtSuperVisorNameKeyReleased

    private void txtCapacityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacityKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtCapacityKeyReleased

    private void txtMobileNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNumberKeyReleased
        // TODO add your handling code here:
        validateField();
    }//GEN-LAST:event_txtMobileNumberKeyReleased

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        clear();
        
    }//GEN-LAST:event_btnClearActionPerformed

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
            java.util.logging.Logger.getLogger(AddWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddWarehouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddWarehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblId;
    private javax.swing.JTextField txtCapacity;
    private javax.swing.JTextField txtMobileNumber;
    private javax.swing.JTextField txtPlace;
    private javax.swing.JTextField txtSuperVisorName;
    // End of variables declaration//GEN-END:variables
}