/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01l07;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex01L07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double n1, n2, n3;
        Superior CS = new Superior();
        Tecnico CT = new Tecnico ();
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota da P1"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota da P2"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a nota dos Trabalhos"));
        
        CS.setNotas(n1,n2,n3);
        JOptionPane.showMessageDialog(null,"Segue a média das notas: "+CS.getMedia());
        
        n1 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 1º trimestre"));
        n2 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 2º trimestre"));
        n3 = Float.parseFloat(JOptionPane.showInputDialog("Informe a nota do 3º trimestre"));
       
        CT.setNotas(n1, n2, n3);
        JOptionPane.showMessageDialog(null,"Segue a média dos trimestres: "+CT.getMedia());  
    }
    
}
