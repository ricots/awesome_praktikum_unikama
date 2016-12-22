import java.util.Scanner;

import javax.swing.JOptionPane;

public class uas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner( System.in);
		int Galaxi_A5,Galaxi_A3,Experia_Z3,Xperia_M2,NGalaxi_V,Galaxi_J1;
		int Oppo_Joy,Oppo_R5;
		int Expreia_E3,Experia_M2,Expreia_C3;
		int Z10,Z3;
		int A369i,P70,A516;
		int Mi5s,s3,redmi,frime;
		String alamat,email,nohp;
		String nama;
		String pasword = null;
		String nama1 = null;
		String pasword1 = null;
		JOptionPane.showMessageDialog(null,"Silakan anda melakukan\n Register terlebih dahulu");
		nama1 =JOptionPane.showInputDialog("Username");
		pasword1=JOptionPane.showInputDialog("pasword");
		email =JOptionPane.showInputDialog("E-mail");
		alamat =JOptionPane.showInputDialog("Alamat");
		nohp =JOptionPane.showInputDialog("No Hp");
		
		
		JOptionPane.showMessageDialog(null,"Silahkan Login");
		nama =JOptionPane.showInputDialog("Username");
		pasword=JOptionPane.showInputDialog("pasword");
		if(nama1.equals(nama)&&pasword1.equalsIgnoreCase(pasword)){
			JOptionPane.showMessageDialog(null," Selamat datang di \" NIAGA CELL \"\n     Selamat berbelanja...!!!");
			String pilih = JOptionPane.showInputDialog("DAFTAR MEREK HP ANDROID TERBARU : \n1. SAMSUNG \n2. OPPO \n3. SONY \n4. BLACBERRY \n5. LENOVO \n6. XIAOMI");
			if (pilih.equals("1")){
				String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp SAMSUNG : \na. Galaxi A5  \nb. Galaxi A3 \nc. Experia Z3 \nd. Xperia M2 \ne. Galaxi V \nf. Galaxi J1 ");
				if (pilih1.equals("a")){
					 JOptionPane.showMessageDialog(null,"Samsung Galxi A5 \nHarga : RP. 4.600.000");
					 Galaxi_A5 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Galaxi_A5*4600000));
				}else if (pilih1.equals("b")) { 
					 JOptionPane.showMessageDialog(null,"Samsung Galxi A3 \nHarga : RP. 3.000.000");
					 Galaxi_A3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Galaxi_A3*3000000));
				}else if (pilih1.equals("c")) { 
					 JOptionPane.showMessageDialog(null,"Samsung Experia Z3 \nHarga : RP. 6.700.000");
					 Experia_Z3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Experia_Z3*6700000));	
				}else if (pilih1.equals("d")) {
					 JOptionPane.showMessageDialog(null,"Samsung Xperia M2 \nHarga : RP. 2.900.000");
					 Xperia_M2 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Xperia_M2*2900000));	
				}else if (pilih1.equals("e")) {
					 JOptionPane.showMessageDialog(null,"Samsung Galaxi V \nHarga : RP. 1.150.000");
					 NGalaxi_V =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(NGalaxi_V*1150000));
				}else if (pilih1.equals("f")) {
					 JOptionPane.showMessageDialog(null,"Samsung Galaxi J1 \nHarga : RP. 1.550.000");
					 Galaxi_J1 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Galaxi_J1*1550000));
				}
					   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
					   if (pilih2.equals("a")){
						   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
						  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
				       }else if (pilih2.equals("b")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }else if (pilih2.equals("c")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }
					   
			}else if (pilih.equals("2")){
		    	 String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp OPPO : \na. Oppo Joy \nb. Oppo R5 ");
		    	 if (pilih1.equals("a")){
		    		 JOptionPane.showMessageDialog(null,"Oppo Joy \nHarga : RP. 1.299.000");
		    		 Oppo_Joy =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Oppo_Joy*1299000));
		    	 }else if (pilih1.equals("b")){
		    		 JOptionPane.showMessageDialog(null,"Oppo R5 \nHarga : RP. 6.499.000");
		    		 Oppo_R5 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Oppo_R5*6499000));
		    	 }
		    	    String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
				   if (pilih2.equals("a")){
					   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
					  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
			       }else if (pilih2.equals("b")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			       }else if (pilih2.equals("c")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
		    	 
			       }
				   
			}else if (pilih.equals("3")){
		    	String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp SONY : \na. Expreia E3 \nb. Experia M2 \nc. Experia C3  ");
		    	if (pilih1.equals("a")){
		    		JOptionPane.showMessageDialog(null,"Expreia E3 \nHarga : RP. 2.100.000");
		    		Expreia_E3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Expreia_E3*2100000));
		    	}else if (pilih1.equals("b")){
		    		JOptionPane.showMessageDialog(null,"Expreia M2 \nHarga : RP. 2.100.000");
		    		Experia_M2 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Experia_M2*2100000));
		    	}else if (pilih1.equals("c")){
		    		JOptionPane.showMessageDialog(null,"Expreia C3 \nHarga : RP. 2.650.000");
		    		Expreia_C3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Expreia_C3*2650000));
		    	}
		    	
		    	 String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
				   if (pilih2.equals("a")){
					   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
					  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
			       }else if (pilih2.equals("b")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			       }else if (pilih2.equals("c")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
		  	 
			       }
				   
			}else if (pilih.equals("4")){
		    	String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp BLACBERRY : \na. Blackbrry Z10 \nb. Blackbrry Z3 ");
		    	if (pilih1.equals("a")){
		    		JOptionPane.showMessageDialog(null,"Blackbrry Z10 \nHarga : RP. 3.225.000");
		    		Z10 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Z10*3225000));
		    	}else if (pilih1.equals("b")){
		    		JOptionPane.showMessageDialog(null,"Blackbrry Z3 \nHarga : RP. 2.600.000");
		    		Z3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Z3*2600000));	
		    	}
		    	   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
				   if (pilih2.equals("a")){
					   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
					  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
			       }else if (pilih2.equals("b")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			       }else if (pilih2.equals("c")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			 
			       }
				   
			 }else if (pilih.equals("5")){
			    	String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp LENOVO : \na. Lenovo A369i \nb. Lenovo P70 \nc. Lenovo A516 ");
			    	if (pilih1.equals("a")){
			    	JOptionPane.showMessageDialog(null,"Lenovo A369i \nHarga : RP. 960.000");
			    	A369i =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(A369i*960000));
			       }else if (pilih1.equals("b")){
			    	JOptionPane.showMessageDialog(null,"Lenovo P70 \nHarga : RP. 2.899.000");
			    	 P70  =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
			   		JOptionPane.showMessageDialog(null, "Harga " +( P70 *2899000));   
			       }else if (pilih1.equals("c")){
			    	JOptionPane.showMessageDialog(null,"Lenovo A516 \nHarga : RP. 1.550.000");
			    	A516  =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
			        JOptionPane.showMessageDialog(null, "Harga " +( A516 *1550000));    
			       }
			    	   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
					   if (pilih2.equals("a")){
						   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
						  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
				       }else if (pilih2.equals("b")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }else if (pilih2.equals("c")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				 
				       }					   
			 }else if (pilih.equals("6")){
					String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp XIAOMI : \na. Xiomi Mi5s \nb. Xiaomi redmi 3s prime \nc. Xiaomi redmi 4 \nd. Xiaomi redmi 3 frime ");   
					   if (pilih1.equals("a")){  
						   JOptionPane.showMessageDialog(null,"Xiomi Mi5s \nHarga : RP. 3.800.000");
						   Mi5s =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(Mi5s*3800000));   
					   }if (pilih1.equals("b")){
						   JOptionPane.showMessageDialog(null,"Xiaomi redmi 3s prime \nHarga : RP. 1.850.000");
						   s3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(s3*1850000));  
					   }if (pilih1.equals("c")){
						   JOptionPane.showMessageDialog(null,"Xiaomi redmi 4 \nHarga : RP. 960.000");
						   redmi =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(redmi*960000));  
					   }if (pilih1.equals("d")){
						   JOptionPane.showMessageDialog(null,"Xiaomi redmi 3 frime \nHarga : RP. 2.400.000");
						   frime =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(frime*2400000));
					   }
					   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
					   if (pilih2.equals("a")){
						  JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  "); 
						  JOptionPane.showMessageDialog(null,"Terimakasih anda telah berbelanja di \" NIAGA CELL \"");
					   }else if (pilih2.equals("b")){
						   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }else if (pilih2.equals("c")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }
					   
		}else {
			JOptionPane.showMessageDialog(null,"pilhan salah");
		}System.exit(0);
	}
		JOptionPane.showMessageDialog(null,"Username dan Pasword salah..!!\n    Silahkan Login kembali");
		nama =JOptionPane.showInputDialog("Username");
		pasword=JOptionPane.showInputDialog("pasword");
		if(nama1.equals(nama)&&pasword1.equalsIgnoreCase(pasword)){
			JOptionPane.showMessageDialog(null," Selamat datang di \" NIAGA CELL \"\n     Selamat berbelanja...!!!");
			String pilih = JOptionPane.showInputDialog("DAFTAR MEREK HP ANDROID TERBARU : \n1. SAMSUNG \n2. OPPO \n3. SONY \n4. BLACBERRY \n5. LENOVO \n6. XIAOMI");
			if (pilih.equals("1")){
				String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp SAMSUNG : \na. Galaxi A5  \nb. Galaxi A3 \nc. Experia Z3 \nd. Xperia M2 \ne. Galaxi V \nf. Galaxi J1 ");
				if (pilih1.equals("a")){
					 JOptionPane.showMessageDialog(null,"Samsung Galxi A5 \nHarga : RP. 4.600.000");
					 Galaxi_A5 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Galaxi_A5*4600000));
				}else if (pilih1.equals("b")) { 
					 JOptionPane.showMessageDialog(null,"Samsung Galxi A3 \nHarga : RP. 3.000.000");
					 Galaxi_A3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Galaxi_A3*3000000));
				}else if (pilih1.equals("c")) { 
					 JOptionPane.showMessageDialog(null,"Samsung Experia Z3 \nHarga : RP. 6.700.000");
					 Experia_Z3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Experia_Z3*6700000));	
				}else if (pilih1.equals("d")) {
					 JOptionPane.showMessageDialog(null,"Samsung Xperia M2 \nHarga : RP. 2.900.000");
					 Xperia_M2 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Xperia_M2*2900000));	
				}else if (pilih1.equals("e")) {
					 JOptionPane.showMessageDialog(null,"Samsung Galaxi V \nHarga : RP. 1.150.000");
					 NGalaxi_V =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(NGalaxi_V*1150000));
				}else if (pilih1.equals("f")) {
					 JOptionPane.showMessageDialog(null,"Samsung Galaxi J1 \nHarga : RP. 1.550.000");
					 Galaxi_J1 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Galaxi_J1*1550000));
				}
					   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
					   if (pilih2.equals("a")){
						   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
						  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
				       }else if (pilih2.equals("b")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }else if (pilih2.equals("c")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }
					   
			}else if (pilih.equals("2")){
		    	 String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp OPPO : \na. Oppo Joy \nb. Oppo R5 ");
		    	 if (pilih1.equals("a")){
		    		 JOptionPane.showMessageDialog(null,"Oppo Joy \nHarga : RP. 1.299.000");
		    		 Oppo_Joy =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Oppo_Joy*1299000));
		    	 }else if (pilih1.equals("b")){
		    		 JOptionPane.showMessageDialog(null,"Oppo R5 \nHarga : RP. 6.499.000");
		    		 Oppo_R5 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					 JOptionPane.showMessageDialog(null, "Harga " +(Oppo_R5*6499000));
		    	 }
		    	    String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
				   if (pilih2.equals("a")){
					   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
					  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
			       }else if (pilih2.equals("b")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			       }else if (pilih2.equals("c")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
		    	 
			       }
				   
			}else if (pilih.equals("3")){
		    	String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp SONY : \na. Expreia E3 \nb. Experia M2 \nc. Experia C3  ");
		    	if (pilih1.equals("a")){
		    		JOptionPane.showMessageDialog(null,"Expreia E3 \nHarga : RP. 2.100.000");
		    		Expreia_E3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Expreia_E3*2100000));
		    	}else if (pilih1.equals("b")){
		    		JOptionPane.showMessageDialog(null,"Expreia M2 \nHarga : RP. 2.100.000");
		    		Experia_M2 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Experia_M2*2100000));
		    	}else if (pilih1.equals("c")){
		    		JOptionPane.showMessageDialog(null,"Expreia C3 \nHarga : RP. 2.650.000");
		    		Expreia_C3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Expreia_C3*2650000));
		    	}
		    	
		    	 String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
				   if (pilih2.equals("a")){
					   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
					  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
			       }else if (pilih2.equals("b")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			       }else if (pilih2.equals("c")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
		  	 
			       }
				   
			}else if (pilih.equals("4")){
		    	String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp BLACBERRY : \na. Blackbrry Z10 \nb. Blackbrry Z3 ");
		    	if (pilih1.equals("a")){
		    		JOptionPane.showMessageDialog(null,"Blackbrry Z10 \nHarga : RP. 3.225.000");
		    		Z10 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Z10*3225000));
		    	}else if (pilih1.equals("b")){
		    		JOptionPane.showMessageDialog(null,"Blackbrry Z3 \nHarga : RP. 2.600.000");
		    		Z3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(Z3*2600000));	
		    	}
		    	   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
				   if (pilih2.equals("a")){
					   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
					  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
			       }else if (pilih2.equals("b")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			       }else if (pilih2.equals("c")){
			    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
					   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
			 
			       }
				   
			 }else if (pilih.equals("5")){
			    	String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp LENOVO : \na. Lenovo A369i \nb. Lenovo P70 \nc. Lenovo A516 ");
			    	if (pilih1.equals("a")){
			    	JOptionPane.showMessageDialog(null,"Lenovo A369i \nHarga : RP. 960.000");
			    	A369i =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
					JOptionPane.showMessageDialog(null, "Harga " +(A369i*960000));
			       }else if (pilih1.equals("b")){
			    	JOptionPane.showMessageDialog(null,"Lenovo P70 \nHarga : RP. 2.899.000");
			    	 P70  =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
			   		JOptionPane.showMessageDialog(null, "Harga " +( P70 *2899000));   
			       }else if (pilih1.equals("c")){
			    	JOptionPane.showMessageDialog(null,"Lenovo A516 \nHarga : RP. 1.550.000");
			    	A516  =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
			        JOptionPane.showMessageDialog(null, "Harga " +( A516 *1550000));    
			       }
			    	   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
					   if (pilih2.equals("a")){
						   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  ");
						  JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" "); 
				       }else if (pilih2.equals("b")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }else if (pilih2.equals("c")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				 
				       }
			
			 }else if (pilih.equals("6")){
					String pilih1 = JOptionPane.showInputDialog("DAFTAR Hp XIAOMI : \na. Xiomi Mi5s \nb. Xiaomi redmi 3s prime \nc. Xiaomi redmi 4 \nd. Xiaomi redmi 3 frime ");   
					   if (pilih1.equals("a")){  
						   JOptionPane.showMessageDialog(null,"Xiomi Mi5s \nHarga : RP. 3.800.000");
						   Mi5s =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(Mi5s*3800000));   
					   }if (pilih1.equals("b")){
						   JOptionPane.showMessageDialog(null,"Xiaomi redmi 3s prime \nHarga : RP. 1.850.000");
						   s3 =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(s3*1850000));  
					   }if (pilih1.equals("c")){
						   JOptionPane.showMessageDialog(null,"Xiaomi redmi 4 \nHarga : RP. 960.000");
						   redmi =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(redmi*960000));  
					   }if (pilih1.equals("d")){
						   JOptionPane.showMessageDialog(null,"Xiaomi redmi 3 frime \nHarga : RP. 2.400.000");
						   frime =Integer.parseInt(JOptionPane.showInputDialog("Jumlah barang yang dibeli"));
						   JOptionPane.showMessageDialog(null, "Harga " +(frime*2400000));
					   }
					   String pilih2 = JOptionPane.showInputDialog("Pilih BANK yang ingin anda tranfer : \na.BNI \nb.BRI \nc.BTN");
					   if (pilih2.equals("a")){
						  JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Siti jaenap\nNo Rekening : 1067xxxxxxxxxxx  "); 
						  JOptionPane.showMessageDialog(null,"Terimakasih anda telah berbelanja di \" NIAGA CELL \"");
					   }else if (pilih2.equals("b")){
						   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Slamat Dunia Akhirat\nNo Rekening : 20687xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }else if (pilih2.equals("c")){
				    	   JOptionPane.showMessageDialog(null, " Silahakan anda transtfer di rekening : \nNama : Muin Amin\nNo Rekening : 3089xxxxxxxxxxx  ");
						   JOptionPane.showMessageDialog(null, " Terimakasih anda telah berbelanja di \" NIAGA CELL \" ");
				       }
				  
		}else {
			JOptionPane.showMessageDialog(null,"pilhan salah");
		}System.exit(0);
	}
	
  }
}

