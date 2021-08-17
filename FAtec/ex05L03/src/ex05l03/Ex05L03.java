/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05l03;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex05L03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String valor,valor1, txt="";
        try{
        valor = JOptionPane.showInputDialog(null, "Digite o limite:");
        valor1 = JOptionPane.showInputDialog(null, "Digite o incremento:");
        int valor2 = Integer.parseInt(valor);
        int valor3 = Integer.parseInt(valor1);
            for(int i=0;i<=valor2; i+=valor3){
            txt += i + " ";
            
            }
        JOptionPane.showMessageDialog(null,"A sequência é: "+txt,"NUMEROS",JOptionPane.INFORMATION_MESSAGE);

 

        }
        catch(Exception e){
         JOptionPane.showMessageDialog(null,"Algo deu errado, tente novamente","NUMEROS",JOptionPane.INFORMATION_MESSAGE);

 

        }
    }
    
}
