/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04l03;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex04L03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    while(true){
            try{
                float p1, p2, t, m;
                JOptionPane.showMessageDialog(null, "Querido professor, informe as notas do aluno: ");
                p1 = Float.parseFloat(JOptionPane.showInputDialog("P1"));
                p2 = Float.parseFloat(JOptionPane.showInputDialog("P2"));
                t = Float.parseFloat(JOptionPane.showInputDialog("Trabalho"));
               
                m = (float) (p1*0.35 + p2*0.50 + t*0.15);
               
                JOptionPane.showMessageDialog(null, "Certo. Segue a média do aluno: "+m);
               
                break;
                //(P1*0.35 + P2*0.50 + T*0.15)
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERRO! Você digitou algo errado. Tente novamente.");
            }
        }
}
}
