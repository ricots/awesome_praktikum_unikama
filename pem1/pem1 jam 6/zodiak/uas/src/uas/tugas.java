package uas;

import javax.swing.JOptionPane;



public class tugas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method celuk = new method();
		celuk.loginarray();
		//celuk.login(); 
		
		
		String pilihan = JOptionPane.showInputDialog("pilihan \n 1.login lagi \n 2. register lagi  ");
		int milih = Integer.parseInt(pilihan);
		if (milih==1) {
			celuk.loginlagi();	
		}
		else if (milih==2) {
			celuk.loginarray();
		}
		else {
			System.exit(0);
		}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//celuk.login();
		//celuk.login();
		//celuk.login1();
		

		/*String[] user = new String[100];
		String[] pass = new String[100];
		String[] login1 = new String[100]  ;
		String[] login2 = new String[100]  ;
		
		String oke = JOptionPane.showInputDialog("berapa data ? ");
		  int oke2 = Integer.parseInt(oke);
		  String username1 ;  
		  boolean login = false;
		  String password1 ;
		  int i;
		  String username = null;      
		  String password = null ;
		  
			for ( i = 0; i< oke2; i++){
				JOptionPane.showMessageDialog(null, "silahkkan register ");
				 username1 = JOptionPane.showInputDialog("Masukkan nama:") ;      
				 password1 = JOptionPane.showInputDialog("Masukkan password:") ;
				
				    
				 	user[i] 	= username1;
				    pass[i] 	= password1;
				    
				    
				    
					
			}
			JOptionPane.showMessageDialog(null, "silahkkan login ");
			username = JOptionPane.showInputDialog("Masukan Nama Anda");
			password = JOptionPane.showInputDialog("Masukan Password Anda");
			
			for (i =0; i<4; i++){
				login1[i] = username;
				login2[i] = password;
				
			}	
			
	for( i=0 ; i<user.length ; i++){
			    
			    if (user[i].equals(username)&&pass[i].equals(password)) {
			    	login = true;
					break;
				}
			    else{
			    	System.exit(0);
			    }
	}
			    
			    if (login) {
			    	
					celuk.login1();
			    	
			    }
*/	
	
		
		

		
			    
		
	}


}