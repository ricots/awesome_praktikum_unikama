package ade;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class uas_java {
	
	
	public void register_login(){
		
		Scanner input = new Scanner( System.in);
		int email,alamat,nohp;
		String nama;
		String pasword = null;
		String nama1;
		String pasword1 = null;
		JOptionPane.showMessageDialog(null,"Selamat datang di toko \"KITA\"\nsilahkan anda register terlebi dahulu");
		nama =JOptionPane.showInputDialog("Username");
		pasword=JOptionPane.showInputDialog("pasword");
		if(nama.equals("admin")&&pasword.equalsIgnoreCase("admin")){
			
		}
	}

}
