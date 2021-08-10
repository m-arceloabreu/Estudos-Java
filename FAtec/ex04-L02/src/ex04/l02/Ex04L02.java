/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04.l02;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex04L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String idade = JOptionPane.showInputDialog(null,"Digite sua idade");
        int ida = Integer.parseInt(idade);
        
        
        
        if (ida < 16){
            JOptionPane.showMessageDialog(null,"Você não tem idade para votar");
        }
        else if (ida < 18 || ida > 65){
            JOptionPane.showMessageDialog(null,"Seu voto é opcional");
        }
        else{
            JOptionPane.showMessageDialog(null,"VOTO OBRIGATÓRIO");
        }
        
    }
    
}
