/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02l03;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Ex02L03 {
public static long fib(int n){
        if(n <= 1) return n;
        else return fib(n-1) + fib(n-2);
    }

 

    public static void main(String[] args) {
        while(true){
            try{
                int n;
                String txt = "";

 

                n = Integer.parseInt(JOptionPane.showInputDialog("Informe o termo da sequência de Fibonacci: "));

 

                for(int i = 1; i<=n; i++){
                    txt += i+"= "+fib(i)+"\n";
                }
                JOptionPane.showMessageDialog(null, txt);
                break;
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "ERRO! Você digitiou algo errado. Tente Novamente.");
            }            
        }
    }
    
    
}
