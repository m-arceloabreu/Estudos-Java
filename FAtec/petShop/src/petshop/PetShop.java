/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class PetShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        Cocker co1 = new Cocker();
        co1.tipo = JOptionPane.showInputDialog(null, "Digite o tipo de animal:");
        co1.cor = JOptionPane.showInputDialog(null, "Digite a cor do animal:");
        co1.nome = JOptionPane.showInputDialog(null,"Digite o nome do cachorro: ");
        co1.raca = JOptionPane.showInputDialog(null, "Digite a raca do animal: ");
        co1.precisaTosa();
        
        
        JOptionPane.showMessageDialog(null, "Tipo: " + co1.tipo + " Cor: " + co1.cor + " Raça: " + co1.raca + " Nome: " + co1.nome + " Precisa de tosa?" + co1.tosa);
        
    }
}
