import javax.management.modelmbean.RequiredModelMBean;
import javax.swing.JOptionPane;
	import java.nio.channels.ShutdownChannelGroupException;

	public class login {
		public void pertama() {
			String b;
			b="SELAMAT DATANG DI PEMESANAN TIKET KERETA API ";
			JOptionPane.showMessageDialog(null,b);
			
			int a=JOptionPane.showConfirmDialog(null, "Silahkan Register"," Register",
	                JOptionPane.YES_NO_CANCEL_OPTION);
	        if(a==0){
	        	String id1=JOptionPane.showInputDialog("Register ID");
				String pass1=JOptionPane.showInputDialog("Register password");
				int angka=3;
				for(int f=0; f<angka; f++){
					String id2=JOptionPane.showInputDialog("Masukkan ID");
					String pass2=JOptionPane.showInputDialog("Masukkan Password");
				if (id1.equals(id2)&&pass1.equals(pass2)){
					JOptionPane.showMessageDialog(null, "Login Sukses");
					tiket celok=new tiket();
					celok.kedua();
					System.exit(0);
				}else{	
					
					int c=JOptionPane.showConfirmDialog(null, "login Gagal > Silahkan Login Kembai","Laman Login",
			                JOptionPane.YES_NO_OPTION);
					if (c==1) {
						System.exit(0);
					}		
					
				}
				}
				
				
	       
	                       
	        }else if(a==1){
	        	System.exit(0);
	        }else if(a==2){
	        	System.exit(0);
	        }else{
	            System.exit(0);
	        }
						
		}
	}
	
		