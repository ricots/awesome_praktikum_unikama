package new_kasir;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.JOptionPane;

public class method {
public void kasyhir(){
	
	Scanner input = new Scanner(System.in);
	int jumlah,harga=0,i,pil=0;
	String user,password,nama_brg="";
     System.out.println( "MINIMARKET\n"
            + "1. beli barang \n"
            + "2. data barang \n"
            + "3. keluar"
            +"\nmasukkan pilihan = ");
     pil = input.nextInt();
     
    if (pil == 1){
    	System.out.println("masukkan username = ");
        user = input.next();
        System.out.println("masukkan pass = ");
        password = input.next();
        if ((user.equals("admin")) && (password.equals("123"))){
        	System.out.println( "anda berhasil login");
        }else{
        	System.out.println("password salah"); 
            System.out.println("pilih salah satu \n"
            + "1. beli barang \n"
            + "2. data barang \n"
            + "3. keluar");
           System.out.println("masukkan username");
           user = input.nextLine();
           System.out.println("masukkan password");
           password = input.nextLine();
        if (user.equals("zainul") && (password.equals("anwar"))){
        	System.out.println("anda berhasil login");
        }else{
        	System.out.println("password salah dan program akan di close"); 
           System.exit(0);
        }
        }
   
        			BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        			try {
        				System.out.println("Masukkan Jumlah Barang :");
        				jumlah = Integer.parseInt(baca.readLine());
        			for (i = 0; i < jumlah; i++)
        			{ 
        				System.out.print("masukan nama Barang ke -" + (i+1) + " :"); 
        				nama_brg = nama_brg + String.valueOf(baca.readLine()); 
        				System.out.print("masukan harga Barang ke -" + (i+1) + " :"); 
        				harga = harga + Integer.parseInt(baca.readLine()); 
        			} 
        			System.out.println("========================");
        			System.out.println("Total Pembelian : " + harga); 
        			System.out.println("anda membeli "+nama_brg +" " +"\nharga Rp."+harga+"\nterima kasih");
        			}
        			catch (IOException e) 
        			{ 
        				System.out.println("Error"); 
        				} 
        			}
    if(pil == 2){
    	System.out.println("Segala Kebutuhan anda Insyaallah Kami Sediakan");
    }if(pil==3){
    	System.out.println("terima kasih");
    	System.exit(0);
    }
    else{
    	System.out.println("salah");
    }
    }
	}

    
    
    			







       			
       				
       			
     
