package project_uas;

import javax.swing.JOptionPane;

public class method_2 {

	public void UAS (){
	    String pesan = JOptionPane.showInputDialog(null, "pilih salah satu \n"
	                + "1. Beli Tiket \n"
	                + "2. Daftar Antar Kota \n"
	                + "3. keluar \n"
	                + " \n Masukan pilihan : ");
    if (pesan.equals("1")){
        String user = JOptionPane.showInputDialog(null,"masukkan username");
        String password = JOptionPane.showInputDialog(null,"masukkan password");
		if (user.equals("admin") && (password.equals("admin"))){
            JOptionPane.showMessageDialog(null, "anda berhasil login");
        }else{
           JOptionPane.showMessageDialog(null, "password salah"); 
           pesan = JOptionPane.showInputDialog(null, "pilih salah satu \n"
        		   + "1. Beli Tiket \n"
                   + "2. Daftar Antar Kota  \n"
                   + "3. keluar \n"
                   + " \n Masukan pilihan : ");
           user = JOptionPane.showInputDialog(null,"masukkan username");
             password = JOptionPane.showInputDialog(null,"masukkan password");
        if (user.equals("admin") && (password.equals("admin"))){
            JOptionPane.showMessageDialog(null, "anda berhasil login");
        }else{
           JOptionPane.showMessageDialog(null, "password salah dan program akan di close"); 
           System.exit(0);
        }
        }
        String menu = JOptionPane.showInputDialog(null,"\n Tiket Bus DAMRI Antar Kota : \n A. Surabaya - Madura "
        		+ "\n B. Malang  - Surabaya"
        		+ "\n C. Jombang - Malang"
        		+ "\n D. Malang  - Jakarta"
		 		+ " \n\n Masukan pilihan : ");               
        int confirmasi = 0;
		if (menu.equalsIgnoreCase("a")){
			JOptionPane.showMessageDialog(null, "Harga tiket Surabaya ke Madura Rp. 35.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli "));
            int total = beli * 35000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 08.30) \n Siang (Jam 12.50) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
		 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*35000)))));
		 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");	
            System.exit(0);
        } else
         if (menu.equalsIgnoreCase("b")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Malang ke Surabaya Rp. 25.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli "));
            int total = beli * 25000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 07.00) \n Siang (Jam 12.15) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
			 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*25000)))));
			 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        }
        else
         if (menu.equalsIgnoreCase("c")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Jombang ke Malang Rp. 30.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli "));
            int total = beli * 30000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 10.20) \n Siang (Jam 01.20) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
			 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*30000)))));
			 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        }
        else
         if (menu.equalsIgnoreCase("d")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Malang ke Jakarta Rp. 50.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli "));
            int total = beli * 50000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 09.20) \n Siang (Jam 12.40) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
			 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*50000)))));
			 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        } else{
            confirmasi = JOptionPane.showConfirmDialog(null, "daftar tidak ditemukan");
         }
        
        if(confirmasi == JOptionPane.CANCEL_OPTION)
        System.exit(0);
        if(confirmasi == JOptionPane.NO_OPTION)
        System.exit(0);
         if(confirmasi == JOptionPane.YES_OPTION)
        menu = JOptionPane.showInputDialog(null,"\n Tiket Bus DAMRI Antar Kota : \n A. Surabaya - Madura "
        		+ "\n B. Malang  - Surabaya "
        		+ "\n C. Jombang - Malang"
        		+ "\n D. Malang  - Jakarta"
        		+ " \n\n Masukan pilihan : "); 
        if (menu.equalsIgnoreCase("a")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Surabaya ke Madura Rp. 35.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah beli"));
            int total = beli * 35000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 08.30) \n Siang (Jam 12.50) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
		 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*35000)))));
		 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        } else
         if (menu.equalsIgnoreCase("b")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Malang ke Surabaya Rp. 25.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("masukkan jumlah beli"));
            int total = beli * 25000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 07.00) \n Siang (Jam 12.15) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
			 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*25000)))));
			 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        }
        else
         if (menu.equalsIgnoreCase("c")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Jombang ke Malang Rp. 30.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli "));
            int total = beli * 30000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 10.20) \n Siang (Jam 01.20) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
			 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*30000)))));
			 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        }
        else
         if (menu.equalsIgnoreCase("d")){
        	JOptionPane.showMessageDialog(null, "Harga tiket Malang ke Jakarta Rp. 50.000");
            int beli = Integer.parseInt(JOptionPane.showInputDialog("Masukkan jumlah beli "));
            int total = beli * 50000;
            JOptionPane.showMessageDialog(null, "Total Pembayaran = " + total + "\n");
            JOptionPane.showMessageDialog(null, "Jadwal Pemberangkatan : \n Pagi  (Jam 09.20) \n Siang (Jam 12.40) ");
            int uang = Integer.parseInt(JOptionPane.showInputDialog("Masukan uang : "));
			 	JOptionPane.showMessageDialog(null, "Total uang kembalian : " + (((uang)-((beli*50000)))));
			 	JOptionPane.showMessageDialog(null, "Terima kasih...!! \n");
            System.exit(0);
        }else{
            JOptionPane.showMessageDialog(null, "daftar tidak ditemukan lagi dan program akan di close");
            System.exit(0);
         }
    }
    if(pesan.equals("2")){
        JOptionPane.showMessageDialog(null, " 1. Surabaya - Madura \n 2. Malang - Surabaya \n "
        		+ "3. Jombang - Malang \n"
        		+ " 4. Malang - Jakarta \n");
        		
    }else{
        System.exit(0);
    }
  }

}

