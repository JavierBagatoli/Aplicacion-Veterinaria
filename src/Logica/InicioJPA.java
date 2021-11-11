
package Logica;

import Igu.Principal;

public class InicioJPA {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Principal princ = new Principal(control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        
    }
    
}
