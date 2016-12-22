/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Pixel
 */
public class koneksi {
    Connection conn;
        
    public static Connection getkoneksi() {
        Connection conn = null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_uas","root","");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
        }
}
