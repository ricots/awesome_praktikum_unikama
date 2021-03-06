/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pixel
 */
public class FrmMain extends javax.swing.JFrame {
    Connection conn;
    Statement state;
    ResultSet rs;
    public String idGol, idJab;
    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        awal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Status = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        tabPenggajian = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKaryawan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNik = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNamaKary = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        rbBelumMenikah = new javax.swing.JRadioButton();
        rbMenikah = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtIdGol = new javax.swing.JTextField();
        btnCariGol = new javax.swing.JButton();
        btnCariJab = new javax.swing.JButton();
        txtIdJab = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Data Karyawan");

        tbKaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbKaryawan);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "INPUT DATA KARYAWAN"));

        jLabel2.setText("No Induk Karyawan :");

        jLabel3.setText("Nama Karyawan :");

        jLabel4.setText("Alamat :");

        txtAlamat.setColumns(20);
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        jLabel5.setText("Status :");

        buttonGroup_Status.add(rbBelumMenikah);
        rbBelumMenikah.setText("Belum Menikah");

        buttonGroup_Status.add(rbMenikah);
        rbMenikah.setText("Menikah");

        jLabel6.setText("Id. Golongan :");

        btnCariGol.setText("Cari");
        btnCariGol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariGolActionPerformed(evt);
            }
        });

        btnCariJab.setText("Cari");
        btnCariJab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariJabActionPerformed(evt);
            }
        });

        jLabel7.setText("Id. Jabatan :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamaKary, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbBelumMenikah)
                    .addComponent(rbMenikah)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtIdJab, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdGol, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCariGol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCariJab))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaKary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbBelumMenikah)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMenikah)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtIdGol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariGol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdJab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariJab)))
        );

        btnTambah.setText("+");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Change");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Delete");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancel)
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(194, 194, 194))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah)
                            .addComponent(btnSimpan)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus)
                            .addComponent(btnCancel)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        tabPenggajian.addTab("Karyawan", jPanel1);

        jDesktopPane1.setLayer(tabPenggajian, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPenggajian)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPenggajian, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
       tabel();
    }//GEN-LAST:event_formWindowActivated

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        awal();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda akan menghapus data ini??", "Delete", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            try{
                state = (Statement)koneksi.getkoneksi().createStatement();
                String sql = "DELETE FROM tb_karyawan WHERE nik = '" + txtNik.getText()+"'";
                JOptionPane.showMessageDialog(null, "Data berhasil di hapus");
                state.executeUpdate(sql);
                tabel();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            awal();
        }
        else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Data tidak dihapus!", "Report", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Ubah data??", "Update", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String status;
            if(rbBelumMenikah.isSelected()){
                status = rbBelumMenikah.getText();
            }
            else{
                status = rbMenikah.getText();
            }
            try{
                state = (Statement)koneksi.getkoneksi().createStatement();
                String sql = "UPDATE tb_karyawan SET nama_karyawan='" + txtNamaKary.getText() + "', " + "alamat = '" + txtAlamat.getText() + "', "
                + "status = '" + status + "', " + "id_golongan = '"+ txtIdGol.getText() + "', " + "id_jabatan = '" + txtIdJab.getText() + "'" +
                "WHERE nik = '" + txtNik.getText() + "'";
                JOptionPane.showMessageDialog(null, "Data berhasil diubah");
                state.executeUpdate(sql);
                tabel();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
            awal();
        }
        else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Data batal diubah!", "Report", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Simpan ??", "Save", JOptionPane.YES_NO_OPTION);
        if(confirm == JOptionPane.YES_OPTION){
            String status;
            if(rbBelumMenikah.isSelected()){
                status = rbBelumMenikah.getText();
            }
            else{
                status = rbMenikah.getText();
            }

            try{
                state = (Statement)koneksi.getkoneksi().createStatement();
                String sql = "INSERT INTO tb_karyawan(" + "nik," + "nama_karyawan," +
                "alamat, " + "status," + "id_golongan," + "id_jabatan)" + "values ('" +
                txtNik.getText() + "', '" + txtNamaKary.getText() + "',"
                + "'" + txtAlamat.getText() +"','" + status +
                "','" + txtIdGol.getText() + "','" + txtIdJab.getText() + "')";

                state.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Penyimpanan Berhasil");
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            awal();
        }
        else if(confirm == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this, "Data tidak tersimpan!", "Report", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        AutoNIK();
        txtNik.setEditable(true);
        txtNamaKary.setEditable(true);
        txtAlamat.setEditable(true);
        rbBelumMenikah.setEnabled(true);
        rbMenikah.setEnabled(true);
        btnSimpan.setEnabled(true);
        btnTambah.setEnabled(false);
        btnCancel.setEnabled(true);
        btnCariGol.setEnabled(true);
        btnCariJab.setEnabled(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCariJabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariJabActionPerformed
        // TODO add your handling code here:
        FrmCariJabatan FCJ = new FrmCariJabatan();
        FCJ.FM = this;
        FCJ.setVisible(true);
        FCJ.setResizable(false);
    }//GEN-LAST:event_btnCariJabActionPerformed

    private void btnCariGolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariGolActionPerformed
        // TODO add your handling code here:
        FrmCariGolongan FCG = new FrmCariGolongan();
        FCG.FM = this;
        FCG.setVisible(true);
        FCG.setResizable(false);
    }//GEN-LAST:event_btnCariGolActionPerformed

    private void tbKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKaryawanMouseClicked
        // TODO add your handling code here:
        int row = tbKaryawan.getSelectedRow();
        txtNik.setText((String)tbKaryawan.getValueAt(row, 0));
        txtNamaKary.setText((String)tbKaryawan.getValueAt(row, 1));
        txtAlamat.setText((String)tbKaryawan.getValueAt(row, 2));
        if(tbKaryawan.getValueAt(row, 3).equals("Menikah")){
            rbMenikah.isSelected();
        }
        else{
            rbBelumMenikah.isSelected();
        }
        txtIdGol.setText((String)tbKaryawan.getValueAt(row, 4));
        txtIdJab.setText((String)tbKaryawan.getValueAt(row, 5));
        txtNamaKary.setEditable(true);
        txtAlamat.setEditable(true);
        rbBelumMenikah.setEnabled(true);
        rbMenikah.setEnabled(true);
        btnUbah.setEnabled(true);
        btnHapus.setEnabled(true);
        btnTambah.setEnabled(false);
        btnCancel.setEnabled(true);
        btnCariGol.setEnabled(true);
        btnCariJab.setEnabled(true);
    }//GEN-LAST:event_tbKaryawanMouseClicked

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
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }
    public void AutoNIK(){
        try{
           state = (Statement)koneksi.getkoneksi().createStatement();
           String sql= "SELECT MAX(right(nik,3)) AS no FROM tb_karyawan";
           rs = state.executeQuery(sql);
           while(rs.next()){

               if(rs.first() == false) {
                       txtNik.setText("K001");
               }
               else{
                      rs.last();
                      int auto_id = rs.getInt(1) + 1;
                      String no = String.valueOf(auto_id);
                      int noLong = no.length();

                      for(int a = 0; a < 3-noLong; a++){

                           no = "0" + no;
                      }
                      txtNik.setText("K" + no);

               }        
          }
          rs.close();
          state.close();
          txtNik.setEditable(false);
        }    
        catch (Exception e){
               JOptionPane.showMessageDialog(this, "ERROR: \n" + e.toString(),"Kesalahan", JOptionPane.WARNING_MESSAGE);
        } 
    }
   
    public void awal(){
        txtNik.setEditable(false);
        txtAlamat.setEditable(false);
        txtNamaKary.setEditable(false);
        txtIdGol.setEditable(false);
        txtIdJab.setEditable(false);
        btnSimpan.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnTambah.setEnabled(true);
        btnCancel.setEnabled(false);
        btnCariGol.setEnabled(false);
        btnCariJab.setEnabled(false);
        rbBelumMenikah.setEnabled(false);
        rbMenikah.setEnabled(false);
        txtNik.setText("");
        txtAlamat.setText("");
        txtNamaKary.setText("");
        txtIdGol.setText("");
        txtIdJab.setText("");
    }
    
    public void tabel(){
        DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("No. Induk");
            tbl.addColumn("Nama");
            tbl.addColumn("Alamat");
            tbl.addColumn("Status");
            tbl.addColumn("Id. Golongan");
            tbl.addColumn("Id. Jabatan");
        tbKaryawan.setModel(tbl);
        try{
            state = (Statement)koneksi.getkoneksi().createStatement();
            String sql = "SELECT * FROM tb_karyawan ORDER BY nik ASC";
            rs = state.executeQuery(sql);
            while (rs.next()){
                tbl.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)});
                tbKaryawan.setModel(tbl);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
   
    public String getID(){
        return idGol;
    }
       
    public void pilihGolongan(){
        FrmCariGolongan FCG = new FrmCariGolongan();
        FCG.FM = this;
        txtIdGol.setText(idGol);        
    }
    
    public String getID2(){
        return idJab;
    }
       
    public void pilihJabatan(){
        FrmCariJabatan FCG = new FrmCariJabatan();
        FCG.FM = this;
        txtIdJab.setText(idJab);        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCariGol;
    private javax.swing.JButton btnCariJab;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.ButtonGroup buttonGroup_Status;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbBelumMenikah;
    private javax.swing.JRadioButton rbMenikah;
    private javax.swing.JTabbedPane tabPenggajian;
    private javax.swing.JTable tbKaryawan;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtIdGol;
    private javax.swing.JTextField txtIdJab;
    private javax.swing.JTextField txtNamaKary;
    private javax.swing.JTextField txtNik;
    // End of variables declaration//GEN-END:variables
}
