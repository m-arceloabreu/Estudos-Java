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
        float volume, raio, altura;        final float pi = (float) 3.14159;
        Scanner input = new Scanner(System.in);
       
        System.out.println("Digite o raio:");
        raio = input.nextFloat();
        System.out.println("Digite a altura:");
        altura = input.nextFloat();
        volume = (float) (pi * Math.pow(raio, 2)* altura);
        System.out.printf("O volume é %.3f\n", volume);

    }
    
}
