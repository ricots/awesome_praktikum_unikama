import java.util.Scanner;
import javax.swing.JOptionPane;
public class tiket {
public void kedua(){
		
		 Scanner show = new Scanner(System.in);
		 
		 System.out.println ("=========== Tiket Keereta Api ============");
		 System.out.println ("==========================================");
		 System.out.println ("||   	1. Malang   --> Surabaya	Rp 3000	||");
		 System.out.println ("|| 	2. Surabaya --> Malang 		Rp 3000	||");
		 System.out.println ("|| 	3. Malang   --> Jakarta 	Rp 4000	||");
		 System.out.println ("|| 	4. Jakarta  --> Malang 		Rp 4000	||");
		 System.out.println ("==========================================");
		 
		 System.out.println ("========= Jadwal Pemberangkatan ==========");
		 System.out.println ("==========================================");
		 System.out.println ("|| 	1. Pagi   --> 05.00-09.00 	Rp 2000	||");
		 System.out.println ("|| 	2. Sore   --> 01.00-16.00 	Rp 2500	||");
		 System.out.println ("|| 	3. Malam  --> 17.00-21.00 	Rp 2500	||");
		 System.out.println ("==========================================");
		 		
		 System.out.println ("=========== Tiket Kereta Api =============");
		 System.out.print("Pilih Jurusan	: ");
		 int pil =show.nextInt();
		 String jurusan = show.nextLine();
		 
		 System.out.print("Pilih Jadwal	: ");
		 int jad =show.nextInt();
		 String jadwal = show.nextLine();
		 
		 System.out.println ("MASUKAN IDENTITAS ANDA");
		 System.out.print("NAMA		: " );
		 String nama = show.nextLine();
		 System.out.print("ALAMAT		: " );
		 String alt = show.nextLine();
		 System.out.print("UMUR		: " );
		 String umur = show.nextLine();
		 
		 System.out.println ("============= Kelas Kereta ===============");
		 System.out.println ("==========================================");
		 System.out.println ("|| 	1. EKONOMI 		Rp 1000		|| ");
		 System.out.println ("|| 	2. EKSEKUTIVE		Rp 1500		|| ");
		 System.out.println ("|| 	3. BISNIS 		Rp 2000		|| ");
		 System.out.println ("==========================================");
		
		 
		 System.out.print("Pilih Kelas	: ");	
		 int kls =show.nextInt();
		 String kelas = show.nextLine();
		 System.out.print("Jumlah Tiket	: ");
		 String jmltiket = show.nextLine();
				 
		//perhitungan
		 int a=Integer.valueOf(jmltiket);
		    int harga;int satu = 0,dua=0,  tiga=0;
		    int jmlbayar=0;
		    
		switch (pil){
		 case 1:
			 if (jurusan.equalsIgnoreCase("1"));
			    satu=3000;
			    break;
		 case 2:
			 if (jurusan.equalsIgnoreCase("2"));
			    satu=3000;
			    break;
		 case 3:
			 if (jurusan.equalsIgnoreCase("3"));
			    satu=4000;
			    break;
		 case 4:
			 if (jurusan.equalsIgnoreCase("4"));
			    satu=4000;
			 	 break;
		 default:
				 System.out.println("");
				 break;
			
		}
		
		
		switch (jad){
			case 1:
				if (jadwal.equalsIgnoreCase("pagi"));
				    dua=2000;
				    break;
			 case 2:
				 if (jadwal.equalsIgnoreCase("sore"));
				    dua=2500;
				    break;
			 case 3:
				 if (jadwal.equalsIgnoreCase("malam"));
				    dua=2500;
				    break;
			 default:
				 System.out.println("");
				 break;
			 }
		switch (kls){
			 case 1:
				 if (kelas.equalsIgnoreCase("ekonomi"));
				    tiga=1000;
			 	 break;
			 case 2:
				 if (kelas.equalsIgnoreCase("ekskutive"));
				    tiga=1500;
			 	 break;
			 case 3:
				 if (kelas.equalsIgnoreCase("bisnis"));
				    tiga=1500;
				    break;
			 default:
				 System.out.println("");
				 break;
			 }
		
		 harga=satu+dua+tiga;
		 jmlbayar=harga*a;
	   
	//print	 
	System.out.println("======================================================");
	System.out.println("- Print");
	System.out.println("-------------------------------------------------------");
	System.out.println("NAMA   			: "  + nama);
	System.out.println("ALAMAT  		: "  + alt);
	System.out.println("UMUR  			: "  + umur);

	System.out.print ("JURUSAN 		: " );
	switch (pil){
	 case 1:
		 System.out.print("Malang - Surabaya");
		 System.out.println(" 	Rp. 3000");
	 	 break;
	 case 2:
		 System.out.print("Surabaya - Malang");
		 System.out.println(" 	Rp. 3000");
	 	 break;
	 case 3:
		 System.out.print("Malang - Jakarta");
		 System.out.println(" 	Rp. 4000");
		 break;
	 case 4:
		 System.out.print("Jakarta - Malang");
		 System.out.println(" 	Rp. 4000");
		 break;
	 default:
		 System.out.println("Pilihan Kosong");
		 break;
	 }
	
	System.out.print ("JADWAL 			: " );
	switch (jad){
	 case 1:
		 System.out.print("Pagi - 05.00-09.00");
		 System.out.println(" 	Rp. 2000");
	 	 break;
	 case 2:
		 System.out.print("Sore - 01.00-16.00");
		 System.out.println(" 	Rp. 2500");
	 	 break;
	 case 3:
		 System.out.print("Malam - 17.00-2100");
		 System.out.println(" 	Rp. 2500");
		 break;
	 default:
		 System.out.println("Pilihan Kosong");
		 break;
	 }
	
	System.out.print("KELAS  			: ");
	switch (kls){
	 case 1:
		 System.out.print("EKONOMI ");
		 System.out.println(" 		Rp. 1000");
	 	 break;
	 case 2:
		 System.out.print("EKSEKUTIVE ");
		 System.out.println(" 		Rp. 1500");
	 	 break;
	 case 3:
		 System.out.print("BISNIS ");
		 System.out.println(" 		Rp. 1500");
		 break;
	 default:
		 System.out.println("Pilihan Kosong");
		 break;
	 }
	System.out.println("Harga 			: " +harga);
	System.out.println("Jumlah Tiket		: "+ jmltiket);
	
	
	System.out.println("Jumlah Bayar 		: "+ jmlbayar);
	System.out.println("-------------------------------------------------------");
	System.out.println("Complite");
	System.out.println("Terima Kasih Telah Mengunakan Jasa Kami :D");
	}

}