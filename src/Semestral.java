/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestral;


import javax.swing.JFrame;
import semestral.view.Tela_principal;

/**
 *
 * @author guilh
 */
public class Semestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tamanhoX = 1366;
        int tamanhoY = 768;

        Tela_principal principal = new Tela_principal();
//       principal.setSize(tamanhoX,tamanhoY );
        principal.setVisible(true);
        
        principal.setExtendedState(JFrame.MAXIMIZED_BOTH);

    }
  
}
