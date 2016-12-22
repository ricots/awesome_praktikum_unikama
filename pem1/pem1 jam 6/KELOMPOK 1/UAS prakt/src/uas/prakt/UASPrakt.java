package uas.prakt;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class UASPrakt 
{
    public static void main(String[] args) 
    {
        String x,y;
        // TODO code application logic here
        karyawan log = new karyawan();
        JDialog.setDefaultLookAndFeelDecorated(true);
            
        JOptionPane.showMessageDialog(null, "============SELAMAT DATANG============ ");
	int respon = JOptionPane.showConfirmDialog(null, "karyawan harus register terlebih dahulu",
	"confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    //REGISTER KARYAWAN
            if (respon == JOptionPane.YES_OPTION){
                log.a = JOptionPane.showInputDialog( "register Username");
                log.b = JOptionPane.showInputDialog("password");
                log.Nl = JOptionPane.showInputDialog("Nama Lengkap");
                log.ttl = JOptionPane.showInputDialog("tempat tanggal lahir dd/mm/yyyy");
                log.jk = JOptionPane.showInputDialog("jenis kelamin");
                log.email = JOptionPane.showInputDialog("masukkan email");
                log.hp = JOptionPane.showInputDialog("masukkan nomer hp");
                JOptionPane.showMessageDialog(null, "selamat anda berhasil register");
            }
            else if (respon == JOptionPane.NO_OPTION){
                System.exit(0);
            }
    //LOGIN KARYAWAN
    int ggl = 3;
        while (ggl !=0)
        {		
            log.c = JOptionPane.showInputDialog("username");
            log.d = JOptionPane.showInputDialog("password");
                if (log.a.equals(log.c)&&(log.b.equals(log.d)))
                {
                    JOptionPane.showMessageDialog(null, "selamat datang " + log.a );
                    log.log();
                               

    //LOGIN MANAJER
    int ggl2 = 3;
        while (ggl2 !=0)
        {		
            x = JOptionPane.showInputDialog("Login Manajer");
            y = JOptionPane.showInputDialog("Password");
                if (x.equals("admin")&&(y.equals("manajer")))
                {
                    JOptionPane.showMessageDialog(null, "selamat datang manajer");
    //MELIHAT DATA KARYAWAN
                    JOptionPane.showMessageDialog(null,"========DATA KARYAWAN========"
                                                        + "\nNama Karyawan           : " + log.Nl + "\n"
                                                        + "Tempat Tanggal Tahir : " + log.ttl + "\n"
                                                        + "Jenis kelamin                : " +log.jk + "\n"
                                                        + "Email                                : " + log.email + "\n"
                                                        + "Nomer hp                        : " + log.hp +"\n"
                                                        + "Total gaji                           : " + log.hslGJ+ "\n"
                                                        + "========STATUS AKTIF========");
                    System.exit(0);
                }
                else
                    JOptionPane.showMessageDialog(null, "maaf user atau password salah \n\t        "
                                                        + "Silahkan login kembali");
                    ggl2--;	
        }
            if (ggl2 == 0)
            {
                JOptionPane.showMessageDialog(null, "OOPS.. maaf anda sudah melewati batas login");
                System.exit(0);
            }
    }
    else
        JOptionPane.showMessageDialog(null, "maaf user atau password salah \n\t        "
                                            + "Silahkan login kembali");
        ggl--;	
            }   
            if (ggl == 0)
            {
                JOptionPane.showMessageDialog(null,"OOPS.. maaf anda sudah melewati batas login");		
                System.exit(0);
            } 
    }
}
    
   
