package prak_UAS;

//import java.awt.JobAttributes;

import javax.swing.JOptionPane;



public class prak_UAS_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*deklarasi*/
		String pesan; 
		
		prak_method_UAS panggil=new prak_method_UAS();
		panggil.pesan();
		
		pesan = JOptionPane.showInputDialog(null,"Masukkan Pilihan :\n 1. Login\n 2.Keluar ");
		
	if (pesan.equals("1")) 
	{
		
		prak_method_UAS panggil1=new prak_method_UAS();
		panggil1.nama();
		
		prak_method_UAS panggil2=new prak_method_UAS();
		panggil2.lembur_anak();
	}
	
	else if (pesan.equals("2"))  {
			JOptionPane.showMessageDialog(null, "Terima Kasih");
	}
	
	else {
		JOptionPane.showMessageDialog(null, "Terima Kasih");
	}
		
		
	
				
}
}

