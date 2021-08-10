/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05l02;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex05L02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome = JOptionPane.showInputDialog(null,"Digite seu nome!");
        String idade = JOptionPane.showInputDialog(null,"Digite sua idade");
        int ida = Integer.parseInt(idade);
        
        if (ida <=10){
            
            JOptionPane.showMessageDialog(null,nome + " Seu plano é no valor: R$ 30,00");
        }
        else if (ida > 10 && ida <= 29){
            
            JOptionPane.showMessageDialog(null,nome + "Seu plano é no valor: R$ 60,00");
        }
        else if (ida > 29 && ida <= 45 ){
           
            JOptionPane.showMessageDialog(null,nome + "Seu plano é no valor: R$ 120,00");
        }
        else if (ida > 45 && ida <= 59 ){
            
            JOptionPane.showMessageDialog(null,nome + "Seu plano é no valor: R$ 150,00");
        }
        else if (ida > 59 && ida <= 65 ){
           
            JOptionPane.showMessageDialog(null,nome + "Seu plano é no valor: R$ 250,00");
        }
        else if (ida > 65 ){
            
            JOptionPane.showMessageDialog(null,nome + "Seu plano é no valor: R$ 400,00");
        }
    }
    
}
