/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex001;



import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class Ex001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valor, valordesc;
        String nome;
        
        
       Scanner input = new Scanner(System.in);
       System.out.println("Digite o Nome do produto: ");
       nome = input.nextLine();
       
       System.out.println("Digite o valor do produto em R$: ");
       valor = input.nextFloat();
       valordesc = valor - (valor*0.09);
       

       
       
       
       System.out.printf("Produto: %s",nome);
       System.out.printf("\nValor:R$ %.2f",valor);
       System.out.printf("\nValor com desconto:R$ %.2f",valordesc);
    }
    
}
