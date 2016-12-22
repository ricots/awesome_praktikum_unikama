
package internal;

import aplikasi_apotek.Tampilan_Utama;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Internal_TransaksiJual extends javax.swing.JInternalFrame {
    
    Connection con;
    ResultSet st;
    
    public Internal_TransaksiJual() {
        initComponents();
        tampildataobat();
        auto();
        tanggal();
        
        
        Bbayar.setEnabled(false);
        Bhapus.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tidpetugas = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Ttanggal = new javax.swing.JTextField();
        Tsubtotal = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Btambah = new javax.swing.JButton();
        Tkodetransaksi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Tjumlahbeli = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Ttotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Ttunai = new javax.swing.JTextField();
        Thargaobat = new javax.swing.JTextField();
        Tnamaobat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Tidpembelian = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Tkembalian = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelObat = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        Bhapus = new javax.swing.JButton();
        Bbayar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Bkeluar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Tid = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelPembelian = new javax.swing.JTable();
        Bbatal = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        Tidpetugas.setEditable(false);
        Tidpetugas.setText("1");

        jLabel13.setText("Id Petugas");

        Ttanggal.setEditable(false);

        Tsubtotal.setEditable(false);

        jLabel12.setText("Tanggal");

        Btambah.setText("Tambahkan");
        Btambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtambahActionPerformed(evt);
            }
        });

        Tkodetransaksi.setEditable(false);
        Tkodetransaksi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TkodetransaksiKeyPressed(evt);
            }
        });

        jLabel1.setText("Kode Transaksi");

        Tjumlahbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TjumlahbeliActionPerformed(evt);
            }
        });
        Tjumlahbeli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TjumlahbeliKeyReleased(evt);
            }
        });

        jLabel5.setText("Jumlah Beli");

        Ttotal.setEditable(false);
        Ttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtotalActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga Obat");

        Ttunai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtunaiActionPerformed(evt);
            }
        });

        Thargaobat.setEditable(false);

        Tnamaobat.setEditable(false);

        jLabel3.setText("Nama Obat");

        jLabel11.setText("Id Pembelian");

        Tidpembelian.setEditable(false);

        jLabel9.setText("Kembalian");

        Tkembalian.setEditable(false);

        tabelObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Obat", "Nama Obat", "Stok Obat", "Harga Beli", "Harga Jual", "Tgl Masuk", "Tgl Expired"
            }
        ));
        tabelObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabelObatMouseEntered(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelObat);

        jLabel8.setText("Tunai");

        Bhapus.setText("Hapus");
        Bhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BhapusActionPerformed(evt);
            }
        });

        Bbayar.setText("Bayar");
        Bbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbayarActionPerformed(evt);
            }
        });

        jLabel7.setText("Total");

        Bkeluar.setText("Keluar");
        Bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BkeluarActionPerformed(evt);
            }
        });

        jLabel10.setText("Id Obat");

        Tid.setEditable(false);

        tabelPembelian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Pembelian", "Id Petugas", "Id Obat", "Kode Transaksi", "Nama Obat", "Harga Obat", "Jumlah Beli", "Total Harga"
            }
        ));
        tabelPembelian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPembelianMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelPembelian);

        Bbatal.setText("Batal");
        Bbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Tkodetransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(Ttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(Tidpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(Tidpembelian, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(53, 53, 53)
                                .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(36, 36, 36)
                                .addComponent(Tnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(34, 34, 34)
                                .addComponent(Thargaobat, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38)
                                .addComponent(Tjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Tsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(589, 589, 589)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(Ttunai, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Btambah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(Bbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(Bbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(Bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(Ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel9)
                        .addGap(4, 4, 4)
                        .addComponent(Tkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tkodetransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tidpetugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tidpembelian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel10))
                            .addComponent(Tid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3))
                            .addComponent(Tnamaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(Thargaobat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(Tjumlahbeli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(Tsubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btambah)
                            .addComponent(Bbatal)
                            .addComponent(Ttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel8))
                    .addComponent(Ttunai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void bersihdata() {
        Tid.setText("");
 
        Tnamaobat.setText("");
        Thargaobat.setText("");
        Tjumlahbeli.setText("");
    }
     
    public void tanggal(){
        Date ys =new Date(); 
        // membuat oject ys dari class Date
 
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd"); 
        //membuat object s dari class SimpleDateFormat dengan format (dd-MM-yyyy)yaitu (tanggal-bulan-tahun).
     
        Ttanggal.setText(s.format(ys));
    }
    
    public final void auto(){
      try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                        +"localhost/apotek2","root","");
            Statement stt = (Statement) konek.createStatement();
            String sql= "SELECT MAX(right(kode_transaksi,3)) AS kode FROM pembelian";
            st = stt.executeQuery(sql);
        
            while(st.next()){
            if(st.first() == false){   
            Tkodetransaksi.setText("ID-0001");
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
                   
                    Date tanggal = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
                    System.out.println(sdf.format(tanggal));
                    
            
                    Tkodetransaksi.setText("PJ-"+sdf.format(tanggal)+no);
                 }        
            }
       st.close();
       stt.close();
        }    
      
    catch (Exception e){
            JOptionPane.showMessageDialog(this, "ERROR: \n" + e.toString(),
                            "Kesalahan", JOptionPane.WARNING_MESSAGE);
        }
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
      
    public void hitungSubtotal() {
        Integer a = Integer.parseInt(Thargaobat.getText());
        Integer b = Integer.parseInt(Tjumlahbeli.getText());
        Integer c = a * b;
        Tsubtotal.setText(String.valueOf(c));
    }
    
    public void hitungTotal() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek2","root","");
            Statement st = (Statement) konek.createStatement();
            
            String kd = Tkodetransaksi.getText();
            
            ResultSet rs = st.executeQuery("SELECT SUM(total_harga) as total_harga "
                    + "from pembelian WHERE kode_transaksi = '" + kd + "'");
            
            rs.next();
            Ttotal.setText(rs.getString("total_harga"));
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void hitungKembalian() {
        Integer a = Integer.parseInt(Ttunai.getText());
        Integer b = Integer.parseInt(Ttotal.getText());
        Integer c = a - b;
        Tkembalian.setText(String.valueOf(c));
    }
    
    public void simpandata(){
        if (Tkodetransaksi.getText().equals("") 
            || Tid.getText().equals("")
            || Tnamaobat.getText().equals("") 
            || Thargaobat.getText().equals("") 
            || Tjumlahbeli.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan lengkapi data terlebih dahulu !!! ");
        } else{
          
        
        try {
            koneksidatabase();
            
            Statement st = (Statement) con.createStatement();
            st.executeUpdate ("insert into pembelian ("
                    + "`id_petugas`, "
                    + "`id_obat`, `kode_transaksi`, "
                    + "`nama_obat`, "
                    + "`hjual_obat`, `jumlah_beli`, `total_harga`) "
                    + "values (" 
                    +"'"+Tidpetugas.getText()+"',"
                    +"'"+Tid.getText()+"',"
                    +"'"+Tkodetransaksi.getText()+"',"
                   
                    +"'"+Tnamaobat.getText()+"',"
                    +"'"+Thargaobat.getText()+"',"
                    +"'"+Tjumlahbeli.getText()+"',"
                    +"'"+Tsubtotal.getText()+"')");
            System.out.println("Input data berhasil!");
            this.tampildatapembelian();
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     tampildatapembelian();
    }
    }
    
    
    public void bayar(){
        if (Ttunai.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan lengkapi data terlebih dahulu !!! ");
        } else{
          
        
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek2","root","");
            Statement st = (Statement) konek.createStatement();
            
            String kd = Tkodetransaksi.getText();
            
            ResultSet rs = st.executeQuery("SELECT SUM(jumlah_beli) as jumlah_beli "
                    + "from pembelian WHERE kode_transaksi = '" + kd + "'");
            
            rs.next();
            String jumlah =  rs.getString("jumlah_beli");
            
            st.executeUpdate ("insert into penjualan ("
                    + "`id_petugas`, "
                    + "`kode_transaksi`,  "
                    + "`tgl_transaksi`, "
                    + "`jumlah_obat`, "
                    + "`total_bayar`) "
                    + "values (" 
                    
                    +"'"+Tidpetugas.getText()+"',"
                    +"'"+Tkodetransaksi.getText()+"',"
                    +"'"+Ttanggal.getText()+"',"
                    +"'"+jumlah+"',"
                    +"'"+Ttotal.getText()+"')");
            System.out.println("Input data berhasil!");
            this.tampildatapembelian();
        }catch (Exception ex){
           JOptionPane.showMessageDialog(null, "QUERY ERROR!"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
     tampildatapembelian();
    }
    }
    
    
    final void tampildataobat(){
        Object [][] isitabel = null;
        String [] Judul = {"Id Obat","Id Supplier", "Nama Obat", "Stok Obat", 
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
    
    
    final void tampildatapembelian(){
        Object [][] isitabel = null;
        String [] Judul = {"Id Pembelian","Id Petugas", "Id Obat", "Kode Transaksi", 
           "Nama Obat", "Harga Obat", "Jumlah Beli", "Total Harga"};
        
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection konek = DriverManager.getConnection("jdbc:mysql://"
                    +"localhost/apotek2","root","");
            Statement st = (Statement) konek.createStatement();
            
            String kd = Tkodetransaksi.getText();
                    
            ResultSet rs = st.executeQuery("select * from pembelian where kode_transaksi='" + kd+ "'");
            
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
                isitabel[x][0] = rs.getString("id_pembelian");
                isitabel[x][1] = rs.getString("id_petugas");
                isitabel[x][2] = rs.getString("id_obat");
                isitabel[x][3] = rs.getString("kode_transaksi");
                isitabel[x][4] = rs.getString("nama_obat");
                isitabel[x][5] = rs.getString("hjual_obat");
                isitabel[x][6] = rs.getString("jumlah_beli");
                isitabel[x][7] = rs.getString("total_harga");
                x++;
            }
            tabelPembelian.setModel(new DefaultTableModel(isitabel,Judul));
        }
        
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "QUERY ERROR"+ex, "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void BtambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtambahActionPerformed
        simpandata();
        hitungTotal();
        tampildataobat();


        Tid.setText("");
        Tnamaobat.setText("");
        Thargaobat.setText("");
        Tjumlahbeli.setText("");
        Tsubtotal.setText("");
    }//GEN-LAST:event_BtambahActionPerformed

    private void TkodetransaksiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TkodetransaksiKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (Tkodetransaksi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Data tidak boleh kosong\nSilahkan isi dulu", "Informasi",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                Tjumlahbeli.requestFocus();
            }
        }
    }//GEN-LAST:event_TkodetransaksiKeyPressed

    private void TjumlahbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TjumlahbeliActionPerformed
        hitungSubtotal();
    }//GEN-LAST:event_TjumlahbeliActionPerformed

    private void TjumlahbeliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TjumlahbeliKeyReleased

    }//GEN-LAST:event_TjumlahbeliKeyReleased

    private void TtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TtotalActionPerformed

    private void TtunaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtunaiActionPerformed
        hitungKembalian();
    }//GEN-LAST:event_TtunaiActionPerformed

    private void tabelObatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelObatMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabelObatMouseEntered

    private void tabelObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelObatMouseClicked

        Bbayar.setEnabled(true);
        Bhapus.setEnabled(true);

        int row = tabelObat.getSelectedRow();
        Tid.setText((String) tabelObat.getValueAt(row, 0));
        Tnamaobat.setText((String) tabelObat.getValueAt(row, 1));
        Thargaobat.setText((String) tabelObat.getValueAt(row, 4));
    }//GEN-LAST:event_tabelObatMouseClicked

    private void BhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BhapusActionPerformed
        String id = Tidpembelian.getText();

        int ok = JOptionPane.showConfirmDialog(null,
                "Apakah yakin menghapus data ini?",
                "Confirmation", JOptionPane.YES_NO_CANCEL_OPTION);
        if (ok == 0) {

            try {
                koneksidatabase();
                Statement statement = (Statement) con.createStatement();
                statement.executeUpdate("delete from pembelian where id_pembelian= ('" + id + "');");
                System.out.println("Hapus data berhasil!");
            } catch (Exception t) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus");
            }
            tampildatapembelian();
            tampildataobat();
            Tidpembelian.setText("");
        }

    }//GEN-LAST:event_BhapusActionPerformed

    private void BbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbayarActionPerformed

        int total = Integer.parseInt(Ttotal.getText());
        int tunai = Integer.parseInt(Ttunai.getText());

        if (tunai >= total) {
            hitungKembalian();
            bayar();
            auto();

            Ttotal.setText("");
            Ttunai.setText("");
            Tkembalian.setText("");
        } else {
            int validasi = JOptionPane.showConfirmDialog(null, "Maaf, Uang Pembayaran Kurang !!!", "Pemberitahuan",
                    JOptionPane.OK_CANCEL_OPTION);

            if (validasi == JOptionPane.OK_OPTION) {
                Ttunai.requestFocus();
                Ttunai.setText("");
                Tkembalian.setText("");
            } else {
                Ttunai.requestFocus();
                Ttunai.setText("");
                Tkembalian.setText("");
            }
        }

    }//GEN-LAST:event_BbayarActionPerformed

    private void BkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BkeluarActionPerformed
        new Tampilan_Utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_BkeluarActionPerformed

    private void tabelPembelianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPembelianMouseClicked
        int row = tabelPembelian.getSelectedRow();
        Tidpembelian.setText((String) tabelPembelian.getValueAt(row, 0));

    }//GEN-LAST:event_tabelPembelianMouseClicked

    private void BbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbatalActionPerformed
        bersihdata();
    }//GEN-LAST:event_BbatalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbatal;
    private javax.swing.JButton Bbayar;
    private javax.swing.JButton Bhapus;
    private javax.swing.JButton Bkeluar;
    private javax.swing.JButton Btambah;
    private javax.swing.JTextField Thargaobat;
    private javax.swing.JTextField Tid;
    private javax.swing.JTextField Tidpembelian;
    private javax.swing.JTextField Tidpetugas;
    private javax.swing.JTextField Tjumlahbeli;
    private javax.swing.JTextField Tkembalian;
    private javax.swing.JTextField Tkodetransaksi;
    private javax.swing.JTextField Tnamaobat;
    private javax.swing.JTextField Tsubtotal;
    private javax.swing.JTextField Ttanggal;
    private javax.swing.JTextField Ttotal;
    private javax.swing.JTextField Ttunai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelObat;
    private javax.swing.JTable tabelPembelian;
    // End of variables declaration//GEN-END:variables
}
