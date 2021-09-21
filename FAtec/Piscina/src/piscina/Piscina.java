/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piscina;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Piscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        boolean piscina = JOptionPane.showConfirmDialog(null,"Usuario tem Piscina?", JOptionPane.YES_NO_OPTION);
        Piscina(piscina);
    }
    static void Piscina(boolean comparador) {
        System.out.print("Piscina: ");
        if(comparador == true) {
            System.out.println("O Iate tem piscina.");
        }else {
            System.out.println("O Iate não tem piscina.");
        }
    }
    
}
