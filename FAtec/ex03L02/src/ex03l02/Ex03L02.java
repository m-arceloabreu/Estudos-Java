/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03l02;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex03L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              
        double lucro;
        String valor = JOptionPane.showInputDialog(null, "Qual o valor do produto?");
       
        double valor2 = Float.parseFloat(valor);
        if(valor2 >=20){
            lucro = valor2 * 1.3;
        }else {
            lucro = valor2 * 1.45;
        }
       
        JOptionPane.showMessageDialog(null,"O valor da venda é: "+lucro,"VENDA",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
