package ade;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class uasmethod1 {
	
public void register_login(){
		
		Scanner input = new Scanner( System.in);
		String email;
		String alamat,nohp;
		String nama;
		String pasword = null;
		String nama1 = null;
		String pasword1 = null;
		JOptionPane.showMessageDialog(null,"Selamat datang di toko \"KITA\"\nsilahkan anda register terlebi dahulu");
		nama =JOptionPane.showInputDialog("Username");
		pasword=JOptionPane.showInputDialog("pasword");
		email=JOptionPane.showInputDialog("email");
		alamat=JOptionPane.showInputDialog("alamat");
		nohp=JOptionPane.showInputDialog("No Hp");
		
		JOptionPane.showMessageDialog(null,"silakan login");
		nama1 =JOptionPane.showInputDialog("Username");
		pasword1=JOptionPane.showInputDialog("pasword");
		if(nama1.equals(nama)&&pasword1.equalsIgnoreCase(pasword)){	
			String inputa = JOptionPane.showInputDialog("menu daftar barang : \na. \nb. \nc. \nd.");
			if (inputa.equals("a")){
		}else {
			JOptionPane.showMessageDialog(null,"pilihan salah");
			
		
		}System.exit(0);
		
		}
		JOptionPane.showMessageDialog(null," nama atau pasword salah\n     silakan login kembali");
		nama1 =JOptionPane.showInputDialog("Username");
		pasword1=JOptionPane.showInputDialog("pasword");
		if(nama1.equals(nama)&&pasword1.equalsIgnoreCase(pasword)){
			String inputa = JOptionPane.showInputDialog("menu daftar barang : \na. \nb. \nc. \nd.");
			if (inputa.equals("a")){
			
			
			}else {
			JOptionPane.showMessageDialog(null,"pilihan salah");
		}System.exit(0);
		}
		}
	
}



