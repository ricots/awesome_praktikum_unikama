package aplikasi_apotek.form;

import aplikasi_apotek.form.pilih.Form_PilihSupplier;
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

public class Form_Obat extends javax.swing.JFrame {
    
    Connection con;
    ResultSet st;
    java.sql.Statement stt;
    
    public Form_Obat() {
        initComponents();
        this.tampildata();
        this.setLocationRelativeTo(null);
        
        auto();
        
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
    
    public void simpandata(){
        try {
            koneksidatabase();
            Statement st = (Statement) con.createStatement();
            st.executeUpdate ("insert into obat (id_obat, id_supplier, nama_obat, stok_obat, "
                    + "hbeli_obat, hjual_obat, tgl_masuk, tgl_expired) values (" 
                    +"'"+Tid.getText()+"',"
                    +"'"+Tidsupplier.getText()+"',"
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
    
     public final void auto(){
      try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                        +"localhost/apotek","root","");
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
        String [] Judul = {"Id Obat","Id Supplier", "Nama Obat", "Stok Obat", 
            "Harga Beli", "Harga Jual", "Tgl Masuk", "Tgl Expired"};
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek","root","");
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
                isitabel[x][1] = rs.getString("id_supplier");
                isitabel[x][2] = rs.getString("nama_obat");
                isitabel[x][3] = rs.getString("stok_obat");
                isitabel[x][4] = rs.getString("hbeli_obat");
                isitabel[x][5] = rs.getString("hjual_obat");
                isitabel[x][6] = rs.getString("tgl_masuk");
                isitabel[x][7] = rs.getString("tgl_expired");
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
        java.awt.GridBagConstraints gridBagConstraints;

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
        jLabel10 = new javax.swing.JLabel();
        Tidsupplier = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        Bcari = new javax.swing.JButton();
        Tcari = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.gridwidth = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 691;
        gridBagConstraints.ipady = 162;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 27, 10);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA OBAT");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setText("Nama Obat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 10, 0, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setText("Harga Beli");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setText("Harga Jual");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setText("Stok Obat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 0);
        getContentPane().add(jLabel5, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 32, 0, 0);
        getContentPane().add(Tnama, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 32, 0, 0);
        getContentPane().add(Tbeli, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 32, 0, 0);
        getContentPane().add(Tjual, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 32, 0, 0);
        getContentPane().add(Tstok, gridBagConstraints);

        Bsave.setText("SAVE");
        Bsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 243;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 6, 0, 10);
        getContentPane().add(Bsave, gridBagConstraints);

        Bedit.setText("EDIT");
        Bedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeditActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 6, 0, 10);
        getContentPane().add(Bedit, gridBagConstraints);

        Bdelete.setText("DELETE");
        Bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BdeleteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 231;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 6, 0, 10);
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
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 235;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 10);
        getContentPane().add(Bclear, gridBagConstraints);

        jLabel7.setText("Tgl Masuk");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        getContentPane().add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 32, 0, 0);
        getContentPane().add(Tmasuk, gridBagConstraints);

        jLabel8.setText("Tgl Expired");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 10, 0, 0);
        getContentPane().add(jLabel8, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 32, 0, 0);
        getContentPane().add(Texpired, gridBagConstraints);

        Tid.setEditable(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 316;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 32, 0, 0);
        getContentPane().add(Tid, gridBagConstraints);

        jLabel9.setText("Id Obat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 0, 0);
        getContentPane().add(jLabel9, gridBagConstraints);

        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 245;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 6, 0, 10);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setText("PRINT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 237;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 10);
        getContentPane().add(jButton2, gridBagConstraints);

        jLabel10.setText("Id Supplier");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 224;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 32, 0, 0);
        getContentPane().add(Tidsupplier, gridBagConstraints);

        jButton3.setText("Pilih");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 35;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(jButton3, gridBagConstraints);

        Bcari.setText("SEARCH");
        Bcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcariActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 19;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 6, 0, 10);
        getContentPane().add(Bcari, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 261;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        getContentPane().add(Tcari, gridBagConstraints);

        jLabel6.setText("Cari");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 10, 0, 0);
        getContentPane().add(jLabel6, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsaveActionPerformed
        simpandata(); 
        auto();
        
        Tidsupplier.setText("");
        Tnama.setText("");
        Tstok.setText("");
        Tbeli.setText("");
        Tjual.setText("");
        Tmasuk.setText("");
        Texpired.setText("");
        
    }//GEN-LAST:event_BsaveActionPerformed

    private void BeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeditActionPerformed
            
            String id       = Tid.getText();
            String supplier = Tidsupplier.getText();
            String nama     = Tnama.getText();
            String stok     = Tstok.getText();
            String beli     = Tbeli.getText();
            String jual     = Tjual.getText();
            String masuk    = Tmasuk.getText();
            String expired  = Texpired.getText();
            

            try {
                koneksidatabase();
                try (Statement statement = (Statement) con.createStatement()) {
                statement.executeUpdate("UPDATE obat " 
                        + "SET " 
                        + "id_supplier = '" +supplier+ "'," 
                        + "nama_obat = '" +nama+ "'," 
                        + "stok_obat = '" +stok+ "'," 
                        + "hbeli_obat = '" +beli+ "'," 
                        + "hjual_obat = '" +  jual+ "'," 
                        + "tgl_masuk = '" +  masuk+ "'," 
                        + "tgl_expired = '" +  expired+ "'" 
                        + "WHERE " 
                        + "id_obat = '" +id+ "';");
            }

                System.out.println("Edit data berhasil!");

            }catch (Exception ex){
                JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            tampildata();
    }//GEN-LAST:event_BeditActionPerformed

    private void tabelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelObatMouseClicked
         
        Bedit.setEnabled(true);
        Bdelete.setEnabled(true);
        Bsave.setEnabled(false);
        
        int row = tabelObat.getSelectedRow();
        Tid.setText((String)tabelObat.getValueAt(row, 0));
        Tidsupplier.setText((String)tabelObat.getValueAt(row, 1));
        Tnama.setText((String)tabelObat.getValueAt(row, 2));
        Tstok.setText((String)tabelObat.getValueAt(row, 3));
        Tbeli.setText((String)tabelObat.getValueAt(row, 4));
        Tjual.setText((String)tabelObat.getValueAt(row, 5));
        Tmasuk.setText((String)tabelObat.getValueAt(row, 6));
        Texpired.setText((String)tabelObat.getValueAt(row, 7));

    }//GEN-LAST:event_tabelObatMouseClicked

    private void BdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BdeleteActionPerformed
        String id = Tid.getText(); 
        
        int ok = JOptionPane.showConfirmDialog(null,
                "Apakah yakin menghapus data ini?", 
                "Confirmation",JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok==0){
        
            try {
                koneksidatabase();
                Statement statement = (Statement) con.createStatement();
                statement.executeUpdate("delete from obat where id_obat= ('"+id+"');");
                System.out.println("Hapus data berhasil!");
                }catch (Exception t) {
                    JOptionPane.showMessageDialog(null, "Data gagal dihapus");
                } 
                tampildata();

                Tidsupplier.setText("");
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
        Tidsupplier.setText("");
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
        try{
        koneksidatabase();
        Map prs = new HashMap();
        JasperReport jsprt = JasperCompileManager.compileReport("C:/Users/Win 8.1/Documents/NetBeansProjects"
                + "/Aplikasi_Apotek/laporan/laporan_obat.jrxml");
        JasperPrint jprint = JasperFillManager.fillReport(jsprt, prs, con);
        JasperViewer.viewReport(jprint, false);
                } catch(Exception e) {
                    System.out.println(e.getMessage());
                }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Form_PilihSupplier ambil = new Form_PilihSupplier();
        ambil.fps = this;
        ambil.setVisible(true);
        ambil.setResizable(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcariActionPerformed
        DefaultTableModel tabelTampil1 = new DefaultTableModel();
    tabelTampil1.addColumn("Id Obat");
    tabelTampil1.addColumn("Id Supplier ");
    tabelTampil1.addColumn("Nama Obat ");
    tabelTampil1.addColumn("Stok Obat");
    tabelTampil1.addColumn("H Beli");
    tabelTampil1.addColumn("H Jual");
        try{
            koneksidatabase(); 
            String sql = "select * from obat where "
                    + "id_obat like '%" + Tcari.getText() + "%'" 
                    + "or id_supplier like '%" + Tcari.getText() + "%'" 
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

                }catch (Exception e){
            }
    }//GEN-LAST:event_BcariActionPerformed
    
    public String idSupplier;

    public String getIdSpl() {
        return idSupplier;
    }
    public void itemTerpilih(){
        Form_PilihSupplier ambil = new Form_PilihSupplier();
        ambil.fps = this;
        Tidsupplier.setText(idSupplier);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Form_Obat().setVisible(true);
            }
        });
    }
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
    private javax.swing.JTextField Tidsupplier;
    private javax.swing.JTextField Tjual;
    private javax.swing.JTextField Tmasuk;
    private javax.swing.JTextField Tnama;
    private javax.swing.JTextField Tstok;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
