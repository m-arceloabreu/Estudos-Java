/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03l03;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex03L03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             while(true){
            try{
                int n1, n2, tot=0;
                String txt = "";
                
                n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor inicial do intervalo: "));
                n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor final do intervalo: "));  
                
                for(int i=n1; i<=n2; i++){
                    for(int c=1; c<=i;c++){                        
                        if(i%c == 0) tot++;    
                       
                    }
                    if(tot==2){ 
                        txt += i + " ";
                     }
                    tot = 0;
                }                
                JOptionPane.showMessageDialog(null, txt);
                break;
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERRO! Algo deu errado. Tente novamente.");
            }
        }
    }
}
   
    
    

