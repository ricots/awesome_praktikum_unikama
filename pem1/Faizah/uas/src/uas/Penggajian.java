package uas;

import java.awt.Component;
import java.awt.geom.Line2D.Float;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Penggajian {
	public void register(){
		String user,password,a = null,b = null;
	
		user = JOptionPane.showInputDialog(null,"masukkan username");
        password = JOptionPane.showInputDialog(null,"masukkan password");
        JOptionPane.showMessageDialog(null, "registrasi berhasil");
     
        a = JOptionPane.showInputDialog(null,"masukkan username");
        b = JOptionPane.showInputDialog(null,"masukkan password");
        
            if (a.equals(user) && (b.equals(password))){
                JOptionPane.showMessageDialog(null, "anda berhasil login");
            }else {
                JOptionPane.showMessageDialog(null, "password salah");
                System.exit(0);
            }   
         }


	public void gaji(){
		
	int cetak=0;
	String nama,nik;
	long karyawan,i,pokok,gaji,potongan;
	int  jam,lembur,hari;
	
	karyawan= Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah karyawan : "));
	
	for(i=1;i<=karyawan;i++){
	
		nama=JOptionPane.showInputDialog("Masukkan Nama : ");
		
		nik=JOptionPane.showInputDialog("Masukan NIK : ");
		pokok=Integer.parseInt(JOptionPane.showInputDialog("Masukan gaji pokok : "));
		jam=Integer.parseInt(JOptionPane.showInputDialog("Masukan jam lembur : "));
		hari=Integer.parseInt(JOptionPane.showInputDialog(null, "Masukkan jumlah hari alfa : "));
		
			potongan=20000*hari;
			lembur=25000*jam;
			gaji=pokok+lembur-potongan;
	
		cetak= JOptionPane.showConfirmDialog(null, "Apakah anda ingin mencetak slip gaji? ");
		if(cetak == JOptionPane.CANCEL_OPTION)
            System.exit(0);
		if(cetak == JOptionPane.NO_OPTION)
            System.exit(0);
		if(cetak == JOptionPane.YES_OPTION)
             {

		JOptionPane.showMessageDialog(null, "========================================\n"
				+ "SLIP GAJI PT. VITAPHARM DESEMBER 2016 \n"
				+"========================================\n"
				+"Nama			: "+ nama +"\n"
				+"NIK 			: "+ nik +"\n"
				+"Gaji Pokok  	: "+ pokok +"\n"
				+"Jam Lembur  	: "+ lembur +"\n"
				+"Potongan gaji : "+ potongan +"\n"
				+"Total Gaji  	: "+ gaji +"\n"
			
				+"========================================\n"
				+"                                              Ttd      \n"
				+"\n"
				+"\n"
				+"                                              "+nama);
			
             	
             	}
			}
		}
		
	
	public void konfirmasi(){
	int confirm=0;
	 confirm = JOptionPane.showConfirmDialog(null, "Anda ingin keluar? ");
	
	 if(confirm == JOptionPane.YES_OPTION)
    	 System.exit(0);

	 if(confirm == JOptionPane.CANCEL_OPTION)
            
            if(confirm == JOptionPane.NO_OPTION);
				}
			}