/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02l02;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex02L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String num1 = JOptionPane.showInputDialog(null,"Digite o 1 numero");
        String num2 = JOptionPane.showInputDialog(null,"Digite o 2 numero");
        String num3 = JOptionPane.showInputDialog(null,"Digite o 3 numero");
        
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        
        if ( n1 >= n2 && n2 >= n3){
            JOptionPane.showMessageDialog(null," " + n3 +" "+ n2 +" " + n1);
            
        }
        else if (n1 >= n3 && n3 >= n2){
            JOptionPane.showMessageDialog(null," " + n2 +" "+ n3 +" " + n1);
       
        }
        else if (n2 >= n1 && n1 >= n3){
            JOptionPane.showMessageDialog(null," " + n3 +" "+ n1 +" " + n2);
     
        }
        else if (n2 >= n3 && n3 >= n1){
            JOptionPane.showMessageDialog(null," " + n1 +" "+ n3 +" " + n2);
     
        }
        else if (n3 >= n1 && n1 >= n2){
            JOptionPane.showMessageDialog(null," " + n2 +" "+ n1 +" " + n3);
     
        }
        else if (n3 >= n2 && n2 >= n1){
            JOptionPane.showMessageDialog(null," " + n1 +" "+ n2 +" " + n3);
    
        }  
        
    }
    
}
