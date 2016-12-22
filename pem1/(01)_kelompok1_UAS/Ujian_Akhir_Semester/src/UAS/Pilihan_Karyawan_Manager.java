package UAS;
import javax.swing.JOptionPane;
public class Pilihan_Karyawan_Manager {

	public void pilihan(){
	
	Manager_Login panggil = new Manager_Login();
	Login_Karyawan panggil1 = new Login_Karyawan();
	keluar panggil2 = new keluar();
	
			String nama, pass, kerja, email, hape, lahir, gender;
			
			JOptionPane.showMessageDialog
			(null,"Anda harus register sebagai\n"
				 +"karyawan, terlebih  dahulu !");
			
			nama = JOptionPane.showInputDialog("Masukan Username");
			pass = JOptionPane.showInputDialog("Masukan Password");
			kerja = JOptionPane.showInputDialog("Masukan Pekerjaan");
			lahir = JOptionPane.showInputDialog("Masukan Tanggal Lahir");
			gender = JOptionPane.showInputDialog("Masukan Jenis Kelamin");
			hape = JOptionPane.showInputDialog("Masukan Nomer HP");
			email = JOptionPane.showInputDialog("Masukan Email");
			JOptionPane.showMessageDialog(null,"Register Sukses");
			
        Object[] options1 = { "Manager", "Karyawan","Keluar" };

			int result = JOptionPane.showOptionDialog( null, "Slamat datang ", "DevALL studio",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
                null, options1, null);
        
		if (result == JOptionPane.YES_OPTION){
        	
        panggil.nama1 = nama;
		panggil.kerja1 =kerja;
		panggil.lahir1 =lahir;
		panggil.gender1 =gender;
		panggil.hape1 =hape;
		panggil.email1 =email;
		
        panggil.Login();
        }
        else if (result == JOptionPane.NO_OPTION){
        	
        	panggil1.nama2 = nama;
        	panggil1.pass2 = pass;
     		panggil1.kerja2 =kerja;
     		panggil1.lahir2 =lahir;
     		panggil1.gender2 =gender;
     		panggil1.hape2 =hape;
     		panggil1.email2 =email;
        	panggil1.Login();
        }
        else if (result == JOptionPane.CANCEL_OPTION)
        	{panggil2.konfirmasi();
        }
        else
        	{System.exit(0);
     }
		}
  }