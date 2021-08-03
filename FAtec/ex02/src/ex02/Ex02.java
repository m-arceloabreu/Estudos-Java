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
        float sal, salmin,qtd;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor do seu Salário: R$");
        sal = input.nextFloat();
        
        System.out.println("Digite o valor do SALARIO MINIMO: R$");
        salmin = input.nextFloat();
        
        qtd = sal/salmin ;
        
        System.out.printf("\n Você recebe: %.2f  salários mínimos. \n",qtd);
        
    }
    
}
