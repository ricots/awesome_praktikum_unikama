package UAS_Praktikum;

import javax.swing.JOptionPane;

public class Cek_In {

	public void x () {
		// TODO Auto-generated method stub
		String input,tgl,sakit,waktu,kamar,x;
		String a = null, d = null;
		int lama1,z,hasil,total = 0,total1 = 0,total2 = 0;
		int Kelas1 = 100000;
		int Kelas2 = 150000;
		int Kelas3 = 200000;
		int Kelasvip = 300000;
		int Kelassvip = 4000000;
		int admin = 100000;
		input = JOptionPane.showInputDialog(" Masukkan Nama ");
		tgl = JOptionPane.showInputDialog(" Masukkan Tgl Lahir ( dd/mm/yyyy )  ");
		sakit = JOptionPane.showInputDialog(" Sakit Apa ");
		waktu = JOptionPane.showInputDialog(" Waktu Anda Masuk\n" + "1. 04.00 - 11.00\n" + "2. 13.00 - 17.00\n" + "3. 19.00 - 22.00\n");
		if (waktu.equals("1")){
			a = "Di Tangani Oleh                              : - Dokter : Dr. Ahmad"
					+ "\n                                                             - Perawat : Devi ";
			JOptionPane.showMessageDialog(null, a);
		}else if (waktu.equals("2")){
			a = "Di Tangani Oleh                              : - Dokter : Dr. Sandy"
					+ "\n                                                             - Perawat : intan ";
			JOptionPane.showMessageDialog(null, a);
		}else if (waktu.equals("3")){
			a = "Di Tangani Oleh                              : -Dokter : Dr. Yoggi"
					+ "\n                                                             - Perawat : Putri ";
			JOptionPane.showMessageDialog(null, a);
		}else{
			JOptionPane.showMessageDialog(null, "Tidak Ada Yang Melayani ");
		}
		
		kamar = JOptionPane.showInputDialog(null, "Info Kamar Dan Harga\n" + "\n1. Kamar Kelas 1 	: Rp. 100.000\n" + "\n2. Kamar Kelas 2 	: Rp. 150.000\n" + 
				"\n3. Kamar Kelas 3 	: Rp. 200.000\n" + "\n4. Kamar Kelas VIP 	: Rp. 300.000\n" + "\n5. Kamar Kelas SVIP 	: Rp. 400.000\n" + "------------------------------\n" + 
				" Silahkan Pilih Kamar\n"
				);
		if (kamar.equals("1")){
			d = "Di Kamar                                          :-Kelas 1";
			JOptionPane.showMessageDialog(null, d);
			lama1 = Integer.parseInt(JOptionPane.showInputDialog("Berapa Lama Anda Di Rawat"));			
			total2 = (admin * lama1);
			total = (Kelas1*lama1);
			total1 = total2 + total;
			
		}else if (kamar.equals("2")){
			d = "Di Kamar                                          :-Kelas 2";
			JOptionPane.showMessageDialog(null, d);
			lama1 = Integer.parseInt(JOptionPane.showInputDialog("Berapa Lama Anda Di Rawat"));			
			total2 = (admin * lama1);
			total = (Kelas2*lama1);
			total1 = total2 + total;
			
		}else if (kamar.equals("3")){
			d = "Di Kamar                                          :-Kelas 3";
			JOptionPane.showMessageDialog(null, d);
			lama1 = Integer.parseInt(JOptionPane.showInputDialog("Berapa Lama Anda Di Rawat"));			
			total2 = (admin * lama1);
			total = (Kelas3*lama1);
			total1 = total2 + total;
			
		}else if (kamar.equals("4")){
			d = "Di Kamar                                          :-Kelas VIP";
			JOptionPane.showMessageDialog(null, d);
			lama1 = Integer.parseInt(JOptionPane.showInputDialog("Berapa Lama Anda Di Rawat"));			
			total2 = (admin * lama1);
			total = (Kelasvip*lama1);
			total1 = total2 + total;
			
		}else if (kamar.equals("5")){
			d = "Di Kamar                                          :-Kelas SVIP";
			JOptionPane.showMessageDialog(null, d);
			lama1 = Integer.parseInt(JOptionPane.showInputDialog("Berapa Lama Anda Di Rawat"));			
			total2 = (admin * lama1);
			total = (Kelassvip*lama1);
			total1 = total2 + total;
			
		}else{
			JOptionPane.showMessageDialog(null, "Pilihan salah");
		}
		
		//output
		JOptionPane.showMessageDialog( null, " ====================================================\n" +
				                            "                           PEMERINTAH KABUPATEN MALANG \n" + 
				                            "                                     RUMAH SAKIT Dr AHMED \n" + 
				                            "                         Jln. KLAYATAN No.03 MALANG 65147\n" +
				                            " ====================================================\n" + 
				                            "\nNama                                                : " + input + 
				                            "\nTgl Lahir                                           : " + tgl + 
				                            "\nSakit                                                  : " + sakit + 
				                            "\n"                              + a + 
				                            "\n"                              + d + 
				                            "\nBiaya Pelayanan Administrasi   : " + total2 + 
				                            "\nBiaya Kamar                                   : " + total + 
				                            "\n==================================================================" + 
				                            "\nTotal Pembayaran	                         : " + total1 );
		
		//Transaksi
		int bayar = Integer.parseInt(JOptionPane.showInputDialog("Masukkan Biaya Pembayaran"));
		hasil = bayar - total1;
		if (bayar < total1){ 
			JOptionPane.showMessageDialog(null, "Pembayaran Anda kurang : " + hasil + "\nAnda Tidak Diperbolehkan Keluar");
			System.exit(0);		
		}
		else if (bayar == total1){
			JOptionPane.showMessageDialog(null, "kembalian anda : " + hasil + "\nTerima kasih");
			System.exit(0);
		}
		else if(bayar > total1){
		}
			JOptionPane.showMessageDialog(null, "kembalian anda : " + hasil + "\nTerima Kasih ");
			System.exit(0);
	}
		
}


 