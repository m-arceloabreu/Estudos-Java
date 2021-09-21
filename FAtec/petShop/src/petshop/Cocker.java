/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Cocker extends Cachorro {
    
    boolean tosa = true;

    public void setTosa(boolean t) {
        t = tosa;
    }
    
    void precisaTosa(){ 
    int x  = JOptionPane.showConfirmDialog(null,"O cachorro precisa de Tosa?", "Por favor selecione:",JOptionPane.YES_NO_OPTION);
    
     if(x == 1){
         tosa = false;
     }
     if (x == 0){
         tosa = true;
     }
     }
    
    
    
    
Cocker(){
 tosa = false;
}    
    
}

