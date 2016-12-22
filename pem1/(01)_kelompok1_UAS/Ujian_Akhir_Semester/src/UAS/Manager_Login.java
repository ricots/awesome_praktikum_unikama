package UAS;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Manager_Login {

	String nama1,kerja1,lahir1,gender1,hape1,email1;
	
public void Login(){
	Data_Manager panggil = new Data_Manager();
	
			JTextField username = new JTextField();
			JTextField password = new JPasswordField();
			Object[] message = {
			    "Username:", username,
			    "Password:", password
			};
			char ulang = 0;
			while (ulang=='Y'||ulang=='y');
			int option = JOptionPane.showConfirmDialog(null, message, "Login Manager", JOptionPane.OK_CANCEL_OPTION);
			if (option == JOptionPane.OK_OPTION) {
			    if (username.getText().equals("admin") && password.getText().equals("12345")) {
			        JOptionPane.showMessageDialog(null,"Login sukses");
			        panggil.nama2 = nama1;
					panggil.kerja2 =kerja1;
					panggil.lahir2 =lahir1;
					panggil.gender2 =gender1;
					panggil.hape2 =hape1;
					panggil.email2 =email1;
			        panggil.data_man();

			    } else {
			    	JOptionPane.showMessageDialog(null,"Akun yang anda masukkan salah");
			    	
			    }
			} else {
				JOptionPane.showMessageDialog(null,"Login dibatalkan");
			}
		}
		}
