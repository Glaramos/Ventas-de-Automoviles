

package com.mycompany.automovil;

import com.mycompany.automovil.igu.Principal;


public class Automovil {

    public static void main(String[] args) {
        
        //llamamos y hacemos visible a nuestra IGU (INTERFACE GRAFICA DE USUARIO)
        
      Principal princ = new Principal();
      princ.setVisible(true);
      princ.setLocationRelativeTo(null);
    }
}
