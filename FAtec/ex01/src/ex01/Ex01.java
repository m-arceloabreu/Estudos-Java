/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Ex01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valor, desconto;       
        Scanner imput = new Scanner(System.in);
       
        System.out.print("\nDigite o valor para receber um desconto de 9%: ");
        valor = imput.nextFloat();
       
        desconto = (float) (valor - (valor*0.09));
       
        System.out.printf("\nCerto. Segue o valor com desconto: %2f", desconto);
    }
    
}
