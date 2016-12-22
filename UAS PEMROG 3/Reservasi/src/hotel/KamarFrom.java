/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jovi MONG
 */
public class KamarFrom extends javax.swing.JFrame {
    
    Connection con;
    ResultSet rs;
    Statement st;
    CekIn CI=null;
    

    /**
     * Creates new form KamarFrom
     */
    public KamarFrom() {
        
        initComponents();
        tabel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jTabbedPane1.addTab("Ekonomi", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jTabbedPane1.addTab("VIP", jScrollPane2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jTabbedPane1.addTab("VVIP", jScrollPane3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 337;
        gridBagConstraints.ipady = 68;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 137, 0);
        getContentPane().add(jTabbedPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int tbl=jTable1.getSelectedRow();
        CI.kelas=jTable1.getValueAt(tbl, 1).toString();
        CI.nomor=jTable1.getValueAt(tbl, 2).toString();
        CI.harga=jTable1.getValueAt(tbl, 3).toString();
        CI.pilihKamar();
        this.dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int tbl2=jTable2.getSelectedRow();
        CI.kelas=jTable2.getValueAt(tbl2, 1).toString();
        CI.nomor=jTable2.getValueAt(tbl2, 2).toString();
        CI.harga=jTable2.getValueAt(tbl2, 3).toString();
        CI.pilihKamar();
        this.dispose();
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        int tbl3=jTable3.getSelectedRow();
        CI.kelas=jTable3.getValueAt(tbl3, 1).toString();
        CI.nomor=jTable3.getValueAt(tbl3, 2).toString();
        CI.harga=jTable3.getValueAt(tbl3, 3).toString();
        CI.pilihKamar();
        this.dispose();
    }//GEN-LAST:event_jTable3MouseClicked

    /**
     * @param args the command line arguments
     */
    
    public void tabel(){
     DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("Nama");
            tbl.addColumn("Kelas");
            tbl.addColumn("Nomor");
            tbl.addColumn("Harga");
            tbl.addColumn("Keterangan");
        jTable1.setModel(tbl);
        try{
            st = (Statement) koneksi.getkoneksi().createStatement();
            String sql = "select nama,kelas,nomor,harga, keterangan from kamar where kelas='ekonomi' and keterangan ='tersedia'";
            rs = st.executeQuery(sql);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)});
                jTable1.setModel(tbl);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
    
    DefaultTableModel tbl2 = new DefaultTableModel();
            tbl2.addColumn("Nama");
            tbl2.addColumn("Kelas");
            tbl2.addColumn("Nomor");
            tbl2.addColumn("Harga");
            tbl2.addColumn("Keterangan");
        jTable2.setModel(tbl2);
        try{
            st = (Statement) koneksi.getkoneksi().createStatement();
            String sql = "select nama,kelas,nomor,harga,keterangan from kamar where kelas='VIP' and keterangan='tersedia'";
            rs = st.executeQuery(sql);
            while (rs.next()){
                tbl2.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)});
                jTable2.setModel(tbl2);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
        
        DefaultTableModel tbl3 = new DefaultTableModel();
            tbl3.addColumn("Nama");
            tbl3.addColumn("Kelas");
            tbl3.addColumn("Nomor");
            tbl3.addColumn("Harga");
            tbl3.addColumn("Keterangan");
        jTable3.setModel(tbl3);
        try{
            st = (Statement) koneksi.getkoneksi().createStatement();
            String sql = "select nama,kelas,nomor,harga,keterangan from kamar where kelas='VVIP' and keterangan='tersedia'";
            rs = st.executeQuery(sql);
            while (rs.next()){
                tbl3.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)});
                jTable3.setModel(tbl3);
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            
        }
 }
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
            java.util.logging.Logger.getLogger(KamarFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KamarFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KamarFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KamarFrom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KamarFrom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
