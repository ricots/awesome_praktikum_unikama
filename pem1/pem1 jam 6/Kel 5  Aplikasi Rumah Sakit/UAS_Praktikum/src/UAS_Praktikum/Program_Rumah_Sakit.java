package UAS_Praktikum;

import javax.swing.JOptionPane;

public class Program_Rumah_Sakit {

	public void login(){
		// TODO Auto-generated method stub
		int confirmasi = 0;
		JOptionPane.showMessageDialog(null, " ====================================================\n" +
											"                           PEMERINTAH KABUPATEN MALANG \n" + 
											"                                     RUMAH SAKIT Dr AHMED \n" + 
											"                         Jln. KLAYATAN No.03 MALANG 65147\n" +
											" ====================================================\n");
		String input,user,password,pil,nama;
		confirmasi = JOptionPane.showConfirmDialog(null, "                           PEMERINTAH KABUPATEN MALANG \n" + 
				                                         "                                     RUMAH SAKIT Dr AHMED \n" + 
				                                         "                         Jln. KLAYATAN No.03 MALANG 65147\n" +
				                                         " ====================================================\n" +
				                                         " Apakah Anda Mau Cek In ");
		if (confirmasi == JOptionPane.YES_OPTION){
		int gagal = 3;
		while (gagal != 0){
			JOptionPane.showMessageDialog(null, "Silahkan Login Dulu "); 
			String id1=JOptionPane.showInputDialog("Masukkan id ");
	     	String pass1=JOptionPane.showInputDialog("Masukkan pass ");
	     	String id2=JOptionPane.showInputDialog("Silahkan Masukkan Ulang id ");
	     	String pass2=JOptionPane.showInputDialog("Silahkan Masukkan Ulang pass ");
	     
	     
	     	if(id2.equals(id1)&&pass2.equals(pass1)){
	            JOptionPane.showMessageDialog(null, "login sukses");
	            return;
	            //System.exit(0);
	        }
	     	else{
	            JOptionPane.showMessageDialog(null, "gagal login kesempatan login kembali");
	            //System.exit(0);
	     	}
		if (gagal == 0){
			JOptionPane.showMessageDialog(null, " Maaf Anda Melebihi Batas ");
			}
		}
								
		}else if (confirmasi == JOptionPane.NO_OPTION){
			JOptionPane.showMessageDialog(null, "Terima kasih Dan Silahkan Keluar ");
			System.exit(0);
		}
}
}
		

	

