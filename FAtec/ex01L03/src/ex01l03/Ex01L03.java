/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01l03;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex01L03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    while(true){
       try{
           int num1, num2, par, div,i ;
           String resp = "";
           

           num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o inicio do Intervalo"));
           num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o final do intervalo"));
           
           for(i = num1; i<= num2; i++){
                if( i%2 == 0){
                  resp += i + " ";
                };
               
           }
      JOptionPane.showMessageDialog(null,resp);
       break;}
       catch(Exception e){
           JOptionPane.showMessageDialog(null,"Algo deu errado, tente novamente.");
       }
    
    }
    
    }
    
}
