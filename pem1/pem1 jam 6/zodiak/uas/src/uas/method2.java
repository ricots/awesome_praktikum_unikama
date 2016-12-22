package uas;

import javax.swing.JOptionPane;

public class method2 {
public void login2(){
	
	String[] user = new String[100];
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
		
for( i=0 ; i<user.length ; i++){
		    
		    if (user[i].equals(username)&&pass[i].equals(password)) {
		    	login = true;
				break;
			}
		    else{
		    	System.exit(0);
		    }
	
		    
		    if (login) {
		    	
		    	
		    }
}
}

}
