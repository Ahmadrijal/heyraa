package Tubes;

import Koneksi.Koneksi;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class outdata extends javax.swing.JFrame {

    /**
     * Creates new form outdata
     */
    public outdata() {
        initComponents();
        tabelData();
        tbldata.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)tbldata.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        tbldata.setForeground(Color.WHITE);
        scroll.setBackground(new Color(0,0,0,0));
        scroll.setOpaque(false);
         tbldata.setOpaque(false);
            ((DefaultTableCellRenderer)tbldata.getDefaultRenderer(Object.class)).setOpaque(false);
        scroll.getViewport().setOpaque(false);
        tbldata.setShowGrid(true);
    }
        Statement st;
        Connection con = Koneksi.getKoneksi();
        ResultSet rs;
        DefaultComboBoxModel modelc;
        DefaultTableModel model;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        tbldata = new javax.swing.JTable();
        txtTambah = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(18, 18, 18));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBackground(new java.awt.Color(18, 18, 18));
        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tbldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "Nama Barang", "Harga", "Jumlah", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(tbldata);

        jPanel1.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 80));

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
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("E X I T");

        javax.swing.GroupLayout txtTambahLayout = new javax.swing.GroupLayout(txtTambah);
        txtTambah.setLayout(txtTambahLayout);
        txtTambahLayout.setHorizontalGroup(
            txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambahLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        txtTambahLayout.setVerticalGroup(
            txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(txtTambahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(txtTambahLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(txtTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 100, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTambahMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        new admindata().setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(outdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(outdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(outdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(outdata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new outdata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable tbldata;
    private javax.swing.JPanel txtTambah;
    // End of variables declaration//GEN-END:variables
    private void tabelData() {
        String[] judul = {"Username","Password"};
        model = new DefaultTableModel(judul,0);
        tbldata.setModel(model);
        String sql = "SELECT*FROM admin";
        
        try {
            rs = con.createStatement().executeQuery(sql);
            
            while(rs.next()) {
               String username = rs.getString("username");
               String password = rs.getString("password");
               
                               
               String[] data = {username,password};
               model.addRow(data);
           }
        }catch(Exception e) {
           System.out.println(e);
        }
    }
}