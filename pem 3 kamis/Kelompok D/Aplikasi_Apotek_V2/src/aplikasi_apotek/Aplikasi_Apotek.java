package aplikasi_apotek;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import com.jtattoo.plaf.texture.TextureLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Aplikasi_Apotek {

     public static void main(String args[]) throws UnsupportedLookAndFeelException {
   
        Loading ld = new Loading();
        ld.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                ld.getProgressBar().setValue(i);
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Loading.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        ld.dispose();
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_Apotek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        
         UIManager.setLookAndFeel(new GraphiteLookAndFeel()); 
        TextureLookAndFeel.setTheme("Textile", "", "");

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tampilan_Login().setVisible(true);
            }
        });
    }
    
    
}

