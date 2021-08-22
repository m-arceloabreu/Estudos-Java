/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeropernas;

import java.util.Scanner;

/**
 *
 * @author marcelo
 */
public class NumeroPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o numero de pernas");
        int pernas = teclado.nextInt();
        String tipo;
switch (pernas){
    case 1:
        tipo = "Saci";
        break;
case 2:
        tipo = "Bípede";
        break;
case 4:
        tipo = "quadrupede";
        break;
case 6:
tipo = "aranha";
break;
default:
tipo = "et";
}
System.out.println(tipo);

    }
    
}
