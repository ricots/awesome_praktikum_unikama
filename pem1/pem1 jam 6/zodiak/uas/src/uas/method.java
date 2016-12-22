package uas;

import java.time.Year;

import javax.swing.JOptionPane;
import javax.swing.text.html.Option;

import org.omg.CORBA.PUBLIC_MEMBER;

public class method {
	int tgl,bulan,nama;
	String[] user = new String[100];
	String[] pass = new String[100];
	String[] login1 = new String[100]  ;
	String[] login2 = new String[100]  ;    
	String username1 ;  
	  boolean login = false;
	  String password1 ;
	  int i;
	  String id2, pass2;
	  String username = null;      
	  String password = null ;

	public void login() {
		// TODO Auto-generated method stub
		String id2, pass2;
		 JOptionPane.showMessageDialog(null, "regristrasi dulu gan "); 
		 String id1=JOptionPane.showInputDialog("masukkan id ");
	     String pass1=JOptionPane.showInputDialog("masukkan pass ");
	      id2=JOptionPane.showInputDialog("masukkan id ");
	      pass2=JOptionPane.showInputDialog("masukkan password ");
	     if(id2.equals(id1)&&pass2.equals(pass1)){
	            JOptionPane.showMessageDialog(null, "login sukses");    
	        } 
	     else  {
			for(int i = 0; i<3; i++){
				 id2=JOptionPane.showInputDialog("masukkan id ");
			     pass2=JOptionPane.showInputDialog("masukkan password ");
			}
		}
	}
	public void loginlagi() {
		  
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
		    	JOptionPane.showMessageDialog(null, "gagal login");
		    	System.exit(0);
		    }
}
		    
		    if (login) {
		    	method celuk = new method();
				celuk.login1();
		    	
		    }
		    
		    String pilihan = JOptionPane.showInputDialog("pilihan \n 1.login lagi \n 2. register lagi  ");
			  int milih = Integer.parseInt(pilihan);
			if (milih==1) {
				method celuk = new method();
				celuk.login1();	
			}
			else if (milih==2) {
				method celuk = new method();
				celuk.loginarray();
			}

	}
	
	public void loginarray() {
		
		
		String oke = JOptionPane.showInputDialog("berapa data ? ");//showinput inputan ke string oke 
		  int oke2 = Integer.parseInt(oke);//menampung inputan variabel oke. integer.parseint : ngerubah inputan integer 
		  String username1 ;  
		  boolean login = false;//kondisi 2 true dan false. boolean login disetting kondisi salah
		  String password1 ;
		  int i;
		  String username = null;      
		  String password = null;
		  
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
			    	String pilihan = JOptionPane.showInputDialog( "password salah atau akun tidak ada, login lagi ? " );
			    	
			    	
			    }
	}
			    
			    if (login) {
			    	method celuk = new method();
					celuk.login1();
			    	
			    }
			    
			 
	
	}
		
		    public void login1() {
		JOptionPane.showMessageDialog(null, " ramalan \n program ramalan ini hanya untuk tahun kelahiran 1980 - 2016 \n kami tidak bertanggung jawab atas hasil ramalan!! "); 
		 String id1=JOptionPane.showInputDialog(" masukkan tahun  ");
		 int a = Integer.parseInt(id1);
		 if (a >= 1980 && a <= 2016 ) {
	          JOptionPane.showMessageDialog(null, "tahun lahir sesuai");
		 }
		 else  {
				JOptionPane.showMessageDialog(null, "tahun kelahiran tidak sesuai ");
				System.exit(0);
			}
		 String nama= JOptionPane.showInputDialog("masukkan nama anda ");
			String tgl1= JOptionPane.showInputDialog("masukkan tanggal lahir ");
			int tanggal = Integer.parseInt(tgl1);
			String bln= JOptionPane.showInputDialog("masukkan bulan ");
			int bulan = Integer.parseInt(bln);
			
			
			
			
			if ((tanggal > 19 && tanggal <= 31 && bulan==1 || tanggal>0 && tanggal<=18 && bulan==2)) {
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK AQUARIUS 2014 (20 Januari - 18 Februari)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: jangan terlalu banyak konsumsi janji manis \n hari baik : Rabu ");
				
			}
			else if((tanggal>18 && tanggal<=29 && bulan==2||tanggal>0 && tanggal<=20 && bulan==3)) {
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK PISCES 2014 (19 Februari - 20 Maret)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: anda mulai lelah akhir2 ini \n hari baik : sabtu");
			}
				
				
			else if((tanggal>20 && tanggal<=31 && bulan==3 || tanggal>0 && tanggal<=20 && bulan==4)){
					JOptionPane.showMessageDialog(null, "(RAMALAN ZODIAK ARIES 2014 21 Maret - 20 April)");
					JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: anda harus rajin olahraga \n hari baik : minggu");
				}
			else if((tanggal>20 && tanggal<=30 && bulan==4 || tanggal>0 && tanggal<=20 && bulan==5)){
				JOptionPane.showMessageDialog(null, "(RAMALAN ZODIAK TAURUS 2014 (21 April - 20 Mei)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"hati2 dengan penyakit lambung \n hari baik : selasa");
			}
				
			else if((tanggal>20 && tanggal<=31 && bulan==5 || tanggal>0 && tanggal<=20 && bulan==6)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK GEMINI 2014 (21 Mei - 20 Juni)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: anda mulai lelah akhir2 ini \n hari baik : jum'at");
			}
			else if((tanggal>20 && tanggal<=30 && bulan==6 || tanggal>0 && tanggal<=20 && bulan==7)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK CANCER 2014 (21 Juni - 20 Juli) ");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: jangan tidur terlalu larut malam \n hari baik : sabtu");
			}
			else if((tanggal>20 && tanggal<=31 && bulan==7 || tanggal>0 && tanggal<=21 && bulan==8)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK LEO 2014 (21 Juli - 21 Agustus)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: anda mulai lelah akhir2 ini \n hari baik : selasa");
			}
			
			else if((tanggal>21 && tanggal<=31 && bulan==8 || tanggal>0 && tanggal<=22 && bulan==9)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK VIRGO 2014 (22 Agustus - 22 September)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: akhir2 ini akan ada sedikit gangguan perut \n hari baik : kamis");
			}
			else if((tanggal>22 && tanggal<=30 && bulan==9 || tanggal>0 && tanggal<=22 && bulan==10)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK LIBRA 2014 (23 September - 22 Oktober)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: anda harus menyempatkan refresing  \n hari baik : sabtu");
			}
			
			else if((tanggal>22 && tanggal<=31 && bulan==10 || tanggal>0 && tanggal<=22 && bulan==11)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK SCORPIO 2014 (23 Oktober - 22 November)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: akan ada sedikit pada perut, mungkin anda hamil  \n hari baik : rabu");
		}
			else if((tanggal>22 && tanggal<=30 && bulan==11 || tanggal>0 && tanggal<=20 && bulan==12)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK SAGITARIUS 2014 (23 November - 20 Desember)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: hati2 gangguan pencernaaan \n hari baik : sabtu");
				}
			else if((tanggal>20 && tanggal<=31 && bulan==12 || tanggal>0 && tanggal<=19 && bulan==1)){
				JOptionPane.showMessageDialog(null, "RAMALAN ZODIAK CAPRICORN 2014 (21 Desember - 19 Januari)");
				JOptionPane.showMessageDialog(null, "nama : "+nama+"\n"+"kesehatan anda: duduk terlalu lama hati2 ambeyen \n hari baik : sabtu");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "anda salah input ");
			}
		   
		}
	     
	 
	}
	
	

