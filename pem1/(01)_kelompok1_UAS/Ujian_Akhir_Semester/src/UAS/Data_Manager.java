package UAS;
import javax.swing.JOptionPane;

public class Data_Manager {

	String nama2,kerja2,lahir2,gender2,hape2,email2;


	public void data_man(){
	Pilihan_Karyawan_Manager panggil = new Pilihan_Karyawan_Manager();
	
		JOptionPane.showMessageDialog(null,
						"Data Karyawan\n"
						+ "Nama			 : " + nama2+ "\n"
						+ "Pekerjaan	 : " + kerja2+ "\n"
						+ "Tanggal lahir : " + lahir2+ "\n"
						+ "jenis kelamin : " + gender2+ "\n"
						+ "Nomor telepon : " + hape2+ "\n"
						+ "Email		 : " + email2+ "\n"
						+ "mendapatkan gaji sebesar Rp.80.000/hari");
		panggil.pilihan();
	}

}
