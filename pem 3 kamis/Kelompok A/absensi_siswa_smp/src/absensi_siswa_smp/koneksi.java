/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi_siswa_smp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kador
 */
public class koneksi {
    
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void dbConnection() { //<-- untuk koneksi ke database
        // Cek Driver
        try {
            Class.forName("com.mysql.jdbc.Driver"); //<-- nama driver untuk koneksi ke MySQL

            // Cek Database
            try {
                String url, user, password;
                url = "jdbc:mysql://localhost:3306/absensi_siswa_smp"; //alamat DB
                user = "root";
                password = "";
                connection = DriverManager.getConnection(url, user, password);

                System.out.println("Koneksi Sukses");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Gagal! " + e);
                System.exit(0);
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Driver Tidak Ditemukan!" + cnfe);
            System.exit(0);
        }
    
    }
}
