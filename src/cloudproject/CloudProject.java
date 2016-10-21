/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cloudproject;

import br.com.cloudproject.view.*;
import java.util.Arrays;
/**
 *
 * @author Debug
 */
public class CloudProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        telaPrincipal tela = new telaPrincipal();
        
        tela.setTitle("Cloud Project - MAP TI");
        tela.setExtendedState(tela.MAXIMIZED_BOTH);
        tela.setLocationRelativeTo(tela);
        tela.setVisible(true);
        
        // TODO code application logic here
    }
    
}
