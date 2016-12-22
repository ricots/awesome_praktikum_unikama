/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class formulir_penonton extends javax.swing.JFrame {
    Connection cnn;
    ResultSet rss;
    Statement stt;

    /**
     * Creates new form formulir_penonton
     */
    public formulir_penonton() {
        initComponents();
        this.setLocationRelativeTo(null);
        //setExtendedState(MAXIMIZED_BOTH);
        number();
        tabel_film();
        tabel_penonton();
        clear();
    }
    
    public void number(){
      try{
        stt = (Statement) koneksi.getkoneksi().createStatement();
        String sql= "SELECT MAX(right(id_penonton,3)) AS no FROM penonton";
        rss = stt.executeQuery(sql);
        while(rss.next())
            {
                if(rss.first() == false)
                {
        txtid_penonton.setText("ID-00001");
                }
                else
                {
                    rss.last();
                    int auto_id = rss.getInt(1) + 1;
                    String no = String.valueOf(auto_id);
                    int noLong = no.length();
                    for(int a=0;a<4-noLong;a++)
                    {
                        no = "0" + no;
                    }
                    txtid_penonton.setText("Penonton-" + no);
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
    public void tabel_film(){
        DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID FILM");
            tbl.addColumn("JUDUL FILM");            
            tbl.addColumn("JENIS FILM");            
            tbl.addColumn("DURASI FILM");
            tbl.addColumn("TAHUN");
        jtabel_film.setModel(tbl);
        try{
            stt = (Statement) koneksi.getkoneksi().createStatement();
            String sql = "select * from film order by id_film asc";
            rss = stt.executeQuery(sql);
            while (rss.next()){
                tbl.addRow(new Object[]{
                    rss.getString(1),
                    rss.getString(2),
                    rss.getString(3),
                    rss.getString(4),
                    rss.getString(5)});
                jtabel_film.setModel(tbl);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void tabel_penonton(){
        DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID PENONTON");
            tbl.addColumn("NAMA");            
            tbl.addColumn("ALAMAT");            
            tbl.addColumn("NO TELPON");
            tbl.addColumn("JENIS KELAMIN");
            tbl.addColumn("FILM YG DIPILIH");
            tbl.addColumn("ID FILM");
        jtabel_penonton.setModel(tbl);
        try{
            stt = (Statement) koneksi.getkoneksi().createStatement();
            String sql = "select * from penonton order by id_penonton DESC";
            rss = stt.executeQuery(sql);
            while (rss.next()){
                tbl.addRow(new Object[]{
                    rss.getString(1),
                    rss.getString(2),
                    rss.getString(3),
                    rss.getString(4),
                    rss.getString(5),
                    rss.getString(6),
                    rss.getString(7)});
                jtabel_penonton.setModel(tbl);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void clear(){
        txtnama.setText(null);
        TxtAlamat.setText(null);
        txtno_telpon.setText(null);
        txtcari.setText(null);
        txtid_film.setText(null);
        txtfilm.setText(null);       
        
    }  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        ComboBox = new javax.swing.JComboBox();
        txtcari = new javax.swing.JTextField();
        cari = new javax.swing.JButton();
        segarkan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabel_film = new javax.swing.JTable();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtid_penonton = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtAlamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtno_telpon = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JK = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtid_film = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        simpan = new javax.swing.JButton();
        ubah = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        kembali = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtabel_penonton = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtfilm = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);
        jInternalFrame1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jInternalFrame1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel5.setBackground(new java.awt.Color(153, 255, 153));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "~CARI BERDASARKAN~" }));

        cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemrograman/gambar/cari.png"))); // NOI18N
        cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariActionPerformed(evt);
            }
        });

        segarkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemrograman/gambar/segar.png"))); // NOI18N
        segarkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                segarkanActionPerformed(evt);
            }
        });
        segarkan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                segarkanKeyPressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel9.setText("CARI BERDASARKAN");

        jPanel4.setBackground(java.awt.Color.darkGray);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("DATA FILM");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(274, 274, 274))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(15, 15, 15))
        );

        jtabel_film.setBackground(java.awt.Color.darkGray);
        jtabel_film.setForeground(new java.awt.Color(255, 255, 255));
        jtabel_film.setModel(new javax.swing.table.DefaultTableModel(
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
        jtabel_film.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabel_filmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabel_film);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(segarkan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcari)
                    .addComponent(cari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(segarkan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ComboBox))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jInternalFrame2.setBackground(new java.awt.Color(255, 255, 255));
        jInternalFrame2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrame2.setVisible(true);
        jInternalFrame2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jInternalFrame2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));

        jLabel2.setText("ID Penonton");

        jLabel3.setText("Nama");

        jLabel4.setText("Alamat");

        TxtAlamat.setColumns(20);
        TxtAlamat.setRows(5);
        jScrollPane2.setViewportView(TxtAlamat);

        jLabel5.setText("No Telpon");

        jLabel6.setText("Jenis Kelamin");

        JK.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setText("Film yg di pilih");

        jLabel8.setText("ID Film");

        jPanel1.setBackground(java.awt.Color.darkGray);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PENGISIAN FORMULIR PENONTON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel3.setBackground(java.awt.Color.darkGray);

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemrograman/gambar/simpan.png"))); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });

        ubah.setText("UBAH");
        ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahActionPerformed(evt);
            }
        });

        hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemrograman/gambar/hapus1.png"))); // NOI18N
        hapus.setText("HAPUS");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });

        kembali.setBackground(new java.awt.Color(0, 0, 0));
        kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pemrograman/gambar/back.png"))); // NOI18N
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ubah, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hapus)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ubah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );

        jtabel_penonton.setBackground(java.awt.Color.darkGray);
        jtabel_penonton.setForeground(new java.awt.Color(255, 255, 255));
        jtabel_penonton.setModel(new javax.swing.table.DefaultTableModel(
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
        jtabel_penonton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabel_penontonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtabel_penonton);

        txtfilm.setColumns(20);
        txtfilm.setRows(5);
        jScrollPane4.setViewportView(txtfilm);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JK, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtno_telpon, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtid_penonton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(txtid_film, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap())))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid_penonton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtno_telpon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jInternalFrame2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInternalFrame1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
            .addComponent(jInternalFrame2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtid_penonton.getText()) || "".equals(txtnama.getText()) ||"".equals(TxtAlamat.getText()) ||
                "".equals(txtfilm.getText()) || "".equals(txtid_film.getText()) ||"".equals(txtno_telpon.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
            number();
        } else {
            String SQL = "INSERT INTO penonton (id_penonton,nama,alamat,no_telpon,jenis_kelamin,pilihan_film,id_film) "
                    + "VALUES('"+txtid_penonton.getText()+"','"+txtnama.getText()+"','"+TxtAlamat.getText()+"','"
                    +txtno_telpon.getText()+"','"+JK.getSelectedItem()+"','"+txtfilm.getText()+"','"
                    +txtid_film.getText()+"')";
            int status = koneksi.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);  
                tabel_penonton();
                clear();
                number();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "KESALAHAN", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtid_penonton.getText())) {
            JOptionPane.showMessageDialog(this, "HARAP LENGKAPI DATA", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL =  "DELETE FROM penonton WHERE id_penonton='"+txtid_penonton.getText()+"'";        
            int status = koneksi.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "DATA BERHASIL DIHAPUS", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                clear();
                tabel_penonton();
                number();
            } else {
                JOptionPane.showMessageDialog(this, "DATA GAGAL DIHAPUS", "KESALAHAN", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void jInternalFrame1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jInternalFrame1AncestorAdded
        // TODO add your handling code here:
        ComboBox.removeAllItems();
        ComboBox.addItem("JUDUL FILM");
        ComboBox.addItem("JENIS FILM");
    }//GEN-LAST:event_jInternalFrame1AncestorAdded

    private void cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariActionPerformed
        // TODO add your handling code here:
        if (ComboBox.getSelectedIndex()==0){
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID FILM");
            tbl.addColumn("JUDUL FILM");
            tbl.addColumn("JENIS FILM");
            tbl.addColumn("DURASI FILM");
            tbl.addColumn("TAHUN");
            jtabel_film.setModel(tbl);
            try{
                String sql = "select * from film where judul_film like '%"+txtcari.getText()+"'";
                rss = stt.executeQuery(sql);
                if (rss.next()){
                    tbl.addRow(new Object[]{
                        rss.getString(1),
                        rss.getString(2),
                        rss.getString(3),
                        rss.getString(4),
                        rss.getString(5)});
                jtabel_film.setModel(tbl);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        } else {
            DefaultTableModel tbl = new DefaultTableModel();
            tbl.addColumn("ID FILM");
            tbl.addColumn("JUDUL FILM");
            tbl.addColumn("JENIS FILM");
            tbl.addColumn("DURASI FILM");
            tbl.addColumn("TAHUN");
            jtabel_film.setModel(tbl);
            try{
                String sql = "select * from film where jenis_film like '%" +txtcari.getText()+"'";
                rss = stt.executeQuery(sql);
                if (rss.next()){
                    
                    tbl.addRow(new Object[]{
                        rss.getString(1),
                        rss.getString(2),
                        rss.getString(3),
                        rss.getString(4),
                        rss.getString(5)});
                jtabel_film.setModel(tbl);
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
        
    }//GEN-LAST:event_cariActionPerformed

    private void segarkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_segarkanActionPerformed
        // TODO add your handling code here:
        tabel_film();
        tabel_penonton();
        clear();
        number();
    }//GEN-LAST:event_segarkanActionPerformed

    private void jInternalFrame2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jInternalFrame2AncestorAdded
        // TODO add your handling code here:
        JK.removeAllItems();
        JK.addItem("Laki-laki");
        JK.addItem("Perempuan");
    }//GEN-LAST:event_jInternalFrame2AncestorAdded

    private void jtabel_filmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabel_filmMouseClicked
        // TODO add your handling code here:
        int baris = jtabel_film.getSelectedRow();        
            txtid_film.setText(jtabel_film.getValueAt(baris, 0).toString());        
            txtfilm.setText(jtabel_film.getValueAt(baris, 1).toString());
        

    }//GEN-LAST:event_jtabel_filmMouseClicked

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        dispose();
        //new menu_utama().setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void ubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahActionPerformed
        // TODO add your handling code here:
        if ("".equals(txtid_penonton.getText()) || "".equals(txtnama.getText()) ||"".equals(TxtAlamat.getText()) ||
                "".equals(txtfilm.getText()) || "".equals(txtid_film.getText()) ||"".equals(txtno_telpon.getText())) {
            JOptionPane.showMessageDialog(this, "HARAP LENGKAPI DATA", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            String SQL = "UPDATE penonton set nama = '"+ txtnama.getText() 
                    + "',"+ "alamat = '" + TxtAlamat.getText()
                    + "',"+ "no_telpon ='" + txtno_telpon.getText() 
                    + "',"+ "jenis_kelamin = '" + JK.getSelectedItem()
                    + "',"+ "pilihan_film = '" + txtfilm.getText() 
                    + "',"+ "id_film = '" + txtid_film.getText()
                    + "'  where id_penonton = '" + txtid_penonton.getText() + "';";
            int status = koneksi.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "DATA BERHASIL DIUBAH", "Sukses", JOptionPane.INFORMATION_MESSAGE);  
                tabel_penonton();
                clear();
                number();
            } else {
                JOptionPane.showMessageDialog(this, "DATA GAGAL DIUBAH", "KESALAHAN", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_ubahActionPerformed

    private void segarkanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_segarkanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_segarkanKeyPressed

    private void jtabel_penontonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabel_penontonMouseClicked
        // TODO add your handling code here:
        int baris = jtabel_penonton.getSelectedRow();        
            txtid_penonton.setText(jtabel_penonton.getValueAt(baris, 0).toString());        
            txtnama.setText(jtabel_penonton.getValueAt(baris, 1).toString());
            TxtAlamat.setText(jtabel_penonton.getValueAt(baris, 2).toString());
            txtno_telpon.setText(jtabel_penonton.getValueAt(baris, 3).toString());            
            JK.setSelectedItem(jtabel_penonton.getValueAt(baris, 4).toString());
            txtfilm.setText(jtabel_penonton.getValueAt(baris, 5).toString());
            txtid_film.setText(jtabel_penonton.getValueAt(baris, 6).toString());
    }//GEN-LAST:event_jtabel_penontonMouseClicked

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
            java.util.logging.Logger.getLogger(formulir_penonton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulir_penonton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulir_penonton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulir_penonton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulir_penonton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox;
    private javax.swing.JComboBox JK;
    private javax.swing.JTextArea TxtAlamat;
    private javax.swing.JButton cari;
    private javax.swing.JButton hapus;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jtabel_film;
    private javax.swing.JTable jtabel_penonton;
    private javax.swing.JButton kembali;
    private javax.swing.JButton segarkan;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextArea txtfilm;
    private javax.swing.JTextField txtid_film;
    private javax.swing.JTextField txtid_penonton;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtno_telpon;
    private javax.swing.JButton ubah;
    // End of variables declaration//GEN-END:variables
}
