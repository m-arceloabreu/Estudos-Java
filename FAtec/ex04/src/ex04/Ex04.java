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
      float c, f;
      
      Scanner input = new Scanner(System.in);
      
      System.out.println("Digite a temp em  graus Celcius: ");
      c = input.nextFloat();
      f = (9*c + 160 )/5;
      
      System.out.printf("Essa temp em graus F é: %.1f", f);
      
      
      
    }
    
}
