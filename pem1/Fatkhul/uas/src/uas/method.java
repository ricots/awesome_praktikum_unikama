package uas;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

public class method {
	
	String id1,pass1,id2,pass2,tgl1,bln,nm;
	
	int tgl,bulan;
	String nama_ramalan=null;
	public static String nm1 = "";
	public static String thn = "";
	
	
	public void login() {
		
		JDialog.setDefaultLookAndFeelDecorated(true);
		
		int respon = JOptionPane.showConfirmDialog(null, "harus register terlebih dahulu",
		"confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if (respon == JOptionPane.YES_OPTION){
	        nm1   = JOptionPane.showInputDialog("Nama anda");    
			id1  = JOptionPane.showInputDialog( "Username");
	        pass1= JOptionPane.showInputDialog("password");
	            
	        JOptionPane.showMessageDialog(null, "selamat anda berhasil register");
	    
		}else if (respon == JOptionPane.NO_OPTION){
			System.exit(0);
		}
	        
		int ggl = 3;
		while (ggl !=0){		
	            id2   = JOptionPane.showInputDialog("username");
	            pass2 = JOptionPane.showInputDialog("password");
			if (id1.equals(id2)&&(pass1.equals(pass2))){
				JOptionPane.showMessageDialog(null, "selamat datang " +nm1);
				zodiak panggil = new zodiak();
				panggil.ramal();
				panggil.ramal2();
				System.exit(0);
			}else
				JOptionPane.showMessageDialog(null, "maaf user atau password salah \n\tsilahkan login kembali");
			ggl--;	
		}
	if (ggl == 0)
	{
		JOptionPane.showMessageDialog(null, "maaf anda sudah melewati batas");		
		System.exit(0);
	}
	}
	
	
}