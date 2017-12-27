package sistema_de_ventas_lsr;       /** @author Curso-09-04 */

import Vista.LogInUser;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

      
public class Sistema_de_Ventas_LSR {

    public static void main(String[] args) {
        LogInUser p = new LogInUser();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");//aluminium.AluminiumLookAndFeel  //hifi.HiFiLookAndFeel //noire.NoireLookAndFeel  //acryl.AcrylLookAndFeel //graphite.GraphiteLookAndFeel  //texture.TextureLookAndFeel //luna.LunaLookAndFeel //smart.SmartLookAndFeel //mint.MintLookAndFeel //mcwin.McWinLookAndFeel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Sistema_de_Ventas_LSR.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
