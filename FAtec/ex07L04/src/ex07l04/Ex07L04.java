/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07l04;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex07L04 {

    /**
     * @param args the command line arguments
     */
    
   static int fatorial (int a){
    int fat = 1;
     
        
        for(int i = 2; i <= a ;i++){
        fat *= i;
        
        }
   return fat;
   
   }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        while(true){
    try{
        int valor;
        valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor para saber o fatorial: "));
        
        fatorial (valor);
       JOptionPane.showMessageDialog(null,"O fatorial é: "+ fatorial(valor));
        
    break;
    }
    
    catch(Exception e){
        JOptionPane.showMessageDialog(null,"Erro, tente novamente");
    }
        
    }
    
}
}
