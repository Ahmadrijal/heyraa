package Tubes;

import Koneksi.Koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class admindata extends javax.swing.JFrame {

    /**
     * Creates new form outdata
     */
    public admindata() {
        initComponents();
        
    }
        Statement st;
        Connection con = Koneksi.getKoneksi();
        ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTambah = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTambah1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtTambah2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTambah3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTambah.setBackground(new java.awt.Color(51, 51, 51));
        txtTambah.setForeground(new java.awt.Color(255, 255, 255));
        txtTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTambahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTambahMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTambahMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTambahMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("D A T A    L O G I N");

        javax.swing.GroupLayout txtTambahLayout = new javax.swing.GroupLayout(txtTambah);
        txtTambah.setLayout(txtTambahLayout);
        txtTambahLayout.setHorizontalGroup(
            txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambahLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        txtTambahLayout.setVerticalGroup(
            txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambahLayout.createSequentialGroup()
                    .addGap(0, 48, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 49, Short.MAX_VALUE)))
        );

        jPanel1.add(txtTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 590, 140));

        txtTambah1.setBackground(new java.awt.Color(51, 51, 51));
        txtTambah1.setForeground(new java.awt.Color(255, 255, 255));
        txtTambah1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTambah1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTambah1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTambah1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTambah1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTambah1MousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("D A T A     M E N U");

        javax.swing.GroupLayout txtTambah1Layout = new javax.swing.GroupLayout(txtTambah1);
        txtTambah1.setLayout(txtTambah1Layout);
        txtTambah1Layout.setHorizontalGroup(
            txtTambah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(txtTambah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambah1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        txtTambah1Layout.setVerticalGroup(
            txtTambah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(txtTambah1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambah1Layout.createSequentialGroup()
                    .addGap(0, 43, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 44, Short.MAX_VALUE)))
        );

        jPanel1.add(txtTambah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, 130));

        txtTambah2.setBackground(new java.awt.Color(51, 51, 51));
        txtTambah2.setForeground(new java.awt.Color(255, 255, 255));
        txtTambah2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTambah2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTambah2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTambah2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTambah2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTambah2MousePressed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("D A T A      P E N J U A L A N");

        javax.swing.GroupLayout txtTambah2Layout = new javax.swing.GroupLayout(txtTambah2);
        txtTambah2.setLayout(txtTambah2Layout);
        txtTambah2Layout.setHorizontalGroup(
            txtTambah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(txtTambah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambah2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        txtTambah2Layout.setVerticalGroup(
            txtTambah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
            .addGroup(txtTambah2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambah2Layout.createSequentialGroup()
                    .addGap(0, 48, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 49, Short.MAX_VALUE)))
        );

        jPanel1.add(txtTambah2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, 140));

        txtTambah3.setBackground(new java.awt.Color(51, 51, 51));
        txtTambah3.setForeground(new java.awt.Color(255, 255, 255));
        txtTambah3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtTambah3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTambah3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtTambah3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTambah3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTambah3MousePressed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(51, 51, 51));
        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("L O G    O U T");

        javax.swing.GroupLayout txtTambah3Layout = new javax.swing.GroupLayout(txtTambah3);
        txtTambah3.setLayout(txtTambah3Layout);
        txtTambah3Layout.setHorizontalGroup(
            txtTambah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
            .addGroup(txtTambah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambah3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        txtTambah3Layout.setVerticalGroup(
            txtTambah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(txtTambah3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambah3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(txtTambah3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 130, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pesan1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 880, 550));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambahMouseClicked
        // TODO add your handling code here:
        new outdata().setVisible(true);
        
    }//GEN-LAST:event_txtTambahMouseClicked

    private void txtTambahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambahMouseEntered
        // TODO add your handling code here:
        txtTambah.setBackground(new Color(64, 64, 64));
    }//GEN-LAST:event_txtTambahMouseEntered

    private void txtTambahMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambahMouseExited
        // TODO add your handling code here:
        txtTambah.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_txtTambahMouseExited

    private void txtTambahMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambahMousePressed
        // TODO add your handling code here:
        txtTambah.setBackground(new Color(112,112,112));
    }//GEN-LAST:event_txtTambahMousePressed

    private void txtTambah1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah1MouseClicked
        // TODO add your handling code here:
        new outmenu().setVisible(true);
        
    }//GEN-LAST:event_txtTambah1MouseClicked

    private void txtTambah1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah1MouseEntered
        // TODO add your handling code here:
        txtTambah1.setBackground(new Color(64, 64, 64));
    }//GEN-LAST:event_txtTambah1MouseEntered

    private void txtTambah1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah1MouseExited
        // TODO add your handling code here:
        txtTambah1.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_txtTambah1MouseExited

    private void txtTambah1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah1MousePressed
        // TODO add your handling code here:
        txtTambah1.setBackground(new Color(112,112,112));
    }//GEN-LAST:event_txtTambah1MousePressed

    private void txtTambah2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah2MouseClicked
        // TODO add your handling code here:
        new outpenjualan().setVisible(true);
    }//GEN-LAST:event_txtTambah2MouseClicked

    private void txtTambah2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah2MouseEntered
        // TODO add your handling code here:
        txtTambah2.setBackground(new Color(64, 64, 64));
    }//GEN-LAST:event_txtTambah2MouseEntered

    private void txtTambah2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah2MouseExited
        // TODO add your handling code here:
        txtTambah2.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_txtTambah2MouseExited

    private void txtTambah2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah2MousePressed
        // TODO add your handling code here:
        txtTambah2.setBackground(new Color(112,112,112));
    }//GEN-LAST:event_txtTambah2MousePressed

    private void txtTambah3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah3MouseClicked
        // TODO add your handling code here:
            setVisible(false);
            new awal().setVisible(true);
    }//GEN-LAST:event_txtTambah3MouseClicked

    private void txtTambah3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah3MouseEntered
        // TODO add your handling code here:
        txtTambah3.setBackground(new Color(64, 64, 64));
    }//GEN-LAST:event_txtTambah3MouseEntered

    private void txtTambah3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah3MouseExited
        // TODO add your handling code here:
        txtTambah3.setBackground(new Color(51, 51, 51));
    }//GEN-LAST:event_txtTambah3MouseExited

    private void txtTambah3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambah3MousePressed
        // TODO add your handling code here:
        txtTambah3.setBackground(new Color(112,112,112));
    }//GEN-LAST:event_txtTambah3MousePressed

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
            java.util.logging.Logger.getLogger(admindata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel txtTambah;
    private javax.swing.JPanel txtTambah1;
    private javax.swing.JPanel txtTambah2;
    private javax.swing.JPanel txtTambah3;
    // End of variables declaration//GEN-END:variables
    
}
