package internal;

//import aplikasi_apotek.form.pilih.Internal_PilihSupplier;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class Internal_Obat extends javax.swing.JInternalFrame {
    
    Connection con;
    ResultSet st;
    java.sql.Statement stt;
    
    public Internal_Obat() {
        initComponents();
        this.tampildata();
        
        auto();
        
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);
    }
    
    public void koneksidatabase(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/apotek2","root","");
            System.out.println("Koneksi ke MySQL Server berhasil!");
        }catch(ClassNotFoundException eclass){
            System.out.println("Driver tidak ada!");
        }catch(SQLException esql){
            System.out.println(esql.getMessage());
        }
    }
    
    public void simpandata(){
        
        if (Tid.getText().equals("") 
            || Tnama.getText().equals("")
            || Tstok.getText().equals("") 
            || Tbeli.getText().equals("") 
            || Tjual.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan lengkapi data terlebih dahulu !!! ");
        } else{
        try {
            koneksidatabase();
            Statement st = (Statement) con.createStatement();
            st.executeUpdate ("insert into obat (id_obat, nama_obat, stok_obat, "
                    + "hbeli_obat, hjual_obat, tgl_masuk, tgl_expired) values (" 
                    +"'"+Tid.getText()+"',"
                    +"'"+Tnama.getText()+"',"
                    +"'"+Tstok.getText()+"',"
                    +"'"+Tbeli.getText()+"',"
                    +"'"+Tjual.getText()+"',"
                    +"'"+Tmasuk.getText()+"',"
                    +"'"+Texpired.getText()+"')");
            System.out.println("Input data berhasil!");
            this.tampildata();
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     tampildata();
    }
    }
    
    public final void auto(){
      try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                        +"localhost/apotek2","root","");
            Statement stt = (Statement) konek.createStatement();
            String sql= "SELECT MAX(right(id_obat,3)) AS kode FROM obat";
            st = stt.executeQuery(sql);
        
            while(st.next()){
            if(st.first() == false){   
            Tid.setText("ID-0001");
            }
                else{
                   st.last();
                   int auto_id = st.getInt(1) + 1;
                   String no = String.valueOf(auto_id);
                   int noLong = no.length();
                   //MENGATUR jumlah 0
                   
                   for(int a=0;a<4-noLong;a++){ 
                        no = "0" + no;
                   }
                   
                   Tid.setText("OB-" + no);
                 }        
            }
       st.close();
       stt.close();
        }    
      
    catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e){
            JOptionPane.showMessageDialog(this, "ERROR: \n" + e.toString(),
                            "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
    }    
    
    final void tampildata(){
        Object [][] isitabel = null;
        String [] Judul = {"Id Obat", "Nama Obat", "Stok Obat", 
            "Harga Beli", "Harga Jual", "Tgl Masuk", "Tgl Expired"};
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek2","root","");
            Statement st = (Statement) konek.createStatement();
            ResultSet rs = st.executeQuery("select * from obat");
            
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
                isitabel[x][0] = rs.getString("id_obat");
                isitabel[x][1] = rs.getString("nama_obat");
                isitabel[x][2] = rs.getString("stok_obat");
                isitabel[x][3] = rs.getString("hbeli_obat");
                isitabel[x][4] = rs.getString("hjual_obat");
                isitabel[x][5] = rs.getString("tgl_masuk");
                isitabel[x][6] = rs.getString("tgl_expired");
                x++;
            }
            tabelObat.setModel(new DefaultTableModel(isitabel,Judul));
        }
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelObat = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Tnama = new javax.swing.JTextField();
        Tbeli = new javax.swing.JTextField();
        Tjual = new javax.swing.JTextField();
        Tstok = new javax.swing.JTextField();
        Bsave = new javax.swing.JButton();
        Bedit = new javax.swing.JButton();
        Bdelete = new javax.swing.JButton();
        Bclear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Tmasuk = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Texpired = new javax.swing.JTextField();
        Tid = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Bcari = new javax.swing.JButton();
        Tcari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);

        tabelObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Obat", "Id Supplier", "Kode Obat", "Nama Obat", "Stok Obat", "Harga Beli", "Harga Jual", "Tgl Masuk", "Tgl Expired"
            }
        ));
        tabelObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelObat);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA OBAT");

        jLabel2.setText("Nama Obat");

        jLabel3.setText("Harga Beli");

        jLabel4.setText("Harga Jual");

        jLabel5.setText("Stok Obat");

        Bsave.setText("SAVE");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });

        Bedit.setText("EDIT");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });

        Bdelete.setText("DELETE");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });

        Bclear.setText("CLEAR");
        Bclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BclearActionPerformed(evt);
            }
        });

        jLabel7.setText("Tgl Masuk");

        jLabel8.setText("Tgl Expired");

        Texpired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TexpiredActionPerformed(evt);
            }
        });

        Tid.setEditable(false);

        jLabel9.setText("Id Obat");

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Bcari.setText("SEARCH");
        Bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcariActionPerformed(evt);
            }
        });

        jLabel6.setText("Cari");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(38, 38, 38)
                        .addComponent(Tstok, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(38, 38, 38)
                        .addComponent(Tbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(35, 35, 35)
                        .addComponent(Tjual, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39)
                        .addComponent(Tmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33)
                        .addComponent(Texpired, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(222, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(325, 325, 325)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(49, 49, 49)
                            .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(Bsave, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(Bclear, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(Bdelete, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(Bedit, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(418, 418, 418)
                            .addComponent(jLabel6)
                            .addGap(10, 10, 10)
                            .addComponent(Tcari))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(414, 414, 414)
                            .addComponent(Bcari, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(Tnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Tstok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Tbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Tjual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tmasuk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Texpired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 8, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel9))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Bsave))
                    .addGap(6, 6, 6)
                    .addComponent(Bclear)
                    .addGap(7, 7, 7)
                    .addComponent(Bdelete)
                    .addGap(2, 2, 2)
                    .addComponent(Bedit)
                    .addGap(6, 6, 6)
                    .addComponent(jButton2)
                    .addGap(16, 16, 16)
                    .addComponent(jButton1)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Tcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jLabel6)))
                    .addGap(12, 12, 12)
                    .addComponent(Bcari)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelObatMouseClicked

        Bedit.setEnabled(true);
        Bdelete.setEnabled(true);
        Bsave.setEnabled(false);

        int row = tabelObat.getSelectedRow();
        Tid.setText((String) tabelObat.getValueAt(row, 0));
        Tnama.setText((String) tabelObat.getValueAt(row, 1));
        Tstok.setText((String) tabelObat.getValueAt(row, 2));
        Tbeli.setText((String) tabelObat.getValueAt(row, 3));
        Tjual.setText((String) tabelObat.getValueAt(row, 4));
        Tmasuk.setText((String) tabelObat.getValueAt(row, 5));
        Texpired.setText((String) tabelObat.getValueAt(row, 6));
    }//GEN-LAST:event_tabelObatMouseClicked

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        simpandata();
        auto();
        
        Tnama.setText("");
        Tstok.setText("");
        Tbeli.setText("");
        Tjual.setText("");
        Tmasuk.setText("");
        Texpired.setText("");

    }//GEN-LAST:event_BsaveActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed

        String id = Tid.getText();
        String nama = Tnama.getText();
        String stok = Tstok.getText();
        String beli = Tbeli.getText();
        String jual = Tjual.getText();
        String masuk = Tmasuk.getText();
        String expired = Texpired.getText();


        try {
            koneksidatabase();
            try (Statement statement = (Statement) con.createStatement()) {
                statement.executeUpdate("UPDATE obat "
                        + "SET "
                        + "nama_obat = '" + nama + "',"
                        + "stok_obat = '" + stok + "',"
                        + "hbeli_obat = '" + beli + "',"
                        + "hjual_obat = '" + jual + "',"
                        + "tgl_masuk = '" + masuk + "',"
                        + "tgl_expired = '" + expired + "'"
                        + "WHERE "
                        + "id_obat = '" + id + "';");
            }

            System.out.println("Edit data berhasil!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "QUERY ERROR!" + ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        tampildata();
    }//GEN-LAST:event_BeditActionPerformed

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        String id = Tid.getText();

        int ok = JOptionPane.showConfirmDialog(null,
                "Apakah yakin menghapus data ini?",
                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {

            try {
                koneksidatabase();
                Statement statement = (Statement) con.createStatement();
                statement.executeUpdate("delete from obat where id_obat= ('" + id + "');");
                System.out.println("Hapus data berhasil!");
            } catch (Exception t) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
            tampildata();

            Tnama.setText("");
            Tbeli.setText("");
            Tjual.setText("");
            Tstok.setText("");
            Tmasuk.setText("");
            Texpired.setText("");
        }
    }//GEN-LAST:event_BdeleteActionPerformed

    private void BclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BclearActionPerformed
        Bsave.setEnabled(true);
        Bedit.setEnabled(false);
        Bdelete.setEnabled(false);

        Tcari.setText("");
        Tnama.setText("");
        Tbeli.setText("");
        Tjual.setText("");
        Tstok.setText("");
        Tmasuk.setText("");
        Texpired.setText("");

        tampildata();
    }//GEN-LAST:event_BclearActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            koneksidatabase();
            Map prs = new HashMap();
            JasperReport jsprt = JasperCompileManager.compileReport("C:/Users/Win 8.1/Documents/NetBeansProjects"
                    + "/Aplikasi_Apotek/laporan/laporan_obat.jrxml");
            JasperPrint jprint = JasperFillManager.fillReport(jsprt, prs, con);
            JasperViewer.viewReport(jprint, false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    
    /*
    public String idSupplier;
    public String getIdSpl() {
        return idSupplier;
    }
    public void itemTerpilih(){
        Internal_PilihSupplier ambil = new Internal_PilihSupplier();
        ambil.fps = this;
        Tidsupplier.setText(idSupplier);
    }
    */
    
    private void BcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcariActionPerformed
        DefaultTableModel tabelTampil1 = new DefaultTableModel();
        tabelTampil1.addColumn("Id Obat");
        tabelTampil1.addColumn("Nama Obat ");
        tabelTampil1.addColumn("Stok Obat");
        tabelTampil1.addColumn("H Beli");
        tabelTampil1.addColumn("H Jual");
        try {
            koneksidatabase();
            String sql = "select * from obat where "
                    + "id_obat like '%" + Tcari.getText() + "%'"
                    + "or nama_obat like '%" + Tcari.getText() + "%'"
                    + "or stok_obat like '%" + Tcari.getText() + "%'"
                    + "or hbeli_obat like '%" + Tcari.getText() + "%'"
                    + "or hjual_obat like '%" + Tcari.getText() + "%'";
            stt = con.createStatement();
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()) {
                tabelTampil1.addRow(new Object[]{
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                        });
            }
            tabelObat.setModel(tabelTampil1);

        } catch (Exception e) {
        }
    }//GEN-LAST:event_BcariActionPerformed

    private void TexpiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TexpiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TexpiredActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcari;
    private javax.swing.JButton Bclear;
    private javax.swing.JButton Bdelete;
    private javax.swing.JButton Bedit;
    private javax.swing.JButton Bsave;
    private javax.swing.JTextField Tbeli;
    private javax.swing.JTextField Tcari;
    private javax.swing.JTextField Texpired;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tjual;
    private javax.swing.JTextField Tmasuk;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tstok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JTable tabelObat;
    // End of variables declaration//GEN-END:variables
}
