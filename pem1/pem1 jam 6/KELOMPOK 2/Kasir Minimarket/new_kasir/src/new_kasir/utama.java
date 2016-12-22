package new_kasir;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class utama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method nyeluk = new method();
		nyeluk.kasyhir();

		Scanner masuk = new Scanner(System.in);
		String ulang;
		System.out.println("ulang (y/t)?");
		ulang = masuk.next();
		if(ulang.equals("y")){
			nyeluk.kasyhir();

		}else{
			System.exit(0);
		}
		
	}

}
