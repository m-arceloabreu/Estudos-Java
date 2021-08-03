/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float valorC, valorF;
        Scanner imput = new Scanner(System.in);
       
        System.out.print("\nInforme um valor em graus centigrados para ser convertido em graus fahrenheit: ");
        valorC = imput.nextFloat();
       
        valorF = ((9 * valorC + 160) / 5);
       
        System.out.printf("\nSegue o valor %2f em fahrenheit: %2f", valorC, valorF);
    }
    
}
