/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Ex02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float sal_min, sal, div;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Digite o salário mínimo:");
        sal_min = input.nextFloat();
        System.out.println("Digite o salário:");
        sal = input.nextFloat();
        div = sal/sal_min;
        System.out.printf("Você ganha %.2f salário(s) mínimo(s)\n", div);
    }
    
}
