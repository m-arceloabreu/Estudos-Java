/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m;

import dm20212m.view.manterpessoa.ManterPessoa;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Dm20212m {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int ops = Integer.parseInt(JOptionPane.showInputDialog("PESSOA = 1"));
        
        if( ops == 1){
            ManterPessoa.montarTela();
        }
        
        
    }
    
}
