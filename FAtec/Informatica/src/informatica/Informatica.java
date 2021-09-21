/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informatica;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Informatica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i,q;
        double v, vt;
        String d;
        
        
        i = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o numero do item: "));
        q = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a quantidade do item: "));
        v = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor do item: R$ "));
        d = JOptionPane.showInputDialog(null,"Digite a descrição do Item: "); 
        
        Fatura fat = new Fatura(i,q,v,d);
        
      
        fat.getFaturaTotal();
        
        
        JOptionPane.showMessageDialog(null,"***Valor Total: R$ " + fat.faturaTotal + "***" + "\n Numero do Item: " + i + "\n Descrição: "+ d +"\n Quantidade: "+ q + "\n Valor Unitário: R$ " + v);
        
    }
    
}
