package UAS;
import javax.swing.JOptionPane;

public class keluar {
public void konfirmasi(){
	
	Pilihan_Karyawan_Manager panggil = new Pilihan_Karyawan_Manager();
	 
	Object[] options1 = { "Ya", "Tidak"};
	
	int keluar = JOptionPane.showOptionDialog(null, "Apakah anda yakin ingin keluar?", "DEVALL studio",
			
			JOptionPane.YES_NO_CANCEL_OPTION,
			JOptionPane.QUESTION_MESSAGE,
            null, options1, null);
	
	
	if (keluar==JOptionPane.YES_OPTION)
		{System.exit(0);
	}
	else if (keluar==JOptionPane.NO_OPTION)
		{panggil.pilihan();
		}
	else
		{System.exit(0);
	}
}
}
