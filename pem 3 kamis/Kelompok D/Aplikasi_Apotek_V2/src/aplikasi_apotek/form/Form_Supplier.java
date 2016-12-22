
package aplikasi_apotek.form;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Supplier extends javax.swing.JFrame {
    
    Connection con;
    ResultSet rss;
    java.sql.Statement stt;

    public Form_Supplier() {
        initComponents();
        this.tampildata();
        this.setLocationRelativeTo(null);
        
        number();
        
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
    }
    
    public void koneksidatabase(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            System.out.println("Koneksi ke MySQL Server berhasil!");
        }catch(ClassNotFoundException eclass){
            System.out.println("Driver tidak ada!");
        }catch(SQLException esql){
            System.out.println(esql.getMessage());
        }
    }
    
    public void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/apotek", "root", "");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            System.out.println(e.getMessage());

        }
    }
    
    public void simpandata(){
        try {
            koneksidatabase();
            Statement st = (Statement) con.createStatement();
            st.executeUpdate ("insert into supplier (id_supplier, nama_supplier) values (" 
                    +"'"+Tid.getText()+"',"
                    +"'"+Tnama.getText()+"')");
            System.out.println("Input data berhasil!");
            this.tampildata();
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     tampildata();
    }
    
    final void tampildata(){
        Object [][] isitabel = null;
        String [] Judul = {"Id Supplier","Nama", "Telp", "Email", "Alamat"};
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek","root","");
            Statement st = (Statement) konek.createStatement();
            ResultSet rs = st.executeQuery("select * from supplier");
            
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            int kolom = rsmd.getColumnCount();
            int baris = 0;
            while (rs.next()){
                baris = rs.getRow();
            }
            isitabel = new String[baris][kolom];
            int x = 0;
            rs.beforeFirst();
            while(rs.next()){
                isitabel[x][0] = rs.getString("id_supplier");
                isitabel[x][1] = rs.getString("nama_supplier");
                isitabel[x][2] = rs.getString("telp");
                isitabel[x][3] = rs.getString("email");
                isitabel[x][4] = rs.getString("alamat");
                x++;
            }
            tabelSupplier.setModel(new DefaultTableModel(isitabel,Judul));
        }
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSupplier = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Bsave = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        Tnama = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Ttelp = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Temail = new javax.swing.JTextField();
        Talamat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tcari = new javax.swing.JTextField();
        Bcari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tabelSupplier.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Supplier", "Nama ", "Telp", "Email", "Alamat"
            }
        ));
        tabelSupplier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelSupplierMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelSupplier);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 696;
        gridBagConstraints.ipady = 162;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 11, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA SUPPLIER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 236, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        Bsave.setText("SAVE");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 0, 10);
        getContentPane().add(Bsave, gridBagConstraints);

        Bedit.setText("EDIT");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 10, 0, 10);
        getContentPane().add(Bedit, gridBagConstraints);

        Bdelete.setText("DELETE");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 215;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 10);
        getContentPane().add(Bdelete, gridBagConstraints);

        Bclear.setText("CLEAR");
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 219;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        getContentPane().add(Bclear, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 35, 0, 0);
        getContentPane().add(Tnama, gridBagConstraints);

        jLabel6.setText("Nama Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        Tid.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 35, 0, 0);
        getContentPane().add(Tid, gridBagConstraints);

        jLabel9.setText("Id Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 229;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        getContentPane().add(jButton1, gridBagConstraints);

        jLabel2.setText("Telp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 10, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 35, 0, 0);
        getContentPane().add(Ttelp, gridBagConstraints);

        jLabel3.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 35, 0, 0);
        getContentPane().add(Temail, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 35, 0, 0);
        getContentPane().add(Talamat, gridBagConstraints);

        jLabel5.setText("Cari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 35, 0, 0);
        getContentPane().add(Tcari, gridBagConstraints);

        Bcari.setText("SEARCH");
        Bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 211;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        getContentPane().add(Bcari, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        simpandata(); 
        number();;
        
        Tnama.setText("");

        
    }//GEN-LAST:event_BsaveActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed
            
            String id   = Tid.getText();
            String nama = Tnama.getText();
            String telp = Ttelp.getText();
            String email = Temail.getText();
            String alamat = Talamat.getText();

            try {
                koneksidatabase();
                try (Statement statement = (Statement) con.createStatement()) {
                statement.executeUpdate("UPDATE supplier " 
                        + "SET " 
                        + "nama_supplier = '" +nama+ "'," 
                        + "telp = '" +  telp+ "'," 
                        + "email = '" +  email+ "'," 
                        + "alamat = '" +  alamat+ "'" 
                        + "WHERE " 
                        + "id_supplier = '" +id+ "';");
            }

                System.out.println("Edit data berhasil!");

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            tampildata();
    }//GEN-LAST:event_BeditActionPerformed

    private void tabelSupplierMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelSupplierMouseClicked
         
        Bedit.setEnabled(true);
        Bdelete.setEnabled(true);
        Bsave.setEnabled(false);
        
        int row = tabelSupplier.getSelectedRow();
        Tid.setText((String)tabelSupplier.getValueAt(row, 0));
        Tnama.setText((String)tabelSupplier.getValueAt(row, 1));
        Ttelp.setText((String)tabelSupplier.getValueAt(row, 2));
        Temail.setText((String)tabelSupplier.getValueAt(row, 3));
        Talamat.setText((String)tabelSupplier.getValueAt(row, 4));

    }//GEN-LAST:event_tabelSupplierMouseClicked

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        String id = Tid.getText(); 
        
        int ok = JOptionPane.showConfirmDialog(null,
                "Apakah yakin menghapus data ini?", 
                "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
        
            try {
                koneksidatabase();
                Statement statement = (Statement) con.createStatement();
                statement.executeUpdate("delete from supplier where id_supplier= ('"+id+"');");
                System.out.println("Hapus data berhasil!");
                }catch (Exception t) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus");
                } 
                tampildata();
                Tnama.setText("");

       }
    }//GEN-LAST:event_BdeleteActionPerformed
    
    public void number(){
      try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                        +"localhost/apotek","root","");
            Statement stt = (Statement) konek.createStatement();
            String sql= "SELECT MAX(right(id_supplier,3)) AS no FROM supplier";
            rss = stt.executeQuery(sql);
        
            while(rss.next()){
            if(rss.first() == false){   
            Tid.setText("ID-0001");
            }
                else{
                   rss.last();
                   int auto_id = rss.getInt(1) + 1;
                   String no = String.valueOf(auto_id);
                   int noLong = no.length();
                   //MENGATUR jumlah 0
                   
                   for(int a=0;a<4-noLong;a++){ 
                        no = "0" + no;
                   }
                   Tid.setText("SP-" + no);
                 }        
            }
       rss.close();
       stt.close();
        }    
      
    catch (Exception e){
            JOptionPane.showMessageDialog(this, "ERROR: \n" + e.toString(),
                            "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }    
    
    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        Bsave.setEnabled(true);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
        
        Tnama.setText("");
        Tcari.setText("");
        
        tampildata();
        number();
    }//GEN-LAST:event_BclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
    
    }//GEN-LAST:event_formWindowActivated

    private void BcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcariActionPerformed
    DefaultTableModel tabelTampil1 = new DefaultTableModel();
    tabelTampil1.addColumn("Id Supplier");
    tabelTampil1.addColumn("Nama Supplier ");
    tabelTampil1.addColumn("Telp ");
    tabelTampil1.addColumn("Email");
    tabelTampil1.addColumn("Alamat");
        try{
            
            
            koneksi(); 
            String sql = "select * from supplier where "
                    + "id_supplier like '%" + Tcari.getText() + "%'" 
                    + "or nama_supplier like '%" + Tcari.getText() + "%'" 
                    + "or telp like '%" + Tcari.getText() + "%'" 
                    + "or email like '%" + Tcari.getText() + "%'" 
                    + "or alamat like '%" + Tcari.getText() + "%'";
            stt = con.createStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
            tabelTampil1.addRow(new Object[]{
            rs.getString(1),
            rs.getString(2),
            rs.getString(3),
            rs.getString(4),
            rs.getString(5),
            });
            }
            tabelSupplier.setModel(tabelTampil1);

                }catch (Exception e){
            }
    }//GEN-LAST:event_BcariActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Form_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Form_Supplier().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcari;
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bsave;
    private javax.swing.JTextField Talamat;
    private javax.swing.JTextField Tcari;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Ttelp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelSupplier;
    // End of variables declaration//GEN-END:variables
}
