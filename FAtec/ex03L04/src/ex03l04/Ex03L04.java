/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03l04;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex03L04 {

    /**
     * @param args the command line arguments
     */
      static int produto(int a, int b){
        int produto;
        produto = a* b;
        
        return produto;
      }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
        while(true){
            try{
        int v1, v2;
        v1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));
        v2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
        
        produto(v1,v2);
        JOptionPane.showMessageDialog(null,"O produto é: "+ produto(v1,v2));
            break;
            }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Algo deu errado, tente novamente");
        }
        }
    }
    
}
