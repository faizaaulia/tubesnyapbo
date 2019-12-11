/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.HomeSuperAdminController;
import controller.LoginController;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;

/**
 *
 * @author faizaaulia
 */
public class HomeSuperAdminView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public HomeSuperAdminView() {
        initComponents();
    }

    public JLabel getLabelHi() {
        return labelHi;
    }

    public void setLabelHi(String labelHi) {
        this.labelHi.setText("Hi, " + labelHi);
    }
    
    public JButton getBtnDataAdmin() {
        return btnDataAdmin;
    }

    public JButton getBtnDataTransaksi() {
        return btnDataTransaksi;
    }
    
    public JButton getBtnLogout() {
        return btnLogout;
    }
    
    public void addActionListener(HomeSuperAdminController aThis) {
        btnDataAdmin.addActionListener(aThis);
        btnDataTransaksi.addActionListener(aThis);
        btnLogout.addActionListener(aThis);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelHi = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnDataAdmin = new javax.swing.JButton();
        btnDataTransaksi = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHi.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        labelHi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelHi.setText("Hi, Admin");

        btnDataAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDataAdmin.setText("Data Admin");
        btnDataAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataAdminActionPerformed(evt);
            }
        });

        btnDataTransaksi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDataTransaksi.setText("Data Transaksi");
        btnDataTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataTransaksiActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDataAdmin)
                        .addGap(26, 26, 26)
                        .addComponent(btnDataTransaksi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addComponent(labelHi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelHi, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDataAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDataTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDataAdminActionPerformed

    private void btnDataTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataTransaksiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDataTransaksiActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDataAdmin;
    private javax.swing.JButton btnDataTransaksi;
    private javax.swing.JButton btnLogout;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelHi;
    // End of variables declaration//GEN-END:variables
}
