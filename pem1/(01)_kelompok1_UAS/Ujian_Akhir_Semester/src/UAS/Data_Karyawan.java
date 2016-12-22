package UAS;
import javax.swing.JOptionPane;
public class Data_Karyawan {
	
	String nama3,pass3,kerja3,lahir3,gender3,hape3,email3;
	
	public void data_kar(){
	
		
		Pilihan_Karyawan_Manager panggil = new Pilihan_Karyawan_Manager();		
	
		JOptionPane.showMessageDialog(null,
				nama3 + " berkerja sebagai " + kerja3 +"\n"
				+ "akan menerima gaji per hari Rp.80.000, hari kerja senin\n"
				+ "sampai jumat, perhari 9jam kerja dengan 1jam istirahat\n"
				+ "------------------------------------------------------------------------------\n"
				+ "Catatan: jika lebih dari 10 hari tidak masuk kerja dengan\n"
				+ "keputusan sepihak anda akan di berhentikan kerja.");

		panggil.pilihan();
	
}
}