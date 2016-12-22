
package absensi_siswa_smp;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Data_Kelas extends javax.swing.JFrame {
    private Connection koneksi;
    private koneksi db = new koneksi();
    Connection cnn;
    ResultSet rss;
    Statement stt;
    public Data_Kelas() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttingkat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnik = new javax.swing.JTextField();
        tsimpan = new javax.swing.JButton();
        tedit = new javax.swing.JButton();
        thapus = new javax.swing.JButton();
        ttampil = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtable = new javax.swing.JTable();
        tkembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 102));

        jPanel1.setBackground(new java.awt.Color(0, 204, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATA KELAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("SMP NEGERI 01 LABUAN BAJO");

        jLabel3.setText("KODE KELAS");

        jLabel4.setText("TINGKAT");

        jLabel5.setText("NIK");

        tsimpan.setText("Simpan");
        tsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsimpanActionPerformed(evt);
            }
        });

        tedit.setText("Edit");
        tedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teditActionPerformed(evt);
            }
        });

        thapus.setText("Hapus");
        thapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thapusActionPerformed(evt);
            }
        });

        ttampil.setText("Tampilkan");
        ttampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttampilActionPerformed(evt);
            }
        });

        jtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KODE KELAS", "TINGKAT", "NIK"
            }
        ));
        jScrollPane3.setViewportView(jtable);

        tkembali.setText("Kembali");
        tkembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tkembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1))
                    .addComponent(jLabel2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txttingkat, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tedit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(thapus, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ttampil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tkembali, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(313, 313, 313))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsimpan)
                    .addComponent(tedit)
                    .addComponent(thapus)
                    .addComponent(ttampil)
                    .addComponent(tkembali))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsimpanActionPerformed
        // TODO add your handling code here:

        if (txtkode.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukan Kode Kelas");
        } else if (txttingkat.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukan Tingkat");
        } else if (txtnik.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukan NIK");
        
        } else {
            db.dbConnection();
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("KODE KELAS");
            tbl.addColumn("TINGKAT");
            tbl.addColumn("NIK");
            jtable.setModel(tbl);
            try {
                stt = (Statement) db.getConnection().createStatement();
                String sql = "INSERT INTO tb_kelas VALUES "
                        + "('" + txtkode.getText() + "', '" + txttingkat.getText()
                        + "','" + txtnik.getText() + "');";
                stt.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Dimasukan");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Data Gagal Dimasukan");
                System.out.println(e.getMessage());
            }
            Tampil();
            Kosong();
        }
    }//GEN-LAST:event_tsimpanActionPerformed

    private void teditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teditActionPerformed
        // TODO add your handling code here:

        if (txtkode.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukan Kode Kelas");
        } else if (txttingkat.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukan Tingkat");
        } else if (txtnik.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Masukan NIK");
        } else {


            db.dbConnection();
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("KODE KELAS");
            tbl.addColumn("TINGKAT");
            tbl.addColumn("NIK");
            jtable.setModel(tbl);
            try {
                stt = (Statement) db.getConnection().createStatement();
                String sql = "UPDATE tb_kelas set kd_kelas = '" + txttingkat.getText()
                        + "',tingkat ='" + txtnik.getText()
                        + "',nik ='" + "';";

                stt.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Data Berhasil Update");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Data Gagal Update");
                System.out.println(e.getMessage());
            }
            Tampil();
            Kosong();
        }
    }//GEN-LAST:event_teditActionPerformed

    private void thapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thapusActionPerformed
        // TODO add your handling code here:
        db.dbConnection();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("KODE KELAS");
        tbl.addColumn("TINGKAT");
        tbl.addColumn("NIK");
        jtable.setModel(tbl);
        try {
            stt = (Statement) db.getConnection().createStatement();
            String sql = "Delete from tb_kelas where nis='" + txtkode.getText()
                    + "' OR tingkat='" + txttingkat.getText() + "';";

            stt.executeUpdate(sql);
            JOptionPane.showMessageDialog(rootPane, "Data Berhasil Di Hapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Data Gagal Di Hapus");
            System.out.println(e.getMessage());
        }
        Tampil();
        Kosong();
    }//GEN-LAST:event_thapusActionPerformed

    private void ttampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttampilActionPerformed
        // TODO add your handling code here:
        Tampil();
    }//GEN-LAST:event_ttampilActionPerformed

    private void tkembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tkembaliActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_tkembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Data_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Kelas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Data_Kelas().setVisible(true);
            }
        });
    }
     public void Tampil(){
     
      db.dbConnection();
        DefaultTableModel tbl = new DefaultTableModel();
        tbl.addColumn("KODE KELAS");
        tbl.addColumn("TINGKAT");
        tbl.addColumn("NIK");        
        jtable.setModel(tbl);
        try{
            String sql = "select * from tb_kelas";
            Statement st = db.getConnection().createStatement();
            ResultSet res = st.executeQuery(sql);
            while (res.next()){
                tbl.addRow(new Object[]{
                    res.getString(1),
                    res.getString(2),
                    res.getString(3),});
                   
            jtable.setModel(tbl);
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
         
     }
     public void Kosong(){
    txtkode.setText("");    
    txttingkat.setText("");    
    txtnik.setText("");
    
    }



    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtable;
    private javax.swing.JButton tedit;
    private javax.swing.JButton thapus;
    private javax.swing.JButton tkembali;
    private javax.swing.JButton tsimpan;
    private javax.swing.JButton ttampil;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnik;
    private javax.swing.JTextField txttingkat;
    // End of variables declaration//GEN-END:variables
}
