/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dm20212m.view.manterpet;

import dm20212m.controller.ControlePet;
import dm20212m.model.bean.Pet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class ManterPet {
        public static void montarTela(){     
            int ops = Integer.parseInt(JOptionPane.showInputDialog("Inserir Pet = 1, Listar Pet= 2, Buscar Pet = 3, Alterar Pet = 4, Excluir Pet = 5"));
            
            if( ops == 1){
            inserir();
            }
        if( ops == 2){
            listar();
        }
        if( ops == 3){
            buscar();
        }
        if( ops == 4){
            alterar();
        }
        if( ops == 5){
            excluir();
        }
            
            
        }
        public static void inserir(){
            JOptionPane.showMessageDialog(null, "INSERIR PET");
            
            String nomePet = JOptionPane.showInputDialog("ENTRE COM O NOME");
            String idadePet = JOptionPane.showInputDialog("ENTRE COM IDADE");
            String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
            
            Pet animal = new Pet(0, nomePet, idadePet, tipo);
            ControlePet contPet = new ControlePet();
            animal =  contPet.inserir(animal);
            JOptionPane.showMessageDialog(null,"Pet = " + animal.toString());
        }
        public static void listar(){
            JOptionPane.showMessageDialog(null, "LISTAR PET");
            String nome = JOptionPane.showInputDialog("Entre com o nome do Pet");
            
            Pet animal = new Pet(nome);
            ControlePet contPet = new ControlePet();
            List<Pet> listaP = contPet.listar(animal);
            
           listaP.forEach ((animalL)->{
               JOptionPane.showMessageDialog(null,animalL.toString());
           });
            
        }
        public static void buscar(){
            JOptionPane.showMessageDialog(null,"Buscar PET");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID PET"));
            
            Pet animal = new Pet(id);
            ControlePet contPet = new ControlePet();
            animal = contPet.buscar(animal);
            
            JOptionPane.showMessageDialog(null,"PET = " + animal.toString());
        
        }
        public static void alterar(){
            JOptionPane.showMessageDialog(null,"Alterar PET");
            int id = Integer.parseInt(JOptionPane.showInputDialog("Entre como o ID PET"));
            String nome = JOptionPane.showInputDialog("ENTRE COM O NOME");
            String idade = JOptionPane.showInputDialog("ENTRE COM IDADE");
            String tipo = JOptionPane.showInputDialog("ENTRE COM O TIPO");
            
            Pet animal = new Pet(id, nome, idade, tipo);
            ControlePet contPet = new ControlePet();
            animal = contPet.buscar(animal);
            JOptionPane.showMessageDialog(null,"PET = " + animal.toString());
            
        }
        
        public static void excluir(){
            JOptionPane.showMessageDialog(null, "EXCLUIR PET");
            int id = Integer.parseInt(JOptionPane.showInputDialog("ENTRE COM O ID PET"));
            
            Pet animal = new Pet(id);
            ControlePet contPet = new ControlePet();
            animal = contPet.excluir(animal);
            JOptionPane.showMessageDialog(null,"Pet = " + animal.toString());
            
        
        }
}
