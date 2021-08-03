/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float r, altura,vol;
        double pi;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("**Cálculo do Volume de uma lata de óleo**");
        System.out.println("Digite o valor do RAIO da base da lata em cm: ");
        r = input.nextFloat();
        System.out.println("Digite o valor da ALTURA da lata em cm: ");
        altura = input.nextFloat();
        
        pi = 3.14159;
        
        vol = (float) (pi * Math.pow(r,2) * altura);
        
        System.out.printf("O valume da lata é de: %.5f cm2", vol);
    }
    
}
