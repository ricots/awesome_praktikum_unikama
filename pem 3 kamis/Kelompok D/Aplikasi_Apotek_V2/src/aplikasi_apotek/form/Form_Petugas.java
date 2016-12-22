
package aplikasi_apotek.form;

import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Form_Petugas extends javax.swing.JFrame {
    
    Connection con;
    
    public Form_Petugas() {
        initComponents();
        this.tampildata();
        this.setLocationRelativeTo(null);
        
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPetugas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bAdd = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Tjk = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Ttelp = new javax.swing.JTextField();
        Tusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        Temail = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Talamat = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        Tpassword = new javax.swing.JTextField();
        Bexit = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        tabelPetugas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Petugas", "Username", "Nama Petugas", "Jenis Kelamin", "Email", "Telp", "Alamat"
            }
        ));
        tabelPetugas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPetugasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelPetugas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 29;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 744;
        gridBagConstraints.ipady = 92;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Data Petugas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 12, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(bAdd, gridBagConstraints);

        Bedit.setText("Edit");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 13;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(Bedit, gridBagConstraints);

        Bdelete.setText("Delete");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 14;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(Bdelete, gridBagConstraints);

        jLabel9.setText("Id Petugas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 10, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel7.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 25;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 6, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        getContentPane().add(Tjk, gridBagConstraints);

        jLabel6.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 11, 0);
        getContentPane().add(Ttelp, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 32, 0, 0);
        getContentPane().add(Tusername, gridBagConstraints);

        jLabel2.setText("Nama Petugas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Telp");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        Tid.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 32, 0, 0);
        getContentPane().add(Tid, gridBagConstraints);

        jLabel5.setText("Jenis Kelamin");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 10, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        getContentPane().add(Tnama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        getContentPane().add(Temail, gridBagConstraints);

        Talamat.setColumns(20);
        Talamat.setRows(5);
        jScrollPane2.setViewportView(Talamat);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 26;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 258;
        gridBagConstraints.ipady = 158;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 10, 11, 10);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jLabel8.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 10, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 32, 0, 0);
        getContentPane().add(Tpassword, gridBagConstraints);

        Bexit.setText("Exit");
        Bexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BexitActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 25;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 0);
        getContentPane().add(Bexit, gridBagConstraints);

        Bclear.setText("Clear");
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 15;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(Bclear, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void bersihdata() {
        Tid.setText("");
        Tusername.setText("");
        Tpassword.setText("");
        Tnama.setText("");
        Tjk.setText("");
        Temail.setText("");
        Ttelp.setText("");
        Talamat.setText("");
    }
    
    private void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        simpandata(); 
        bersihdata();
    }//GEN-LAST:event_bAddActionPerformed

    private void tabelPetugasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPetugasMouseClicked
        Bedit.setEnabled(true);
        Bdelete.setEnabled(true);
        bAdd.setEnabled(false);
        
        int row = tabelPetugas.getSelectedRow();
        Tid.setText((String)tabelPetugas.getValueAt(row, 0));
        Tusername.setText((String)tabelPetugas.getValueAt(row, 1));
        Tpassword.setText((String)tabelPetugas.getValueAt(row, 2));
        Tnama.setText((String)tabelPetugas.getValueAt(row, 3));
        Tjk.setText((String)tabelPetugas.getValueAt(row, 4));
        Temail.setText((String)tabelPetugas.getValueAt(row, 5));
        Ttelp.setText((String)tabelPetugas.getValueAt(row, 6));
        Talamat.setText((String)tabelPetugas.getValueAt(row, 7));
    }//GEN-LAST:event_tabelPetugasMouseClicked

    private void BexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BexitActionPerformed
        dispose(); 
    }//GEN-LAST:event_BexitActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed
            String id       = Tid.getText();
            String username = Tusername.getText();
            String password = Tpassword.getText();
            String nama     = Tnama.getText();
            String jk       = Tjk.getText();
            String email    = Temail.getText();
            String telp     = Ttelp.getText();
            String alamat   = Talamat.getText();
            

            try {
                koneksidatabase();
                try (Statement statement = (Statement) con.createStatement()) {
                statement.executeUpdate("UPDATE petugas " 
                        + "SET " 
                        + "id_petugas = '" +id+ "'," 
                        + "username = '" +username+ "'," 
                        + "password = '" +password+ "'," 
                        + "nama_petugas = '" +nama+ "'," 
                        + "jenis_kelamin = '" +  jk+ "'," 
                        + "email = '" +  email+ "'," 
                        + "telp = '" +  telp+ "'," 
                        + "alamat = '" +  alamat+ "'" 
                        + "WHERE " 
                        + "id_petugas = '" +id+ "';");
            }

                System.out.println("Edit data berhasil!");

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            tampildata();
    }//GEN-LAST:event_BeditActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        String id = Tid.getText(); 
        
        int ok = JOptionPane.showConfirmDialog(null,
                "Apakah yakin menghapus data ini?", 
                "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
        
            try {
                koneksidatabase();
                Statement statement = (Statement) con.createStatement();
                statement.executeUpdate("delete from petugas where id_petugas= ('"+id+"');");
                System.out.println("Hapus data berhasil!");
                }catch (Exception t) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus");
                } 
                tampildata();
                bersihdata();
       }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        bAdd.setEnabled(true);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
        
        bersihdata();
    }//GEN-LAST:event_BclearActionPerformed
    
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
    
    public void simpandata(){
        try {
            koneksidatabase();
            Statement st = (Statement) con.createStatement();
            st.executeUpdate ("insert petugas (`username`, "
                    + "`password`,`nama_petugas`, `jenis_kelamin`, "
                    + "`email`, `telp`, `alamat`) values (" 
                    +"'"+Tusername.getText()+"',"
                    +"'"+Tpassword.getText()+"',"
                    +"'"+Tnama.getText()+"',"
                    +"'"+Tjk.getText()+"',"
                    +"'"+Temail.getText()+"',"
                    +"'"+Ttelp.getText()+"',"
                    +"'"+Talamat.getText()+"')");
            System.out.println("Input data berhasil!");
            this.tampildata();
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     tampildata();
    }
    
    final void tampildata(){
        Object [][] isitabel = null;
        String [] Judul = {"Id Petugas","Username", "Password", "Nama Petugas", "Jenis Kelamin", 
            "Email", "Telp", "Alamat"};
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek","root","");
            Statement st = (Statement) konek.createStatement();
            ResultSet rs = st.executeQuery("select * from petugas");
            
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
                isitabel[x][0] = rs.getString("id_petugas");
                isitabel[x][1] = rs.getString("username");
                isitabel[x][2] = rs.getString("password");
                isitabel[x][3] = rs.getString("nama_petugas");
                isitabel[x][4] = rs.getString("jenis_kelamin");
                isitabel[x][5] = rs.getString("email");
                isitabel[x][6] = rs.getString("telp");
                isitabel[x][7] = rs.getString("alamat");
                x++;
            }
            tabelPetugas.setModel(new DefaultTableModel(isitabel,Judul));
        }
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Petugas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Form_Petugas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bexit;
    private javax.swing.JTextArea Talamat;
    private javax.swing.JTextField Temail;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tjk;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tpassword;
    private javax.swing.JTextField Ttelp;
    private javax.swing.JTextField Tusername;
    private javax.swing.JButton bAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelPetugas;
    // End of variables declaration//GEN-END:variables
}
