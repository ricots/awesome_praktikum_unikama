package pembayaranlistrik;
import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

        

public class Menu_Login extends javax.swing.JFrame {
Connection cnn;
    ResultSet rss;
    Statement stt;
    public Menu_Login() {
        initComponents();

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width - dialogSize.width) / 2, (screenSize.height - dialogSize.height) / 2);
    }
    public void koneksi(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
       cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/listrik","root","");
        stt = cnn.createStatement();
         }
        catch(Exception  e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"gagal koneksi","pesan",
                    JOptionPane.ERROR_MESSAGE);
    }    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        tempat_user = new javax.swing.JTextField();
        tempat_password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        tombol_login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        user.setText("USER");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 390, 0, 0);
        getContentPane().add(user, gridBagConstraints);

        password.setText("PASSWORD");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 390, 0, 0);
        getContentPane().add(password, gridBagConstraints);

        tempat_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempat_userActionPerformed(evt);
            }
        });
        tempat_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempat_userKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(120, 21, 0, 0);
        getContentPane().add(tempat_user, gridBagConstraints);

        tempat_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempat_passwordActionPerformed(evt);
            }
        });
        tempat_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tempat_passwordKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 21, 0, 0);
        getContentPane().add(tempat_password, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 404, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        tombol_login.setBackground(new java.awt.Color(0, 153, 51));
        tombol_login.setText("LOGIN");
        tombol_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_loginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 18, 0, 0);
        getContentPane().add(tombol_login, gridBagConstraints);

        register.setBackground(new java.awt.Color(0, 153, 51));
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 0);
        getContentPane().add(register, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pembayaranlistrik/login.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.gridheight = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jLabel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        register regis = new register();
        regis.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void tombol_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_loginActionPerformed
String user = tempat_user.getText();
String pass = String.valueOf(tempat_password.getPassword());
        if(user.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Username masih kosong!");
        }else if(pass.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Password masih kosong!");
        }else{
            try{
                koneksi();
                String sql = "SELECT * FROM register WHERE ID='"+user+"'";
                rss = stt.executeQuery(sql);

                boolean ada = rss.next();
                

                if(!ada){
                    JOptionPane.showMessageDialog(null, "User tidak terdaftar!");
                    tempat_user.setText("");
                    tempat_password.setText("");
                }else{
                    if(pass.equalsIgnoreCase(rss.getString("nama"))){
                        this.setVisible(false);
                        MENU mn = new MENU();
                        mn.setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Username atau Password salah!");
                        tempat_user.setText("");
                        tempat_password.setText("");
                    }
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan :"+e.getMessage());
            }
        }
        
            
    }//GEN-LAST:event_tombol_loginActionPerformed

    private void tempat_userKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempat_userKeyPressed

    }//GEN-LAST:event_tempat_userKeyPressed

    private void tempat_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempat_passwordKeyPressed

    }//GEN-LAST:event_tempat_passwordKeyPressed

    private void tempat_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempat_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempat_passwordActionPerformed

    private void tempat_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempat_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempat_userActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null,"Terima Kasih Telah Menggunakan Program ini !!!","Thank You Very Much",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new Menu_Login().setVisible(true);
            }
            
        });
    }

        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel password;
    private javax.swing.JButton register;
    private javax.swing.JPasswordField tempat_password;
    private javax.swing.JTextField tempat_user;
    private javax.swing.JButton tombol_login;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}

