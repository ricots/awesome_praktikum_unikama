package uas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class methodpenggajian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner masukan = new Scanner (System.in);
		Penggajian panggil = new Penggajian();
				
					panggil.register();

					panggil.gaji();
					
					panggil.konfirmasi();
					panggil.gaji();
					panggil.konfirmasi();
	}

}
