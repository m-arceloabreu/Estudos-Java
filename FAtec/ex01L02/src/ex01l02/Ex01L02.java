/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01l02;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex01L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor;
        float n;
    
       
        valor = JOptionPane.showInputDialog("Informe o valor: ");
        n = Float.parseFloat(valor);
        n = n%3;
        if(n == 0)
            JOptionPane.showMessageDialog(null, "O número informado é multiplo de 3");
        else
            JOptionPane.showMessageDialog(null, "O número informado não é multiplo de 3");
    }
    
}
