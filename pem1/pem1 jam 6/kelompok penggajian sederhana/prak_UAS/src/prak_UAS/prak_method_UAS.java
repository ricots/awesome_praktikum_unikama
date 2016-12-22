package prak_UAS;

import javax.swing.JOptionPane;

public class prak_method_UAS {
	
	public void pesan (){
		
		JOptionPane.showMessageDialog(null, "============================================\n"
				  + "      SLIP PENGGAJIAN KARYAWAN PT SEKAR AGUNG \n"
				  + "\n"
				  + "           "
				  + "      Jln KEMANTREN No. 13 MALANG 65147 \n "
				  + "============================================");

		
	}
	
	public void nama (){
		
	String nama;
	
	nama = JOptionPane.showInputDialog(" Masukkan Nama Pegawai");
	if(nama.equalsIgnoreCase("Dea Yoggie U")){
	JOptionPane.showMessageDialog(null, "Selamat Datang Yoggie");
	}  
	else {
	JOptionPane.showMessageDialog(null, "Maaf Nama Yang Anda Masukkan Salah \n"
										+ "Silahkan Coba Masukkan Nama Lagi");
		nama = JOptionPane.showInputDialog(" Masukkan Nama Pegawai");
		if(nama.equalsIgnoreCase("Dea Yoggie U")){
		JOptionPane.showMessageDialog(null, "Selamat Datang Yoggie");
		}  
		else {
		JOptionPane.showMessageDialog(null, "Maaf Nama Yang Anda Masukkan Salah \n"
											+"Silahkan Coba Masukkan Nama Lagi");
			nama = JOptionPane.showInputDialog(" Masukkan Nama Pegawai");
			if(nama.equalsIgnoreCase("Dea Yoggie U")){
			JOptionPane.showMessageDialog(null, "Selamat Datang Yoggie");
			}  
			else {
			//JOptionPane.showMessageDialog(null, "Maaf Nama Yang Anda Masukkan Salah");
			JOptionPane.showMessageDialog(null, "Anda Salah Memasukkan Nama \n"+"Terima Kasih");
			System.exit(0);
			}
	}
	}
	}
	
	
	
	public void lembur_anak (){
		
		int anak = 50000;
		int lembur = 100000;
		int gaji = 1500000;
		
		
		int hlembur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Total Lembur (Jam)"));
		int a = hlembur * lembur;
		JOptionPane.showMessageDialog(null, a);

		int hanak = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Jumlah Anak "));
		int b = hanak * anak;
		JOptionPane.showMessageDialog(null, b);
		
		JOptionPane.showMessageDialog(null, "Nama                         = Dea Yoggie U \n" 
				  + "Gaji Pokok                 = " + gaji + "\n"
				  + "Tunjangan Lembur = " + a + "\n"
			      + "Tunjangan Anak      = " + b + "\n"
			      + "----------------------------------------- + \n"
			      + "Total Gaji                   = " +(gaji + a + b));
		
	}
	
	
	
	
}
