/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04l04;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex04L04 {

    /**
     * @param args the command line arguments
     */
    
    static double conversor (int a){
    double pi = 3.1415; 
    double b;
     b = (a * pi/180);
     
     return b;
    }
    public static void main(String[] args) {
        // TODO code application logic here
         while(true){
            try{
        int graus = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor em graus: "));
        
        conversor(graus);
        JOptionPane.showMessageDialog(null,graus + " graus = " + conversor(graus) + " radianos");
            
            break;
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,"Algo deu errado, tente novamente");
            }
         }
         }
    
    
}
