
package uas.prakt;

import javax.swing.JOptionPane;

public class karyawan 
{
    public String Nl,ttl, jk , email, hp;
    public String a, b, c, d;
    public int hslGJ,jmlMsk ;
    public void log()
    {
        int gj = 100000;
            System.out.println(a);
            jmlMsk = Integer.parseInt(JOptionPane.showInputDialog( "masukkan jumlah masuk dalam 1 bulan \nsehari = 100000"));
                if (jmlMsk < 20)
                {
                    JOptionPane.showMessageDialog(null, "=========ANDA DI PECAT=========");
                    System.exit(0);
                }
                else
                {
                    hslGJ = gj * jmlMsk;
                    JOptionPane.showMessageDialog(null,"Nama                               : " + Nl + "\n"
                                + "Tempat Tanggal Tahir : " + ttl + "\n"
                                + "Jenis kelamin                : " +jk + "\n"
                                + "Email                                : " + email + "\n"
                                + "Nomer hp                        : " + hp +"\n"
                                + "Total gaji                           : " + hslGJ);
                }
    }
}
