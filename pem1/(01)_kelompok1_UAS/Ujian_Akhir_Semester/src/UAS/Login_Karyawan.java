package UAS;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Karyawan {

	String nama2,pass2,kerja2,lahir2,gender2,hape2,email2;

	public void Login(){
		
		Data_Karyawan panggil=new Data_Karyawan();
		
		JTextField username = new JTextField();
		JTextField password = new JPasswordField();
		Object[] message = {
		    "Username:", username,
		    "Password:", password
		};

		int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
		if (option == JOptionPane.OK_OPTION) {
			if (username.getText().equals(nama2) && password.getText().equals(pass2)) {
		        JOptionPane.showMessageDialog(null,"Login successful");
		        
		        panggil.nama3 = nama2;
				panggil.kerja3 =kerja2;
				panggil.lahir3 =lahir2;
				panggil.gender3 =gender2;
				panggil.hape3 =hape2;
				panggil.email3 =email2;
		        panggil.data_kar();
		    } else {
		    	JOptionPane.showMessageDialog(null,"login failed");
		    	
		    }
		} else {
			JOptionPane.showMessageDialog(null,"Login canceled");
		}
		}
}
