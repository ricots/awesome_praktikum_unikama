/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Jovi MONG
 */
public class koneksi {
    Connection con;
    
    
    
   public static Connection getkoneksi(){
       Connection con = null;
       try{
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return con;
        }
   }
